/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import exception.SceneControlException;

/**
 *
 * @author ih8pcs
 */
public class SceneControl {
    
    public double calcRoomSize(double length, double width, double height) 
                        throws SceneControlException{
   
        if (length < 1 || length > 15) { //determine if length is in range
            throw new SceneControlException("Length is outside the bounds");
        }
	if (width < 1 || width > 15) { //determine if width is in range
            throw new SceneControlException("Width is outside the bounds");
        }
        if (height <1 || height > 10) { //determine if height is in range
            throw new SceneControlException("Height is outside the bounds");
        }
         
	double roomVolume = length*width*height;

	return roomVolume;

    }
}
