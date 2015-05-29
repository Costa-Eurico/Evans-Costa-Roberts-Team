/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charcoaled;

import byui.cit260.charcoaled.model.Actor;
import byui.cit260.charcoaled.model.Game;
import byui.cit260.charcoaled.model.Item;
import byui.cit260.charcoaled.model.Location;
import byui.cit260.charcoaled.model.Obstacle;
import byui.cit260.charcoaled.model.Player;
import byui.cit260.charcoaled.model.Map;
import byui.cit260.charcoaled.model.Resource;
import byui.cit260.charcoaled.model.Scene;
import byui.cit260.charcoaled.model.Victim;
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
        
        //for the Actor Class
        Actor actorOne = new Actor();
        
        actorOne.setName("Heidi Smith");
        actorOne.setDescription("This is a master player of Charcoaled");
        actorOne.setCoordinates(locationOne);
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        //for the Resource Class
        Resource resourceOne = new Resource();
        
        resourceOne.setAmountAvailable(10);
        resourceOne.setAmountRequired(15);
        resourceOne.setType(1);
        
        String resourceInfo = resourceOne.toString();
        System.out.println(resourceInfo);
        
        //for the Item class
        Item itemOne = new Item();
        
        itemOne.setName("Fire Extinguisher");
        itemOne.setDescription("Carbon Dioxide Fire Extinguisher");
        itemOne.setType(5);
        itemOne.setUsesCount(0);
        itemOne.setMaxUses(10);
        
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        // for the Victim class
        Victim victimOne = new Victim();
        
        victimOne.setStatus("Unconcious");
        victimOne.setDescription("This person has been knocked unconcious!");
        victimOne.setCoordinates(locationOne);
        
        String victimInfo = victimOne.toString();
        System.out.println(victimInfo);
        
        
        // for the obstacle class
        Obstacle obstacleOne = new Obstacle();
        
        obstacleOne.setType(1);
        obstacleOne.setCoordinates(locationOne);
        obstacleOne.setEquationSolved(true);
        
        String obstacleInfo = obstacleOne.toString();
        System.out.println(obstacleInfo);
        
        // for the scene class
        Scene sceneOne = new Scene();
        
        sceneOne.setName("Opening Scene");
        sceneOne.setDescription("Hurry! Find all of the people before the building burns down!");
        sceneOne.setVictims(5);
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
    }
    
}

