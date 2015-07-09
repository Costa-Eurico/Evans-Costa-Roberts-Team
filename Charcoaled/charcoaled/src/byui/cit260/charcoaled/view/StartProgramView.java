/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.ProgramControl;
import byui.cit260.charcoaled.model.Player;
import exception.ProgramControlException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ih8pcs
 */
public class StartProgramView extends View{
    
    public StartProgramView(){
        promptMessage = "Enter the player's name below:";
    }
    
    public void startProgram () throws ProgramControlException {
        
        // display banner screen
        this.displayBanner();
        
        //prompt player to enter name-Retrieve name of play
        String playersName = this.getInput();
        
        //create and save player object
        Player player = ProgramControl.createPlayer(playersName);
        
        //display personalized welcome message
        this.displayWelcomeMessage(player);
        
        //display main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
        
    }
    
    private void displayLogo(){
        this.console.println("   (        )                                   (            (     ");
        this.console.println("   )\\    ( /(      )   (                    )   )\\     (     )\\ )  ");
        this.console.println(" (((_)   )\\())  ( /(   )(     (     (    ( /(  ((_)   ))\\   (()/(  ");
        this.console.println(" )\\___  ((_)\\   )(_)) (()\\    )\\    )\\   )(_))  _    /((_)   ((_)) ");
        this.console.println("((/ __| | |(_) ((_)_   ((_)  ((_)  ((_) ((_)_  | |  (_))     _| |  ");
        this.console.println(" | (__  | ' \\  / _` | | '_| / _|  / _ \\ / _` | | |  / -_)  / _` |  ");
        this.console.println("  \\___| |_||_| \\__,_| |_|   \\__|  \\___/ \\__,_| |_|  \\___|  \\__,_|  ");
    }

    public void displayBanner() {
        this.console.println("\n******************************************************************");
        this.displayLogo();
        this.console.println("\nWelcome to Charcoaled\n"
                +"\nThere is a large apartment complex on fire and as a firefighter"
                +"\nyou are required to save the people before the building burns "
                +"\nto the ground.");
        
        this.console.println("\nCan you overcome the obstacles and save everyone before time runs"
                +"\nout?"
                +"\n\nThe people need you, work fast or you might end up"
                +"\n\n...CHARCOALED.");
        
        this.console.println("\n******************************************************************");
    }

    @Override
    public String getInput() {
        boolean valid = false; //indicates if name has been retrieved
        String playersName = null;

        
        while (!valid) { //while valid name has not been retrieved
            
            //prompt for player's name
            this.console.println("Enter the player's name below:");
            
            try {
                //get the name from the keyboard and trim off blanks
                playersName = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
            }
            playersName = playersName.trim();
            
            //if the name is invalid (< 2 characters)
            if (playersName.length() < 2) {
                this.console.println("Invalid name - the name must be at least two characters");
                continue; //and repeat again
            }
            break; // out of the repetition
        }
        
        return playersName; //return name
    }

    public void displayWelcomeMessage(Player player) {
        this.console.println("\n\n******************************************************************");
        this.console.println("\t Welcome " + player.getName() + "!");
        this.console.println("\t Work quickly, save the people and avoid the fire!");
        this.console.println("\t You have seven minutes before you're...Charcoaled.");
        this.console.println("******************************************************************");
    }
}
