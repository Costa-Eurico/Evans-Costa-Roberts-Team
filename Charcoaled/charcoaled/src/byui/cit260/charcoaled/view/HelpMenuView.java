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
 * @author eucosta
 */
public class HelpMenuView {
    
    private final String MENU = "\n"
            + "\n*************************************"
            + "\n | Help Menu                        |"
            + "\n*************************************"
            + "\n O - What is the objective of the game (how to win)?"
            + "\n M - How to move between doors and floors?"
            + "\n D - What are the differences between each difficulty level?"
            + "\n R - Return to the main menu";
            
    
    public void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU); //display help menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
        } while (Character.toLowerCase(selection) != 'r'); // a selection is not "return to main menu"
    }

    private String getInput() {
        boolean valid = false; //indicates if name has been retrieved
        String playerInput = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while (!valid) { //while valid name has not been retrieved
            
            //prompt for player's name
            System.out.println("Enter choice from the Help Menu:");
            
            //get the name from the keyboard and trim off blanks
            playerInput = keyboard.nextLine();
            playerInput = playerInput.trim();
            
            //if the name is invalid (< 1 characters)
            if (playerInput.length() < 1) {
                System.out.println("Invalid request - please enter one of the Help Menu Options");
                continue; //and repeat again
            }
            break; // out of the repetition
        }
        
        return playerInput; //return name
    }

    private void doAction(char choice) {
        
        switch (Character.toLowerCase(choice)) {
            case 'o': //display game objective
                this.displayGameObjective();
                break;
            case 'm': //how to move around the game
                this.displayMoveInstructions();
                break;
            case 'd': //differences between levels of difficulty
                this.displayDiffLevelsOfDifficulty();
                break;
            case 'r': //return to main menu
                return;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
    }

    private void displayGameObjective() {
        System.out.println("*** displayGameObjective function called ***");
    }

    private void displayMoveInstructions() {
        System.out.println("*** displayMoveInstructions function called ***");
    }

    private void displayDiffLevelsOfDifficulty() {
        System.out.println("*** displayDiffLevelsOfDifficulty function called ***");
    }
    
}
