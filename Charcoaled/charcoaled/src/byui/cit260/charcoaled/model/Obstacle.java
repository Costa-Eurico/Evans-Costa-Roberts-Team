/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.charcoaled.model;

import java.io.Serializable;
/**
 *
 * @author Michael Roberts
 */
public class Obstacle implements Serializable{
    
    // classes instance variables
    private int type;
    private Location coordinates = new Location();
    private static boolean equationSolved;

    public int gettype() {
        return type;
    }

    public void settype(int type) {
        this.type = type;
    }

    public Location getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Location coordinates) {
        this.coordinates = coordinates;
    }

    public boolean isEquationSolved() {
        return equationSolved;
    }

    public void setEquationSolved(boolean equationSolved) {
        this.equationSolved = equationSolved;
    }
    
    
    
}
