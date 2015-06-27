/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.charcoaled.model;

import byui.cit260.charcoaled.control.GameControl;
import byui.cit260.charcoaled.control.MapControl;
import charcoaled.Charcoaled;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.swing.ImageIcon;

/**
 *
 * @author Michael Roberts
 */
public class Scene implements Serializable{
    private String name;
    private String description;
    private int victims;
    private Location[] location;
    private Victim victim;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVictims() {
        return victims;
    }

    public void setVictims(int victims) {
        this.victims = victims;
    }

    public Scene() {
    }

    // createScenes() function page 28
    private static Scene[] createScenes() throws MapControlException {
        BufferedImage image = null;
        
        Game game = Charcoaled.getCurrentGame();
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("\nYou are a firefighter");
        
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        
        ImageIcon startingSceneImage = MapControl.getImage(startingScene, "/path_to_image/startingPoint.jpg");
        startingScene.setIcon(startingSceneImage);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        //Finish scene
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\nCongratulations! You have successfully managed to save everyone "
                + "from the burning building! You are now known as a hero. The people "
                + "that you saved will always be grateful for your service. ");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        ImageIcon finishSceneImage = MapControl.getImage(finishScene, 
                "/path_to_image/finish.jpg");
        finishScene.setIcon(finishSceneImage);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
    }

    private void setMapSymbol(String _st_) {
        System.out.println("*** Called setMapSymbol(String _st_) ***");
    }

    private void setBlocked(boolean b) {
        System.out.println("*** Called setBlocked(boolean b) ***");
    }

    private void setIcon(ImageIcon startingSceneImage) {
        System.out.println("*** Called setIcon(ImageIcon startingSceneImage) ***");
    }

    private void setTravelTime(double POSITIVE_INFINITY) {
        System.out.println("*** Called setTravelTime(double POSITIVE_INFINITY) ***");
    }


    public enum SceneType {
        start, 
        floorOneRoomOne,
        floorOneRoomTwo,
        floorOneRoomThree,
        floorOneRoomFour,
        floorOneRoomFive,
        floorTwoRoomOne,
        floorTwoRoomTwo,
        floorTwoRoomThree,
        floorTwoRoomFour,
        floorTwoRoomFive,
        floorThreeRoomOne,
        floorThreeRoomTwo,
        floorThreeRoomThree,
        floorThreeRoomFour,
        floorThreeRoomFive,
        floorFourRoomOne,
        floorFourRoomTwo,
        floorFourRoomThree,
        floorFourRoomFour,
        floorFourRoomFive,
        floorFiveRoomOne,
        floorFiveRoomTwo,
        floorFiveRoomThree,
        floorFiveRoomFour,
        floorFiveRoomFive, 
        finish;
    }

    // pg 29 assignScenesLocation()

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        // start point
        locations[0][0].setScene(scenes[SceneType.floorOneRoomOne.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.floorOneRoomTwo.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.floorOneRoomThree.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.floorOneRoomFour.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.floorOneRoomFive.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.floorTwoRoomOne.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.floorTwoRoomTwo.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.floorTwoRoomThree.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.floorTwoRoomFour.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.floorTwoRoomFive.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.floorThreeRoomOne.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.floorThreeRoomTwo.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.floorThreeRoomThree.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.floorThreeRoomFour.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.floorThreeRoomFive.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.floorFourRoomOne.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.floorFourRoomTwo.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.floorFourRoomThree.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.floorFourRoomFour.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.floorFourRoomFive.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.floorFiveRoomOne.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.floorFiveRoomTwo.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.floorFiveRoomThree.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.floorFiveRoomFour.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.floorFiveRoomFive.ordinal()]);   
}

    //pg 31 - 32 assignScenesToLocations()
    //The instructions are using viewInventory() but we already have a function 
    //named viewItemsInventory() in the GameMenuView, I'm assuming that is the 
    //function we want, if so, the code should be

    private void viewItemsInventory() {
        // get the sorted list of inventory items for the current game
        Item[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" +
                            "Required" + "\t" +
                            "In Stock");
        
        // for each inventory item
        for (Item inventoryItem : inventory) {
            //DISPLAY the description, the required amount and amount in stock
            System.out.println(inventoryItem.getDescription() + "\t    " +
                                inventoryItem.getCoordinates()+ "\t    " +
                                inventoryItem.name());
        } 
    }

    private int sumOfList(List<Integer> numbers){
        int sum = 0;
        for (Integer i : numbers){
            sum += i;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", description=" + description + ", victims=" + victims + ", location=" + location + ", victim=" + victim + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + this.victims;
        hash = 31 * hash + Arrays.deepHashCode(this.location);
        hash = 31 * hash + Objects.hashCode(this.victim);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.victims != other.victims) {
            return false;
        }
        if (!Arrays.deepEquals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.victim, other.victim)) {
            return false;
        }
        return true;
    }
}
