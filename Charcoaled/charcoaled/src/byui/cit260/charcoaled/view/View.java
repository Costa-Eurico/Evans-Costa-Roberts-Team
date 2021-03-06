/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import charcoaled.Charcoaled;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ih8pcs
 */
public abstract class View implements ViewInterface {
    
    /**
     *
     */
    public String promptMessage;
    public final BufferedReader keyboard = Charcoaled.getInFile();
    public final PrintWriter console = Charcoaled.getOutFile();
    
    @Override
    public void display() {
        
        char selection;
        do {
            
            this.console.println(this.promptMessage); //display main menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
        } while (Character.toLowerCase(selection) != 'x'); // a selection is not "Exit"
    }

    @Override
    public String getInput() {
        boolean valid = false; //indicates if name has been retrieved
        String playerInput = null;

        while (!valid) { try {
            //while valid name has not been retrieved
            playerInput = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            playerInput = playerInput.trim();
            
            //if the name is invalid (< 1 characters)
            if (playerInput.length() < 1) {
                ErrorView.display(this.getClass().getName(), "Invalid request - please enter one of Main Menu Options");
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
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection, please try again. ***");
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
