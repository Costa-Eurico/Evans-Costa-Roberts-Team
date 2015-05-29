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
public class ObstacleControl {
    
    public double calcObstacleSize(double length, double width, double height) {
   
        if (length < 1 || length > 15) { //determine if length is in range
            return -1;
        }
	if (width < 1 || width > 5) { //determine if width is in range
            return -1;
        }
        if (height < 1 || height > 5) { //determine if height is in range
            return -1;
        }
         
	double obstacleVolume = length*width*height;

	return obstacleVolume;

    }
}
