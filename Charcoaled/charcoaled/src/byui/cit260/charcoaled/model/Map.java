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
public class Map implements Serializable{
    
    private int stairCount;
    private int doorCount;
    private int roomCount;
    
    private Location location;
    private Game[] game;
    
    public Map() {
    }

    public Map(int i, int i0) {
        System.out.println("*** Called Map contructor Map(int i, int i0) ***");
    }

    
    
    public int getStairCount() {
        return stairCount;
    }

    public void setStairCount(int stairCount) {
        this.stairCount = stairCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    @Override
    public String toString() {
        return "Map{" + "stairCount=" + stairCount + ", doorCount=" + doorCount + ", roomCount=" + roomCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.stairCount;
        hash = 89 * hash + this.doorCount;
        hash = 89 * hash + this.roomCount;
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
        final Map other = (Map) obj;
        if (this.stairCount != other.stairCount) {
            return false;
        }
        if (this.doorCount != other.doorCount) {
            return false;
        }
        if (this.roomCount != other.roomCount) {
            return false;
        }
        return true;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }
    
    
}
