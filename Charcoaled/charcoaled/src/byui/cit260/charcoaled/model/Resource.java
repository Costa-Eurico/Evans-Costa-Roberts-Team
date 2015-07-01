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
public class Resource implements Serializable {
    private Item item;
    private long amount;

    public Resource(Item item, long amount) {
        this.item = item;
        this.amount = amount;
    }

    public Resource() {
        System.out.println("\n*** Resource function called ***");
    }
    
    public Item getItem() {
        return item;
    }

    public long getAmount() {
        return amount;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setDescription(String axe) {
        System.out.println("\n*** Stub Function called. ***");
    }

    public void setQuantityInStock(int i) {
        System.out.println("\n*** Stub Function called. ***");
    }

    public void setRequiredAmount(int i) {
        System.out.println("\n*** Stub Function called. ***");
    }
    
    
}
