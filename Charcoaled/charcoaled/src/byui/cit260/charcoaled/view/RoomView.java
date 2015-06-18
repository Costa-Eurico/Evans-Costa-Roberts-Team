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
public class RoomView extends View {
    
    public RoomView() {
    promptMessage = "\n"
            + "\n******************************************************************"
            + "\n| Room Menu                                                      |"
            + "\n******************************************************************"
            + "\n S - Search Room"
            + "\n V - Save Victim"
            + "\n P - Pick up Resources"
            + "\n D - Discard Resources"
            + "\n O - Remove Obstacle"
            + "\n X - Exit Room";
        } 
    
    @Override
    public void doAction(char choice) {
        
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
