/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.GameControl;
import charcoaled.Charcoaled;
import java.util.Scanner;

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
                this.highScores();
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
    
    private void highScores() {
        int i = 1;
        do {
            System.out.println("\n " + i + ". " + displayPlayerHighScore());
            i++;
        } while (i <= 10);
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


