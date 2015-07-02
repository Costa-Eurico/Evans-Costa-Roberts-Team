/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import byui.cit260.charcoaled.model.Player;
import charcoaled.Charcoaled;
import exception.ProgramControlException;

/**
 *
 * @author ih8pcs
 */
public class ProgramControl {

    public static Player createPlayer(String playersName)
                            throws ProgramControlException{
        
        if (playersName == null) {
            throw new ProgramControlException("Unable to find Players Name");
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        Charcoaled.setPlayer(player); //save the player
        createListOfSavedGames();
        
        return player;
    }
    
    private static void createListOfSavedGames(){
        Charcoaled.setSavedGamesList(getSortedSavedGamesList());
    }
    
    private static String[] loadGamesList() {
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

    private static String[] getSortedSavedGamesList() {
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
