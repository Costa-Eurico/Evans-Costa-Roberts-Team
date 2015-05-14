/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.model;

import java.io.Serializable;

/**
 *
 * @author ih8pcs
 */
public class Location implements Serializable{
    
    //class instance variables
    private int row;
    private int column;
    private int visited;
    private int roomsRemaining;
    private int type;

    public Location() {
    }
    
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getVisited() {
        return visited;
    }

    public void setVisited(int visited) {
        this.visited = visited;
    }

    public int getRoomsRemaining() {
        return roomsRemaining;
    }

    public void setRoomsRemaining(int roomsRemaining) {
        this.roomsRemaining = roomsRemaining;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", roomsRemaining=" + roomsRemaining + ", type=" + type + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.row;
        hash = 47 * hash + this.column;
        hash = 47 * hash + this.visited;
        hash = 47 * hash + this.roomsRemaining;
        hash = 47 * hash + this.type;
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.roomsRemaining != other.roomsRemaining) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        return true;
    }

    
    
    
}
