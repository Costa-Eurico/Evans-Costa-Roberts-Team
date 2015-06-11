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
public class RoomView {
 
    private final String MENU = "\n"
            + "\n******************************************************************"
            + "\n| Room Menu                                                      |"
            + "\n******************************************************************"
            + "\n S - Search Room"
            + "\n V - Save Victim"
            + "\n P - Pick up Resources"
            + "\n D - Discard Resources"
            + "\n O - Remove Obstacle"
            + "\n X - Exit Room";
            
    
    public void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU); //display help menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
        } while (Character.toLowerCase(selection) != 'x'); // a selection is not "return to main menu"
    }

    private String getInput() {
        boolean valid = false; //indicates if name has been retrieved
        String playerInput = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while (!valid) { //while valid name has not been retrieved
            
            //prompt for player's name
            System.out.println("Enter choice from the Room Menu:");
            
            //get the name from the keyboard and trim off blanks
            playerInput = keyboard.nextLine();
            playerInput = playerInput.trim();
            
            //if the name is invalid (< 1 characters)
            if (playerInput.length() < 1) {
                System.out.println("Invalid request - please enter one of the Room Menu Options");
                continue; //and repeat again
            }
            break; // out of the repetition
        }
        
        return playerInput; //return name
    }

    private void doAction(char choice) {
        
        switch (Character.toLowerCase(choice)) {
            case 'v': //save the vistim
                this.saveVictim();
                break;
            case 's': //search the room 
                this.searchRoom();
                break;
            case 'p': //pick up available resources
                this.pickUpResources();
                break;
            case 'd': //discard resources
                this.discardResources();
                break;
            case 'o': //remove obstacle in your way
                this.removeObstacle();
                break;
            case 'x': //return to main menu
                return;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
    }

    private void saveVictim() {
        RescueVictimView rescueVictim = new RescueVictimView();
        rescueVictim.display();
    }

    private void searchRoom() {
        System.out.println("*** searchRoom function called ***");
    }

    private void pickUpResources() {
        System.out.println("*** pickUpResources function called ***");
    }

    private void discardResources() {
        System.out.println("*** discardResources function called ***");
    }

    private void removeObstacle() {
        System.out.println("*** removeResources function called ***");
    }
}
