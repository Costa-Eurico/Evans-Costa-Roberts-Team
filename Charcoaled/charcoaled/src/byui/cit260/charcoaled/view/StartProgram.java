/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.ProgramControl;
import byui.cit260.charcoaled.model.Player;
import java.util.Scanner;

/**
 *
 * @author ih8pcs
 */
public class StartProgram {
    
    public StartProgram(){
        
    }
    
    public void startProgram () {
        
        // display banner screen
        this.displayBanner();
        
        //prompt player to enter name-Retrieve name of play
        String playersName = this.getPlayersName();
        
        //create and save player object
        Player player = ProgramControl.createPlayer(playersName);
        
        //display personalized welcome message
        this.displayWelcomeMessage(player);
        
        //display main menu
        MainMenu mainMenu = new MainMenu();
        mainMenu.displayMenu();
        
    }

    public void displayBanner() {
        System.out.println("\n******************************");
        
        System.out.println("\n Welcome to Charcoaled"
                +"\n There is a large apartment complex on fire and as a"
                +"\nfirefighter you are required to save the people before"
                +"\nthe building burns to the ground.");
        
        System.out.println("\nCan you overcome the obstacles and save everyone"
                +"\n...all before time runs out?"
                +"\n The people need you, work fast or you might end up"
                +"\n...CHARCOALED.");
        
        System.out.println("\n****************************");
    }

    public String getPlayersName() {
        boolean valid = false; //indicates if name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while (!valid) { //while valid name has not been retrieved
            
            //prompt for player's name
            System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard and trim off blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            //if the name is invalid (< 2 characters)
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must be at least two characters");
                continue; //and repeat again
            }
            break; // out of the repetition
        }
        
        return playersName; //return name
    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n******************************");
        System.out.println("\t Welcome " + player.getName() + "!");
        System.out.println("\t Work quickly, save the people and avoid the fire!");
        System.out.println("\t You have seven minutes before you're...Charcoaled.");
        System.out.println("******************************");
    }
}
