/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import byui.cit260.charcoaled.model.Game;
import byui.cit260.charcoaled.model.Item;
import byui.cit260.charcoaled.model.Map;
import byui.cit260.charcoaled.model.Player;
import charcoaled.Charcoaled;
import java.util.List;

public class GameControl {
  
    public static void createNewGame(Player player) {
     Game game = new Game(); //create new game
     Charcoaled.setCurrentGame(game); //save in Charcoaled
     
     game.setPlayer(player); //save player in game
     
     //create inventory list and save in game
     ResourceControl[] itemList = GameControl.itemList();
     game.setItem(itemList);
     
     Map map = MapControl.createMap(); //create and initialize new map
     game.setMap(map); //save map in game
     
     //move actors to starting position in map
     MapControl.moveActorsToStartingLocation(map);
    }

    public static void gameFolder(Game currentGame) {
        System.out.println("\n*** gameFolder stub function called ***");
    }

    private static ResourceControl[] itemList() {
        //created array(list) of inventory itemsc
        ResourceControl[] resource =
                new ResourceControl[5];
        
        ResourceControl axe = new ResourceControl();
        axe.setDescription("axe");
        axe.setQuantityInStock(0);
        axe.setRequiredAmount(0);
        resource[Item.Axe.ordinal()] = axe;
        
        ResourceControl rope = new ResourceControl();
        rope.setDescription("rope");
        rope.setQuantityInStock(0);
        rope.setRequiredAmount(0);
        resource[Item.Rope.ordinal()] = rope;
        
        ResourceControl fireExtinguisher = new ResourceControl();
        fireExtinguisher.setDescription("fireExtinguisher");
        fireExtinguisher.setQuantityInStock(0);
        fireExtinguisher.setRequiredAmount(0);
        resource[Item.FireExtinguisher.ordinal()] = fireExtinguisher;
        
        ResourceControl waterBucket = new ResourceControl();
        waterBucket.setDescription("waterBucket");
        waterBucket.setQuantityInStock(0);
        waterBucket.setRequiredAmount(0);
        resource[Item.WaterBucket.ordinal()] = waterBucket;
        
        ResourceControl fireProofBlanket = new ResourceControl();
        fireProofBlanket.setDescription("fireProofBlanket");
        fireProofBlanket.setQuantityInStock(0);
        fireProofBlanket.setRequiredAmount(0);
        resource[Item.FireProofBlanket.ordinal()] = fireProofBlanket;
        
        return resource;
    }
    
    public static Item[] getSortedInventoryList() {
    
        // get inventory list for the current game
        Item[] originalInventoryList =
                Charcoaled.getCurrentGame().getInventory();
        
        // clone (make a copy) originalList
        Item[] inventoryList = originalInventoryList.clone();
        
        // using a BubbleSort to sort the list of inventoryList by name
        Item tempInventoryItem;
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
    
    private int sumOfList(List<Integer> numbers){
        int sum = 0;
        for (int i : numbers){
            sum += i;
        }
        return sum;
    }

}
