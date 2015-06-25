/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author eucosta
 */
public enum Item implements Serializable{
    
    Axe("Use it to chop through obstacles."),
    Rope("Use it to lower victims to the ground"),
    FireExtinguisher("If you have one, you're in luck!"),
    WaterBucket("Use it to put down a small fire."),
    FireProofBlanket("Use it to wrap yourself or a victim.");

    private final String description;
    private final Point coordinates;
    
    private Actor[] actor;
    
    Item(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    } 
    
    public Point getCoordinates(){
        return coordinates;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }
    
    
    
}