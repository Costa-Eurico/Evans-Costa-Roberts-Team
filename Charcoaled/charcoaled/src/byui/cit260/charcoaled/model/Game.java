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
public class Game implements Serializable {
    
    //class instance variables
    private double totalTime;
    private double addTime;
    private double loseTime;
    private double countSavedVictims;
    private double countLostVictims;
    private InventoryItem[] inventory;
    
    private Map map;
    private Player player;
    
    
    
    public Game() {
    }

    
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getAddTime() {
        return addTime;
    }

    public void setAddTime(double addTime) {
        this.addTime = addTime;
    }

    public double getLoseTime() {
        return loseTime;
    }

    public void setLoseTime(double loseTime) {
        this.loseTime = loseTime;
    }

    public double getCountSavedVictims() {
        return countSavedVictims;
    }

    public void setCountSavedVictims(double countSavedVictims) {
        this.countSavedVictims = countSavedVictims;
    }

    public double getCountLostVictims() {
        return countLostVictims;
    }

    public void setCountLostVictims(double countLostVictims) {
        this.countLostVictims = countLostVictims;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", addTime=" + addTime + ", loseTime=" + loseTime + ", countSavedVictims=" + countSavedVictims + ", countLostVictims=" + countLostVictims + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.addTime) ^ (Double.doubleToLongBits(this.addTime) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.loseTime) ^ (Double.doubleToLongBits(this.loseTime) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.countSavedVictims) ^ (Double.doubleToLongBits(this.countSavedVictims) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.countLostVictims) ^ (Double.doubleToLongBits(this.countLostVictims) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.addTime) != Double.doubleToLongBits(other.addTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.loseTime) != Double.doubleToLongBits(other.loseTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.countSavedVictims) != Double.doubleToLongBits(other.countSavedVictims)) {
            return false;
        }
        if (Double.doubleToLongBits(this.countLostVictims) != Double.doubleToLongBits(other.countLostVictims)) {
            return false;
        }
        return true;
    }

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public Map getMap() {
        return map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setInventory(InventoryItem[] itemList) {
        this.inventory = itemList;
    }
}