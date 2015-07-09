/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import byui.cit260.charcoaled.model.Game;
import byui.cit260.charcoaled.model.InventoryItem;
import byui.cit260.charcoaled.model.Item;
import byui.cit260.charcoaled.model.Map;
import byui.cit260.charcoaled.model.Player;
import charcoaled.Charcoaled;
import exception.MapControlException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.List;

public class GameControl {
  
    private static String filePath = null;
    
    public static void createNewGame(Player player) throws MapControlException {
        Game game = new Game(); //create new game
        Charcoaled.setCurrentGame(game); //save in Charcoaled

        game.setPlayer(player); //save player in game

        //create inventory list and save in game
        InventoryItem[] itemList = GameControl.createItemList();
        game.setInventory(itemList);

        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in game

        //move actors to starting position in map
        MapControl.moveActorsToStartingLocation(map);
    }

    public static void gameFolder(Game currentGame) {
        System.out.println("\n*** gameFolder stub function called ***");
    }

    private static InventoryItem[] createItemList() {
        //created array(list) of inventory itemsc
        
        InventoryItem[] inventory = new InventoryItem[5];
        
        InventoryItem axe = new InventoryItem();
        axe.setDescription("Axe");
        axe.setQuantityInStock(0);
        axe.setRequiredAmount(0);
        inventory[Item.Axe.ordinal()] = axe;
        
        InventoryItem rope = new InventoryItem();
        rope.setDescription("rope");
        rope.setQuantityInStock(0);
        rope.setRequiredAmount(0);
        inventory[Item.Rope.ordinal()] = rope;
        
        InventoryItem fireExtinguisher = new InventoryItem();
        fireExtinguisher.setDescription("fireExtinguisher");
        fireExtinguisher.setQuantityInStock(0);
        fireExtinguisher.setRequiredAmount(0);
        inventory[Item.FireExtinguisher.ordinal()] = fireExtinguisher;
        
        InventoryItem waterBucket = new InventoryItem();
        waterBucket.setDescription("waterBucket");
        waterBucket.setQuantityInStock(0);
        waterBucket.setRequiredAmount(0);
        inventory[Item.WaterBucket.ordinal()] = waterBucket;
        
        InventoryItem fireProofBlanket = new InventoryItem();
        fireProofBlanket.setDescription("fireProofBlanket");
        fireProofBlanket.setQuantityInStock(0);
        fireProofBlanket.setRequiredAmount(0);
        inventory[Item.FireProofBlanket.ordinal()] = fireProofBlanket;
        
        return inventory;
    }
    
    public static InventoryItem[] getSortedInventoryList() {
        // get inventory list for the current game
        InventoryItem[] originalInventoryList = Charcoaled.getCurrentGame().getInventory();
        
        // clone (make a copy) originalList
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        // using a BubbleSort to sort the list of inventoryList by name
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
        return inventoryList;
    }

    public static void saveGame(Game currentGame, String gameName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void getSavedGame(String filepath)
                            throws GameControlException {
    
        Game game = null;
        
        try ( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject(); //read the game object from the file
            
            }
        catch(FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
            }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
            }
        //close the output file
        Charcoaled.setCurrentGame(game); //save in Charcoaled
        }
    
    private int sumOfList(List<Integer> numbers){
        int sum = 0;
        for (int i : numbers){
            sum += i;
        }
        return sum;
    }
    
    public InventoryItem[] getInventory() {
        return Charcoaled.getCurrentGame().getInventory();
    }
}
