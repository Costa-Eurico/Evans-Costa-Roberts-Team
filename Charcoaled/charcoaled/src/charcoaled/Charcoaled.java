/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charcoaled;

import byui.cit260.charcoaled.model.Game;
import byui.cit260.charcoaled.model.Location;
import byui.cit260.charcoaled.model.Player;
import byui.cit260.charcoaled.model.Map;
/**
 *
 * @author ih8pcs
 */
public class Charcoaled {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //for the player class
        Player playerOne = new Player();
        
        playerOne.setName("Heidi Smith");
        playerOne.setHighScore(10.32);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //for the Game class
        Game gameOne = new Game();
        
        gameOne.setTotalTime(2.00);
        gameOne.setAddTime(5.00);
        gameOne.setLoseTime(5.00);
        gameOne.setCountSavedVictims(10.00);
        gameOne.setCountLostVictims(3.00);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameOne);
        
        //for the Map class
        Map mapOne = new Map();
        
        mapOne.setDoorCount(25);
        mapOne.setRoomCount(25);
        mapOne.setStairCount(10);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapOne);
        
        //for the Location class
        Location locationOne = new Location();
        
        locationOne.setRow(1);
        locationOne.setColumn(3);
        locationOne.setVisited(1);
        locationOne.setRoomsRemaining(24);
        locationOne.setType(8);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
    }
    
}
