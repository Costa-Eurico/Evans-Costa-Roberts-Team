/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.model.Scene;
import java.util.ArrayList;
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
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection, please try again. ***");
                break;
        }
    }

    private void saveVictim() {
        RescueVictimView rescueVictim = new RescueVictimView();
        rescueVictim.display();
    }

    private void searchRoom() {
        this.console.println("*** searchRoom function called ***");
        /*
        string location = new __________();
        string items = new ____________();
        
        this.console.println("You are in room " + location);
        this.console.println("As you look around the room " );
        
        for(go through the array one item at a time and print the line) {
            this.console.println("there is one " + x);
        }
        
        return;
        */
    }

    private void pickUpResources() {
        this.console.println("*** pickUpResources function called ***");
          /*
        //variable for the items
        //get array of items in the room
        this.console.println("What do you want to pick up?");
        char selection;
        do {
            
            this.console.println("A-axe"
                               + "/n F-Fire Extinguisher"
                               + "/n R-Rope"
                               + "/n W-Water Bucket"
                               + "/n B-Fire Proof Blanket"
                               + "/n X-No more items to pick up"); //display main menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
        } while (Character.toLowerCase(selection) != 'x'); // a selection is not "Exit"
        
        switch (Character.toLowerCase(selection)) {
            case 'a': 
                //remove ax from current array
                //place ax in players inventory
                //print line that says the +item is in your inventory
                break;
            case 'f': 
                //remove extinguisher from current array
                //place extinguisher in players inventory
                //print line that says the +item is in your inventory
                break;
            case 'r': 
                //remove rope from current array
                //place rope in players inventory
                //print line that says the +item is in your inventory
                break;
            case 'w': 
                //remove water bucket from current array
                //place water bucket in players inventory
                //print line that says the +item is in your inventory
                break;
            case 'b': 
                //remove blanket from current array
                //place blanket in players inventory
                //print line that says the +item is in your inventory
                break;
            case 'x': //return to main menu
                return;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection, please try again. ***");
                break;
        }
        */

    }

    private void discardResources() {
        this.console.println("*** discardResources function called ***");
        /*
        
        //variable for the items
        //get array of items in the room
        this.console.println("What do you want to discard?");
        char selection;
        do {
            
            this.console.println("A- axe"
                               + "/n F-Fire Extinguisher"
                               + "/n R-Rope"
                               + "/n W-Water Bucket"
                               + "/n B-Fire Proof Blanket"
                               + "/n X-No more items to pick up"); //back to menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
        } while (Character.toLowerCase(selection) != 'x'); // a selection is not "Exit"
        
        switch (Character.toLowerCase(selection)) {
            case 'a': 
                //remove ax from players inventory
                //place ax in current location array
                //print line that says you discarded the +item into the room 
                break;
            case 'f': 
                //remove extinguisher from current array
                //place extinguisher in current location array
                //print line that says you discarded the +item into the room 
                break;
            case 'r': 
                //remove rope from players inventory
                //place rope in current location array
                //print line that says you discarded the +item into the room 
                break;
            case 'w': 
                //remove water bucket from players inventory
                //place water bucket in current location array
                //print line that says you discarded the +item into the room 
                break;
            case 'b': 
                //remove blanket from players inventory
                //place blanket in current location array
                //print line that says you discarded the +item into the room 
                break;
            case 'x': //return to main menu
                return;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection, please try again. ***");
                break;
        }
        */
    }

    private void removeObstacle() {
        this.console.println("*** removeResources function called ***");
         /*
        
        */
    }
}
