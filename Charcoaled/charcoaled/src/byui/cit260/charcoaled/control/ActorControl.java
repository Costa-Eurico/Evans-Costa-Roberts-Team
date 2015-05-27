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
    
public class ActorControl {
    
    
    public double calcLengthOfRope(double girth, double floor, double height) {
   
        if (girth < 20 || girth > 40) { //determine if girth is in range
            return -1;
        }
	if (floor < 2 || floor > 5) { //determine if floor is in range
            return -1;
        }
        if (height <0 || height > 10) { //determine if height is in range
            return -1;
        }
            //next line makes girth in feet rather than inches
	double knot =  girth / 12;
	double ropeLength = knot + (floor*height);

	return ropeLength;

    }
}
