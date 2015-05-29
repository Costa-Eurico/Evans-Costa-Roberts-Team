/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.charcoaled.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Michael Roberts
 */
public class Obstacle implements Serializable{
    
    // classes instance variables
    private int type;
    private Location coordinates = new Location();
    private static boolean equationSolved;

    public int getType() {
        return type;
    }

    public void setType(int type) {
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

    public Obstacle() {
    }

    @Override
    public String toString() {
        return "Obstacle{" + "type=" + type + ", coordinates=" + coordinates + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.type;
        hash = 97 * hash + Objects.hashCode(this.coordinates);
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
        final Obstacle other = (Obstacle) obj;
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
