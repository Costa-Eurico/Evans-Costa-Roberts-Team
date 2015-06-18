/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import java.util.Scanner;

/**
 *
 * @author ih8pcs
 */
public abstract class View implements ViewInterface {
    
    /**
     *
     */
    public String promptMessage;
    
    @Override
    public void display() {
        
        char selection;
        do {
            
            System.out.println(this.promptMessage); //display main menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
        } while (Character.toLowerCase(selection) != 'x'); // a selection is not "Exit"
    }

    @Override
    public String getInput() {
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

    /**
     *
     * @param choice
     */
    @Override
    public void doAction(char choice) {
        
        switch (Character.toLowerCase(choice)) {
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
        
        
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    
}
