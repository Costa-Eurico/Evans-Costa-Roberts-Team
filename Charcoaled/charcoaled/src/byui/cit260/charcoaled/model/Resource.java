/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.model;

import java.io.Serializable;

/**
 *
 * @author eucosta
 */
public class Resource implements Serializable{
    
    //class instance variables
    private int type;
    private int amountAvailable;
    private int amountRequired;

    public Resource() {
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(int amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public int getAmountRequired() {
        return amountRequired;
    }

    public void setAmountRequired(int amountRequired) {
        this.amountRequired = amountRequired;
    }

    @Override
    public String toString() {
        return "Resource{" + "type=" + type + ", amountAvailable=" + amountAvailable + ", amountRequired=" + amountRequired + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.type;
        hash = 89 * hash + this.amountAvailable;
        hash = 89 * hash + this.amountRequired;
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
        final Resource other = (Resource) obj;
        if (this.type != other.type) {
            return false;
        }
        if (this.amountAvailable != other.amountAvailable) {
            return false;
        }
        if (this.amountRequired != other.amountRequired) {
            return false;
        }
        return true;
    }
}
