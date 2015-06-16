/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

    
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
    
    // Calculates the force necessary to move a given object, in newtons.
    public double calcForceNeeded(double weight, double cof){
        //function variables and constants
        double GRAVITY_CONSTANT = -9.8; // in m/s^2
        double forceOfFriction;
        double forceN;
        
        if(weight < 1){ // validate lower boundary
            return -1;
        }
        if(cof <.1){ //validate coeficient of friction
            return -1;
        }
        
        //Calculate Newtons of force required to mode the object
        forceOfFriction = -(cof) * weight; // calculate force of friction;
        forceN = forceOfFriction * GRAVITY_CONSTANT;
        
        if(forceN > 225) //225 N is the maximum force recommended by OSHA that an individual should push.
            return -1;
        else
            return forceN;
    }
}
