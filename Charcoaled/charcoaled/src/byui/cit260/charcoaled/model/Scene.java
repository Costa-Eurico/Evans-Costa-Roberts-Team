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
public class Scene implements Serializable{
    
    private String name;
    private String description;
    private int victims;

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

    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", description=" + description + ", victims=" + victims + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + this.victims;
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
        return true;
    }

    public Victim getVictim() {
        return victim;
    }

    public void setVictim(Victim victim) {
        this.victim = victim;
    }

}