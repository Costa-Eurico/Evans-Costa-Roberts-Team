/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import byui.cit260.charcoaled.model.Player;
import charcoaled.Charcoaled;

/**
 *
 * @author ih8pcs
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        Charcoaled.setPlayer(player); //save the player
        
        return player;
    }
    
}
