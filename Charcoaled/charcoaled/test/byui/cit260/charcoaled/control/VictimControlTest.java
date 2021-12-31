/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import exception.VictimControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ih8pcs
 */
public class VictimControlTest {
    
    public VictimControlTest() {
    }

    /**
     * Test of calcFloorHeight method, of class VictimControl.
     */
    @Test
    public void testCalcFloorHeight() throws VictimControlException {
        
        System.out.println("calcFloorHeight");
        /***********************************
         * Test Case #1
         **********************************/
        System.out.println("\tTest case #1");
        
        //input values for text case 1
        double floor = 3.0;
        double height = 8.0;
        
        double expResult = 16.0; //expected output returned value
        
        //create instance of VictimControl class
        VictimControl instance = new VictimControl();
        
        //call function to run test
        double result = instance.calcFloorHeight(floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************************
         * Test Case #2
         **********************************/
        System.out.println("\tTest case #2");
        
        //input values for text case 2
        floor = -1.0;
        height = 11.0;
        
        expResult = -1.0; //expected output returned value
        
        //call function to run test
        result = instance.calcFloorHeight(floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
    
        /***********************************
         * Test Case #3
         **********************************/
        System.out.println("\tTest case #3");
        
        //input values for text case 3
        floor = 5.0;
        height = -1.0;
        
        expResult = -1.0; //expected output returned value
        
        //call function to run test
        result = instance.calcFloorHeight(floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
    
        /***********************************
         * Test Case #4
         **********************************/
        System.out.println("\tTest case #4");
        
        //input values for text case 4
        floor = 8.0;
        height = 8.0;
        
        expResult = -1.0; //expected output returned value
        
        //call function to run test
        result = instance.calcFloorHeight(floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
    
        /***********************************
         * Test Case #5
         **********************************/
        System.out.println("\tTest case #5");
        
        //input values for text case 5
        floor = 4.0;
        height = 17.0;
        
        expResult = -1.0; //expected output returned value
        
        //call function to run test
        result = instance.calcFloorHeight(floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
    
        /***********************************
         * Test Case #6
         **********************************/
        System.out.println("\tTest case #6");
        
        //input values for text case 6
        floor = 2.0;
        height = 7.0;
        
        expResult = 7.0; //expected output returned value
        
        //call function to run test
        result = instance.calcFloorHeight(floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
    
        /***********************************
         * Test Case #7
         **********************************/
        System.out.println("\tTest case #7");
        
        //input values for text case 7
        floor = 5.0;
        height = 15.0;
        
        expResult = 60.0; //expected output returned value
        
        //call function to run test
        result = instance.calcFloorHeight(floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
    
    }
    
}
