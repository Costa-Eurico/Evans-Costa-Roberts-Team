/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.charcoaled.model;

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
    private int actors;
    private Actor actor;
    private Item[] items;
    private Object[] location;

    public void setActors(int actors) {
        this.actors = actors;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public int getActors() {
        return actors;
    }

    public Actor getActor() {
        return actor;
    }

    public Item[] getItems() {
        return items;
    }
    
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


    public Scene() {
    }

    public void setMapSymbol(String _st_) {
        System.out.println("*** Called setMapSymbol(String _st_) ***");
    }

    public void setBlocked(boolean b) {
        System.out.println("*** Called setBlocked(boolean b) ***");
    }

    private void setIcon(ImageIcon startingSceneImage) {
        System.out.println("*** Called setIcon(ImageIcon startingSceneImage) ***");
    }

    public void setTravelTime(double POSITIVE_INFINITY) {
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

    private int sumOfList(List<Integer> numbers){
        int sum = 0;
        for (Integer i : numbers){
            sum += i;
        }
        return sum;
    }

    @Override
    public String toString() {
        String location = null;
        return "Scene{" + "name=" + name + ", description=" + description + ", victims=" + actors + ", location=" + location + ", victim=" + actor + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + this.actors;
        hash = 31 * hash + Arrays.deepHashCode(this.location);
        hash = 31 * hash + Objects.hashCode(this.actor);
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
        if (this.actors != other.actors) {
            return false;
        }
        if (!Arrays.deepEquals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.actor, other.actor)) {
            return false;
        }
        return true;
    }
}
