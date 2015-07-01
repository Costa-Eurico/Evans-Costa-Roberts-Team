/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charcoaled;

import byui.cit260.charcoaled.model.Actor;
import byui.cit260.charcoaled.model.Game;
import byui.cit260.charcoaled.model.InventoryItem;
import byui.cit260.charcoaled.model.Location;
import byui.cit260.charcoaled.model.Obstacle;
import byui.cit260.charcoaled.model.Player;
import byui.cit260.charcoaled.model.Map;
import byui.cit260.charcoaled.model.Scene;
import byui.cit260.charcoaled.model.Victim;
import byui.cit260.charcoaled.view.StartProgramView;
/**
 *
 * @author ih8pcs
 */
public class Charcoaled {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame) {
        Charcoaled.currentGame = currentGame;
    }
    
    public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        Charcoaled.player = player;
    }
    
    public static void main(String[] args) {
       //create StartProgram and start the program
       StartProgramView startProgram = new StartProgramView();
       startProgram.startProgram();
       try {
           startProgram.display();
       } catch (Throwable te) {
           System.out.println(te.getMessage());
           te.printStackTrace();
           startProgram.display();
       }
   }
 }

