/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import byui.cit260.charcoaled.model.Game;
import byui.cit260.charcoaled.model.Location;
import byui.cit260.charcoaled.model.Map;
import byui.cit260.charcoaled.model.Scene;
import charcoaled.Charcoaled;
import exception.MapControlException;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import byui.cit260.charcoaled.model.Actor;

/**
 *
 * @author ih8pcs
 */
public class MapControl {
    
    // Fix this class
    public static int moveActors(){
        return moveActors();
    }
        
    public static void moveActorToLocation(Actor actor, Point coordinates)
                            throws MapControlException {
        
        Map map = Charcoaled.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() || 
            newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move actor to location "
                                            + coordinates.x + ", " + coordinates.y
                                            + " because that location is outside "
                                            + " the bounds of the map.");
        }
    }
    
    public static int moveActorsToStartingLocation(Map map) {
        // for every actor
        Actor[] actors = Actor.values();
        
        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            int returnValue = MapControl.moveActorToLocation(actor, coordinates);

        }
        return 0;
    }   

    static Map createMap() throws MapControlException {
        //create the map
        Map map = new Map(5, 5);
        
        //create list of different scenes in the game
        Scene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
    }

    static void moveActorsToStartLocation(Map map) {
        System.out.println("*** called MapControl.moveActorsToStartingLocation(Map map)***");
    }

    // createScenes() function page 28
    private static Scene[] createScenes() throws MapControlException{
        BufferedImage image = null;
        
        Game game = Charcoaled.getCurrentGame();
        Scene[] scenes = new Scene[Scene.SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("\nYou are a firefighter");
        
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[Scene.SceneType.start.ordinal()] = startingScene;
        
        //Finish scene
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\nCongratulations! You have successfully managed to save everyone "
                + "from the burning building! You are now known as a hero. The people "
                + "that you saved will always be grateful for your service. ");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        //finishScene.setIcon(finishSceneImage);
        scenes[Scene.SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
    }

    // pg 29 assignScenesLocation()
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        // start point
        locations[0][0].setScene(scenes[Scene.SceneType.floorOneRoomOne.ordinal()]);
        locations[0][1].setScene(scenes[Scene.SceneType.floorOneRoomTwo.ordinal()]);
        locations[0][2].setScene(scenes[Scene.SceneType.floorOneRoomThree.ordinal()]);
        locations[0][3].setScene(scenes[Scene.SceneType.floorOneRoomFour.ordinal()]);
        locations[0][4].setScene(scenes[Scene.SceneType.floorOneRoomFive.ordinal()]);
        locations[1][0].setScene(scenes[Scene.SceneType.floorTwoRoomOne.ordinal()]);
        locations[1][1].setScene(scenes[Scene.SceneType.floorTwoRoomTwo.ordinal()]);
        locations[1][2].setScene(scenes[Scene.SceneType.floorTwoRoomThree.ordinal()]);
        locations[1][3].setScene(scenes[Scene.SceneType.floorTwoRoomFour.ordinal()]);
        locations[1][4].setScene(scenes[Scene.SceneType.floorTwoRoomFive.ordinal()]);
        locations[2][0].setScene(scenes[Scene.SceneType.floorThreeRoomOne.ordinal()]);
        locations[2][1].setScene(scenes[Scene.SceneType.floorThreeRoomTwo.ordinal()]);
        locations[2][2].setScene(scenes[Scene.SceneType.floorThreeRoomThree.ordinal()]);
        locations[2][3].setScene(scenes[Scene.SceneType.floorThreeRoomFour.ordinal()]);
        locations[2][4].setScene(scenes[Scene.SceneType.floorThreeRoomFive.ordinal()]);
        locations[3][0].setScene(scenes[Scene.SceneType.floorFourRoomOne.ordinal()]);
        locations[3][1].setScene(scenes[Scene.SceneType.floorFourRoomTwo.ordinal()]);
        locations[3][2].setScene(scenes[Scene.SceneType.floorFourRoomThree.ordinal()]);
        locations[3][3].setScene(scenes[Scene.SceneType.floorFourRoomFour.ordinal()]);
        locations[3][4].setScene(scenes[Scene.SceneType.floorFourRoomFive.ordinal()]);
        locations[4][0].setScene(scenes[Scene.SceneType.floorFiveRoomOne.ordinal()]);
        locations[4][1].setScene(scenes[Scene.SceneType.floorFiveRoomTwo.ordinal()]);
        locations[4][2].setScene(scenes[Scene.SceneType.floorFiveRoomThree.ordinal()]);
        locations[4][3].setScene(scenes[Scene.SceneType.floorFiveRoomFour.ordinal()]);
        locations[4][4].setScene(scenes[Scene.SceneType.floorFiveRoomFive.ordinal()]);   
    }
    
    
}
