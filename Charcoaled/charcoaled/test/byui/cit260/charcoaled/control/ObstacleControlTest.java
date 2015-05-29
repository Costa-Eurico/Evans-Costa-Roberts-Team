/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ih8pcs
 */
public class ObstacleControlTest {
    
    public ObstacleControlTest() {
    }

    /**
     * Test of calcObstacleSize method, of class ObstacleControl.
     */
   @Test
    public void testCalcObstacleSize() {
        
        System.out.println("calcObstacleSize");
        /***********************************
         * Test Case #1
         **********************************/
        System.out.println("\tTest case #1");
        
        //input values for text case 1
        double length = 12.0;
        double width = 3.0;
        double height = 2.0;
        
        double expResult = 72.0; //expected output returned value
        
        //create instance of ObstacleControl class
        ObstacleControl instance = new ObstacleControl();
        
        //call function to run test
        double result = instance.calcObstacleSize(length, width, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        /***********************************
         * Test Case #2
         **********************************/
        System.out.println("\tTest case #2");
        
        //input values for text case 2
        length = -1.0;
        width = 2.0;
        height = 3.0;
        
        expResult = -1.0; //expected output returned value
        
        //call function to run test
        result = instance.calcObstacleSize(length, width, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************************
         * Test Case #3
         **********************************/
        System.out.println("\tTest case #3");
        
        //input values for text case 3
        length = 10.0;
        width = -4.0;
        height = 4.0;
        
        expResult = -1.0; //expected output returned value
        
        //call function to run test
        result = instance.calcObstacleSize(length, width, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************************
         * Test Case #4
         **********************************/
        System.out.println("\tTest case #4");
        
        //input values for text case 4
        length = 8.0;
        width = 5.0;
        height = -6.0;
        
        expResult = -1.0; //expected output returned value
        
        //call function to run test
        result = instance.calcObstacleSize(length, width, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************************
         * Test Case #5
         **********************************/
        System.out.println("\tTest case #5");
        
        //input values for text case 5
        length = 16.0;
        width = 4.0;
        height = 2.0;
        
        expResult = -1.0; //expected output returned value
        
        //call function to run test
        result = instance.calcObstacleSize(length, width, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************************
         * Test Case #6
         **********************************/
        System.out.println("\tTest case #6");
        
        //input values for text case 6
        length = 12.0;
        width = 6.0;
        height = 3.0;
        
        expResult = -1.0; //expected output returned value
        
        //call function to run test
        result = instance.calcObstacleSize(length, width, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************************
         * Test Case #7
         **********************************/
        System.out.println("\tTest case #7");
        
        //input values for text case 7
        length = 14.0;
        width = 5.0;
        height = 6.0;
        
        expResult = -1.0; //expected output returned value
        
        //call function to run test
        result = instance.calcObstacleSize(length, width, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************************
         * Test Case #8
         **********************************/
        System.out.println("\tTest case #8");
        
        //input values for text case 8
        length = 1.0;
        width = 1.0;
        height = 1.0;
        
        expResult = 1.0; //expected output returned value
        
        //call function to run test
        result = instance.calcObstacleSize(length, width, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************************
         * Test Case #9
         **********************************/
        System.out.println("\tTest case #9");
        
        //input values for text case 9
        length = 15.0;
        width = 5.0;
        height = 5.0;
        
        expResult = 375.0; //expected output returned value
        
        //call function to run test
        result = instance.calcObstacleSize(length, width, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
    }
}
