/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.GameControl;
import charcoaled.Charcoaled;
import exception.MapControlException;
import java.util.Scanner;
import java.io.Serializable;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            case 'n': {
            try {
                //create and start new game
                this.startNewGame();
            } catch (MapControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 'g': //get and start an existing game
                this.displaySavedGamesMenu();
                break;
            case 'h': //display help menu
                this.displayHelpMenu();
                break;
            case 's':
                this.initialiseHighScores();
                break;
            case 'x': //exit the program
                creditsView();
                return;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
        
        
    }

    private void startNewGame() throws MapControlException {
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
    }
    
    public static void highScoresHighLow() {
        int[] highScores = new int[] {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        
        System.out.println("**********HIGH SCORES**********");
        Arrays.sort(highScores);
        
        for(int i=highScores.length-1; i>=0; i--){
            System.out.println(highScores[i]);
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

    private void displaySavedGamesMenu() {
        SavedGamesMenuView savedGamesMenu = new SavedGamesMenuView();
        savedGamesMenu.display();
    }
}