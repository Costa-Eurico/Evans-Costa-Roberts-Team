/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.charcoaled.view;
import byui.cit260.charcoaled.model.Actor;
package Exception;

/**
 *
 * @author xyz
 */
public class MoveActorView {
    doAction(){
        try {
            moveActors(actors, 0,1);
        }
    }
    
    @Override
    public boolean doAction(String choice) {
        Actor actor = null;
        
        // Move actor to specified location
        try {
            MapControl.moveActorToLocation(actor, coordinates);
        } catch (MapControlException me) {
            System.out.println(me.getMessage());
        }
    }
    
}
