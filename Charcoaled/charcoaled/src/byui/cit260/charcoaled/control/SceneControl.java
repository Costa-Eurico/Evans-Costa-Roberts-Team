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
public class SceneControl {
    
    public double calcRoomSize(double length, double width, double height) {
   
        if (length < 1 || length > 15) { //determine if length is in range
            return -1;
        }
	if (width < 1 || width > 15) { //determine if width is in range
            return -1;
        }
        if (height <1 || height > 10) { //determine if height is in range
            return -1;
        }
         
	double roomVolume = length*width*height;

	return roomVolume;

    }
}
