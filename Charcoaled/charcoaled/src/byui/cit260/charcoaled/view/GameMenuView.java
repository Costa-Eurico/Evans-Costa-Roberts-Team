/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.GameControl;
import byui.cit260.charcoaled.model.InventoryItem;
import byui.cit260.charcoaled.model.Location;
import byui.cit260.charcoaled.model.Map;
import byui.cit260.charcoaled.model.Player;
import charcoaled.Charcoaled;
import java.util.Scanner;

/**
 *
 * @author ih8pcs
 */
class GameMenuView extends View {
    
    private final Player gamePlayer;

    public GameMenuView(Player player) {
        gamePlayer = player;

        promptMessage = "\n"
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
        }
    
    
    @Override
    public void doAction(char choice) {
        
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
                this.enterThroughDoor(gamePlayer);
                break;
            case 'v':
                this.viewInventory();
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
        Map map = Charcoaled.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        
        String strTitle = "\n" +
                          "\n**************************"
                        + "\n| Your current game map  |"
                        + "\n**************************";
        
        System.out.println(strTitle); //display title
        //display row of column numbers
        
        System.out.println("\n---------------------------------------------------------------");
        System.out.print("  |");
        for(int i=1; i <= locations.length; i++){
            System.out.print("  " + i + "  |");
        }
        
        System.out.println("");
        Location location;
       
        for(int row = 0; row < locations[0].length; row++){
            System.out.println("\n---------------------------------------------------------------");
            System.out.print((row + 1) + " | ");
            
            for(int col = 0; col < locations.length; col++){
                location = locations[row][col];

                if(location.getVisited()){
                    System.out.print(" V  ");
                }
                else{
                    System.out.print(" ??  ");
                }
                System.out.print("|");
            }
        }
        System.out.println("\n---------------------------------------------------------------");
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

    private void enterThroughDoor(Player gamePlayer) {
        System.out.println("*** " + gamePlayer.getName() + ", you are entering the selected room.  ***");
        
        RoomView room = new RoomView();
        room.display();
    }

    private void viewInventory() {
        // get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" +
                            "Required" + "\t" +
                            "In Stock");
        
        // for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            //DISPLAY the description, the required amount and amount in stock
            System.out.println(inventoryItem.getDescription() + "\t    " +
                                inventoryItem.getRequiredAmount()+ "\t    " +
                                inventoryItem.getQuantityInStock());
        } 
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
           System.out.println("'" + gameName + "' will be the name of your saved game");  
           int i = 0;
           while (i < 1) {
               GameControl.gameFolder(Charcoaled.getCurrentGame());
               i++;
               
           }
                  
        }
    }
}
