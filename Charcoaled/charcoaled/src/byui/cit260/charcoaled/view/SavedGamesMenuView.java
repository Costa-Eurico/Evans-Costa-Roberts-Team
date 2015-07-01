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
        String[] gamesList = this.getSortedSavedGamesList();
        
        for(String game: gamesList){
            System.out.println(game);
        }
      
        // TODO: enter code to allow selection of a game
//        BEGIN
//            FOR index = 0 TO list.length-1
//                IF ( list[index] = = value) THEN
//                    RETURN index ENDIF
//            ENDFOR
//            RETURN -1 
//        END
    }

    private String[] loadGamesList() {
        //TODO: To be implemented when IO has been addressed in this class
        // this function will load the list of games from a file or default 
        // game folder location
        
        String[] gamesList = new String[10];
        
        gamesList[0] = "My saved game 9";
        gamesList[1] = "My saved game 5";
        gamesList[2] = "My saved game 2";
        gamesList[3] = "My saved game 10";
        gamesList[4] = "My saved game 3";
        gamesList[5] = "My saved game 8";
        gamesList[6] = "My saved game 1";
        gamesList[7] = "My saved game 7";
        gamesList[8] = "My saved game 4";
        gamesList[9] = "My saved game 6";

        return gamesList;  
    }

    private String[] getSortedSavedGamesList() {
        // get saved games list for the current game
        String[] originalSavedGamesList = loadGamesList();
        
        // clone (make a copy) originalList
        String[] savedGamesList = originalSavedGamesList.clone();
        
        // using a BubbleSort to sort the list of saved games by name
        String tempSavedGame;
        for (int i = 0; i < savedGamesList.length-1; i++) {
            for (int j = 0; j < savedGamesList.length-1-i; j++) {
                if (savedGamesList[j].compareToIgnoreCase(savedGamesList[j + 1]) > 0) {
                    tempSavedGame = savedGamesList[j];
                    savedGamesList[j] = savedGamesList[j+1];
                    savedGamesList[j+1] = tempSavedGame;
                }
            }
        }
        return savedGamesList;
    }
}
