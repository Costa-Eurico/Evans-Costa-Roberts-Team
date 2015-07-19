/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author ih8pcs
 */
public class Location implements Serializable{
    
    //class instance variables
    private int row;
    private int column;
    private boolean visited;
    private boolean isCurrentActorLocation = false;
    private Scene scene;
    private ArrayList<Actor> actors;
    private Obstacle obstacle;
    private Actor[] actor;
    private ArrayList<Resource> resources = new ArrayList<Resource>();
    private int type;
    private Point coordinates;

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }
    
    public boolean getIsCurrentActorLocation() {
        return isCurrentActorLocation;
    }

    public void setIsCurrentActorLocation(boolean isCurrentActorLocation) {
        this.isCurrentActorLocation = isCurrentActorLocation;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }
   
    
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
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.row;
        hash = 97 * hash + this.column;
        hash = 97 * hash + (this.visited ? 1 : 0);
        hash = 97 * hash + (this.isCurrentActorLocation ? 1 : 0);
        hash = 97 * hash + this.type;
        hash = 97 * hash + Objects.hashCode(this.scene);
        hash = 97 * hash + Objects.hashCode(this.actors);
        hash = 97 * hash + Objects.hashCode(this.obstacle);
        hash = 97 * hash + Arrays.deepHashCode(this.actor);
        hash = 97 * hash + Objects.hashCode(this.resources);
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
        if (this.isCurrentActorLocation != other.isCurrentActorLocation) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        if (!Objects.equals(this.actors, other.actors)) {
            return false;
        }
        if (this.obstacle != other.obstacle) {
            return false;
        }
        if (!Arrays.deepEquals(this.actor, other.actor)) {
            return false;
        }
        if (!Objects.equals(this.resources, other.resources)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", isCurrentActorLocation=" + isCurrentActorLocation + ", type=" + type + ", scene=" + scene + ", actors=" + actors + ", obstacle=" + obstacle + ", actor=" + actor + ", resources=" + resources + '}';
    }
    
}
