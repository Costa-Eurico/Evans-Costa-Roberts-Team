/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.GameControl;
import charcoaled.Charcoaled;
import java.util.Scanner;
import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author ih8pcs
 */
public class MainMenuView extends View {

    public MainMenuView() {
        promptMessage = "\n"
            + "\n******************************************************************"
            + "\n| Main Menu                                                      |"
            + "\n******************************************************************"
            + "\n N - New Game"
            + "\n G - Saved Game"
            + "\n H - Help Menu"
            + "\n S - High Scores"
            + "\n X - Exit Game";
           } 
    
    @Override
    public void doAction(char choice) {
        
        switch (Character.toLowerCase(choice)) {
            case 'n': //create and start new game
                this.startNewGame();
                break;
            case 'g': //get and start an existing game
                this.startExistingGame();
                break;
            case 'h': //display help menu
                this.displayHelpMenu();
                break;
            case 'x': //exit the program
                creditsView();
                return;
            case 's':
                this.initialiseHighScores();
                break;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
        
        
    }

    private void startNewGame() {
        //create new game
        GameControl.createNewGame(Charcoaled.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView(Charcoaled.getPlayer());
        gameMenu.display();
    }
    
    public static void initialiseHighScores() {
        int[] highScores = new int[] {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};

        System.out.println("**********HIGH SCORES**********");
        
        // sort array from highest value to lowest
        int sum = 0;
        int average = 0;
        int counter = 1;
        for (int count : highScores) {
            System.out.println(counter + ": " + count + " points");
            counter = counter + 1;
            sum = sum + count;
            average = sum / highScores.length;
        }
        System.out.println("Sum: " + sum + " points");
        System.out.println("Average score: " + average + " points");
        System.out.println("High score: ");
        System.out.println("Low score: ");
        
        
        //for (int i = 0; i < highScores.length; i++)
        
            
        //System.out.println(i+1 + ". " + highScores[i]);
        
          
    }
    
    public static void highScoresHighLow() {
        int[] highScores = new int[] {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        
        System.out.println("**********HIGH SCORES**********");
        
        Arrays.sort(highScores);
        
        for(int i=highScores.length-1; i>=0; i--){

        System.out.println(highScores[i]);
        }
        
    }
    

    
    
    private void startExistingGame() {
        String successMsg = "Successfully loaded game ";
        String errorMsg = "Error";
        String fileName;
        Scanner input = new Scanner(System.in);
 
        System.out.println("Please enter your saved filename.txt : ");
        fileName = input.next(); // getting a String value
        
        if (fileName.length() <= 1) {
            System.out.println(errorMsg + " filename must be at least 2 characters");
            int i = 0;
            while (i < 10) {
                System.out.println("You have " + i + " of 10 attempts remaining");
                i++;
            }
        } else {
            System.out.println(successMsg);
            
            GameMenuView gameMenu = new GameMenuView(Charcoaled.getPlayer());
            gameMenu.display();
        }
    }
    
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private String displayPlayerHighScore() {
        return "*** called displayPlayerHighScore() ***";
    }
 
    private void creditsView() {
        CreditsView credits = new CreditsView();
        credits.display();
    }
    
}


