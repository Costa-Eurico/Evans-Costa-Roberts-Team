/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ih8pcs
 */
public class Location implements Serializable{
    
    //class instance variables
    private int row;
    private int column;
    private boolean visited;
    private int roomsRemaining;
    private int type;
    
    private Scene scene;
    private ArrayList<Actor> actors;
    private Obstacle obstacle;
    private Actor[] actor;
    private ArrayList<Resource> resources = new ArrayList<Resource>();
    
    public Location() {
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public Scene getScene() {
        return scene;
    }

    public Obstacle getObstacle() {
        return obstacle;
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

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
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

    public ArrayList<Resource> getResources() {
        return resources;
    }

    public void setResources(ArrayList<Resource> resources) {
        this.resources = resources;
    }
    
    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", roomsRemaining=" + roomsRemaining + ", type=" + type + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.row;
        hash = 41 * hash + this.column;
        hash = 41 * hash + (this.visited ? 1 : 0);
        hash = 41 * hash + this.roomsRemaining;
        hash = 41 * hash + this.type;
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
