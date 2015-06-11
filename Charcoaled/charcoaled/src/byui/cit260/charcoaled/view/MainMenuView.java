/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.GameControl;
import byui.cit260.charcoaled.model.Game;
import charcoaled.Charcoaled;
import java.util.Scanner;

/**
 *
 * @author ih8pcs
 */
public class MainMenuView {

    public MainMenuView() {
    }

    private final String MENU = "\n"
            + "\n******************************************************************"
            + "\n| Main Menu                                                      |"
            + "\n******************************************************************"
            + "\n N - New Game"
            + "\n G - Saved Game"
            + "\n H - Help Menu"
            + "\n S - Save Game"
            + "\n X - High Scores"
            + "\n E - Exit Game";
            
    
    public void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU); //display main menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
        } while (Character.toLowerCase(selection) != 'e'); // a selection is not "Exit"
    }

    private String getInput() {
        boolean valid = false; //indicates if name has been retrieved
        String playerInput = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while (!valid) { //while valid name has not been retrieved
            
            //prompt for player's name
            System.out.println("Enter choice from Main Menu:");
            
            //get the name from the keyboard and trim off blanks
            playerInput = keyboard.nextLine();
            playerInput = playerInput.trim();
            
            //if the name is invalid (< 1 characters)
            if (playerInput.length() < 1) {
                System.out.println("Invalid request - please enter one of Main Menu Options");
                continue; //and repeat again
            }
            break; // out of the repetition
        }
        
        return playerInput; //return name
    }

    private void doAction(char choice) {
        
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
            case 's': //save current game
                this.saveGame();
                break;
            case 'e': //exit the program
                return;
            case 'x':
                this.highScores();
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
        
        
    }

    private void startNewGame() {
        //create new game
        GameControl.createNewGame(Charcoaled.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    private void highScores() {
        String[] highScorePlayer = new String[10];
        String returnToMainMenu = "Press 'R' to return to Main Menu";
        int i = 0;
        do {
            System.out.println("\n " + i + ". " + highScorePlayer[i]);
            i++;
        } while (i < 10);
        /*
        String highScoreList = "\n"
        + "\n******************************************************************"
        + "\n| High Scores                                                    |"
        + "\n******************************************************************"
        + "\n 1. " + highScorePlayer[0]
        + "\n 2. " + highScorePlayer[1]
        + "\n 3. " + highScorePlayer[2]
        + "\n 4. " + highScorePlayer[3]
        + "\n 5. " + highScorePlayer[4]
        + "\n 6. " + highScorePlayer[5]
        + "\n 7. " + highScorePlayer[6]
        + "\n 8. " + highScorePlayer[7]
        + "\n 9. " + highScorePlayer[8]
        + "\n 10. " + highScorePlayer[9]
        + returnToMainMenu;
        */
        System.out.println(returnToMainMenu);
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
        }

    
    }
    

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void saveGame() {
        //System.out.println("*** saveGame function called ***"); 
        String gameName; 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input name to save your game."); 
        gameName = input.next(); // getting a String value
        
        if (gameName.length() <= 1) {
            System.out.println("Game name must be at least 2 characters");
        }
        else{
           System.out.println(gameName +" will be the name of your saved game"); 
        }
    }

    }
