/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import byui.cit260.charcoaled.model.Map;
import byui.cit260.charcoaled.model.Scene;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
