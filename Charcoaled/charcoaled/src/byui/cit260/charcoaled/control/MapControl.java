/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import byui.cit260.charcoaled.model.Map;
import byui.cit260.charcoaled.model.Scene;
import javax.swing.ImageIcon;

/**
 *
 * @author ih8pcs
 */
public class MapControl {

    static Map createMap() {
        //create the map
        Map map = new Map(20, 20);
        
        //create list of different scenes in the game
        Scene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
    }

    static void moveActorsToStartingLocation(Map map) {
        System.out.println("*** called MapControl.moveActorsToStartingLocation(Map map)***");
    }

    private static Scene[] createScenes() {
        System.out.println("*** called MapControl.createScenes()***");
        return null;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        System.out.println("*** called MapControl.assignScenesToLocations(Map map, Scene[] scenes)***");
    }

    public static ImageIcon getImage(Scene startingScene, String path_to_imagestartingPointjpg) {
        System.out.println("*** called getImage(Scene startingScene, String path_to_imagestartingPointjpg) ***");
        return null;
    }
}
