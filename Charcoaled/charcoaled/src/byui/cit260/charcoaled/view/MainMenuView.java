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
            + "\n G - Get and start saved game"
            + "\n S - Save Game"
            + "\n H - Help Menu"
            + "\n I - High Scores"
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
                this.startSavedGame();
                break;
            case 's': //get and start an existing game
                this.saveGame();
                break;
            case 'h': //display help menu
                this.displayHelpMenu();
                break;
            case 'i':
                this.initialiseHighScores();
                break;
            case 'x': //exit the program
                creditsView();
                return;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection, please try again. ***");
                break;
        }
        
        
    }

    private void startNewGame() throws MapControlException {
        //create new game
        GameControl.createNewGame(Charcoaled.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView(Charcoaled.getPlayer());
        gameMenu.display();
    }
    
    public void initialiseHighScores() {
        int[] highScores = new int[] {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};

        this.console.println("**********HIGH SCORES**********");
        
        // sort array from highest value to lowest
        int sum = 0;
        int average = 0;
        int counter = 1;
        for (int count : highScores) {
            this.console.println(counter + ": " + count + " points");
            counter = counter + 1;
            sum = sum + count;
            average = sum / highScores.length;
        }
        this.console.println("Sum: " + sum + " points");
        this.console.println("Average score: " + average + " points");
        this.console.println("High score: ");
        this.console.println("Low score: ");  
    }
    
    public void highScoresHighLow() {
        int[] highScores = new int[] {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        
        this.console.println("**********HIGH SCORES**********");
        Arrays.sort(highScores);
        
        for(int i=highScores.length-1; i>=0; i--){
            this.console.println(highScores[i]);
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

    private void startSavedGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game is located");
        
        String filePath = this.getInput();
        
        try{
            //start a saved game
            GameControl.getSavedGame(filePath);
        }
        catch (Exception e){
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView(Charcoaled.getPlayer());
        gameMenu.display();
    }

    private void saveGame() {
        //promtp the user for and get the name of the file to same the game in
        this.console.println("\n\nEnter the file path for the file where the game is to be saved.");
        String filePath = this.getInput();
        
        try{
            //save the game to the specified file
            GameControl.saveGame(Charcoaled.getCurrentGame(), filePath);
        }
        catch(Exception ex){
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }
}