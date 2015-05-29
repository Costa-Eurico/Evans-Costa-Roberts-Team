/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

/**
 *
 * @author ih8pcs
 */
public class VictimControl {
      
    public double calcFloorHeight(double floor, double height) {
   
        if (floor < 2 || floor > 5) { //determine if floor is in range
            return -1;
        }
	if (height < 7 || height > 15) { //determine if width is in range
            return -1;
        }
        
        double floorsLeft = floor-1;
	double distanceDown = floorsLeft*height;

	return distanceDown;

    }
}
