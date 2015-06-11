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
 * @author ih8pcs
 */
class GameMenuView {

    public GameMenuView() {
        
    }

    private final String MENU = "\n"
           + "\n******************************************************************"
            + "\n| Game Menu                                                      |"
            + "\n******************************************************************"
            + "\n M - Display Map"
            + "\n W - Move up the stairs"
            + "\n A - Move to the door to the left"
            + "\n S - Move down the stairs"
            + "\n D - Move to the door to the right"
            + "\n E - Enter through the door into the apartment"
            + "\n V - View Items in inventory"
            + "\n J - Drop/Remove Item"
            + "\n P - Pause Game"
            + "\n G - Save Game"
            + "\n X - Return to the main menu ";
            
    
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
            case 'm': //display map
                this.displayMap();
                break;
            case 'w': //move up the stairs
                this.moveUpStairs();
                break;
            case 'a': //move to the door to the left
                this.moveToDoorToTheLeft();
                break;
            case 's':
                this.moveDownStairs();
                break;    
            case 'd':
                this.moveToDoorToTheRight();
                break;   
            case 'e':
                this.enterThroughDoor();
                break;
            case 'v':
                this.viewItemsInventory();
                break;
            case 'j':
                this.dropItem();
                break;
            case 'p':
                this.pauseGame();
                break;
            case 'g':
                this.saveGame();
                break;
            case 'x': //return to main menu
                return;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
    }

    private void displayMap() {
        System.out.println("*** displayMap function called ***");
    }

    private void moveUpStairs() {
        System.out.println("*** moveUpStairs function called ***");
    }

    private void moveToDoorToTheLeft() {
        System.out.println("*** moveToDoorToTheLeft function called ***");
    }

    private void moveDownStairs() {
        System.out.println("*** moveDownStairs function called ***");
    }

    private void moveToDoorToTheRight() {
        System.out.println("*** moveToDoorToTheRight function called ***");
    }

    private void enterThroughDoor() {
        System.out.println("*** enterThroughDoor function called ***");
    }

    private void viewItemsInventory() {
        System.out.println("*** viewItemsInventory function called ***");
    }

    private void dropItem() {
        System.out.println("*** dropItem function called ***");
    }

    private void pauseGame() {
        System.out.println("*** pauseGame function called ***");
    }

    private void saveGame() {
        //System.out.println("*** saveGame function called ***"); 
        String errorMessage = "Error - ";
        String gameName; 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input name to save your game."); 
        gameName = input.next(); // getting a String value
        
        if (gameName.length() <= 1) { 
            System.out.println(errorMessage + "Game name must be at least 2 characters"); 
        }
        else{
           System.out.println(gameName + " will be the name of your saved game");  
           int i = 0;
           while (i < 1) {
               GameControl.gameFolder(Charcoaled.getCurrentGame());
               i++;
               
           }
                  
        }
    }
}
