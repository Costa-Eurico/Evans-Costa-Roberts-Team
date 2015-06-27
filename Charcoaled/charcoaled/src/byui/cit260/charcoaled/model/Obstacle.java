/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.charcoaled.model;

import java.awt.Point;
import java.io.Serializable;
/**
 *
 * @author Michael Roberts
 */
public enum Obstacle implements Serializable{
    
    // classes instance variables
    Furniture("The couch is on fire"),
    BurningObject("The clothing is on fire"),
    LockedDoor("Unlock the door"),
    UncooperativeVictim("Screaming Victim"),
    UnconsciousVictim("Victim has passed out"),
    Pet("Save the dog");
    
    private final String description;
    private final Point coordinates;

    Obstacle(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }  
    
    public String getDescription(){
        return description;
    }
    
    public Point getCoordinates(){
        return coordinates;
    }
}
