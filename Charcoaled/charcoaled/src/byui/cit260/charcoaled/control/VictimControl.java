/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import exception.VictimControlException;

/**
 *
 * @author ih8pcs
 */
public class VictimControl {
      
    public double calcFloorHeight(double floor, double height)
                        throws VictimControlException{
        //put in throws for VictimControlException
        if (floor < 2 || floor > 5) { //determine if floor is in range
            throw new VictimControlException("The floor is out of range.");
        }
	if (height < 7 || height > 15) { //determine if width is in range
            throw new VictimControlException("The height is out of range.");
        }
        
        double floorsLeft = floor-1;
	double distanceDown = floorsLeft*height;

	return distanceDown;

    }
}
