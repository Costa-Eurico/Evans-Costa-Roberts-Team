/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.GameControl;
import byui.cit260.charcoaled.model.InventoryItem;
import charcoaled.Charcoaled;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author eucosta
 */
public class SavedGamesMenuView extends View {

    public SavedGamesMenuView() {
        promptMessage = "\n"
            + "\n******************************************************************"
            + "\n|  Saved Games Menu                                              |"
            + "\n******************************************************************"
            + "\n v - View Saved Games"
            + "\n G - Enter Path to Saved Game on a Different Location"
            + "\n X - Return to Main Menu";
           } 
    
    @Override
    public void doAction(char choice) {
        
        switch (Character.toLowerCase(choice)) {
            case 'v': //create and start new game
                this.viewSavedGamesList();
                break;
            case 'g': //get and start an existing game from a different location
                this.startExistingGame();
                break;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
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

    private void viewSavedGamesList() {
        String[] gamesList = Charcoaled.getSavedGamesList();
        
        for(String game: gamesList){
            System.out.println(game);
        }
    }
}