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
public class InventoryItem implements Serializable{
    
    private Item inventoryType;
    private int quantityInStock;
    private int requiredAmount;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Item getInventoryType() {
        return inventoryType;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setInventoryType(Item inventoryType) {
        this.inventoryType = inventoryType;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setRequiredAmount(int requireAmount) {
        this.requiredAmount = requireAmount;
    }
    
}