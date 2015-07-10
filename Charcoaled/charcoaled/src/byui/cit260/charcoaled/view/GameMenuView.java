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
                this.console.println("\n*** Invalid selection, please try again. ***");
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
        
        this.console.println(strTitle); //display title
        //display row of column numbers
        
        this.console.println("\n---------------------------------------------------------------");
        this.console.print("  |");
        for(int i=1; i <= locations.length; i++){
            this.console.print("  " + i + "  |");
        }
        
        this.console.println("");
        Location location;
       
        for(int row = 0; row < locations[0].length; row++){
            this.console.println("\n---------------------------------------------------------------");
            this.console.print((row + 1) + " | ");
            
            for(int col = 0; col < locations.length; col++){
                location = locations[row][col];

                if(location.getVisited()){
                    this.console.print(" V  ");
                }
                else{
                    this.console.print(" ??  ");
                }
                this.console.print("|");
            }
        }
        this.console.println("\n---------------------------------------------------------------");
    }
   
    private void moveUpStairs() {
        this.console.println("*** moveUpStairs function called ***");
    }

    private void moveToDoorToTheLeft() {
        this.console.println("*** moveToDoorToTheLeft function called ***");
    }

    private void moveDownStairs() {
        this.console.println("*** moveDownStairs function called ***");
    }

    private void moveToDoorToTheRight() {
        this.console.println("*** moveToDoorToTheRight function called ***");
    }

    private void enterThroughDoor(Player gamePlayer) {
        this.console.println("*** " + gamePlayer.getName() + ", you are entering the selected room.  ***");
        
        RoomView room = new RoomView();
        room.display();
    }

    private void viewInventory() {
        // get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        this.console.println("\nList of Inventory Items");
        this.console.println("Description" + "\t" +
                            "Required" + "\t" +
                            "In Stock");
        
        // for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            //DISPLAY the description, the required amount and amount in stock
            this.console.println(inventoryItem.getDescription() + "\t    " +
                                inventoryItem.getRequiredAmount()+ "\t    " +
                                inventoryItem.getQuantityInStock());
        } 
    }

    private void dropItem() {
        this.console.println("*** dropItem function called ***");
    }

    private void pauseGame() {
        this.console.println("*** pauseGame function called ***");
    }

    private void saveGame() {
        String errorMessage = "Error - ";
        String gameName; 
        
        this.console.println("Input name to save your game."); 
        gameName = this.getInput(); // getting a String value
        
        try {
            //save the game to the specified file
            GameControl.saveGame(Charcoaled.getCurrentGame(), gameName);
        }catch (Exception ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        if (gameName.length() <= 1) { 
            ErrorView.display(this.getClass().getName(), errorMessage + "Game name must be at least 2 characters"); 
        }
        else{
           this.console.println("'" + gameName + "' will be the name of your saved game");  
           int i = 0;
           while (i < 1) {
               GameControl.gameFolder(Charcoaled.getCurrentGame());
               i++;
               
           }
                  
        }
    }
}
