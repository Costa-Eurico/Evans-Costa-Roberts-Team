/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.model;

import java.util.Objects;

/**
 *
 * @author eucosta
 */
public class Item {
    private String name;
    private int type;
    private String description;
    private int usesCount;
    private int maxUses; //was not part of the original model but it is necessary to determine how many times an item can be used.

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUsesCount() {
        return usesCount;
    }

    public void setUsesCount(int usesCount) {
        this.usesCount = usesCount;
    }

    public int getMaxUses() {
        return maxUses;
    }

    public void setMaxUses(int maxUses) {
        this.maxUses = maxUses;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", type=" + type + ", description=" + description + ", usesCount=" + usesCount + ", maxUses=" + maxUses + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + this.type;
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + this.usesCount;
        hash = 17 * hash + this.maxUses;
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.usesCount != other.usesCount) {
            return false;
        }
        if (this.maxUses != other.maxUses) {
            return false;
        }
        return true;
    }
    
    
    
    

   
}
