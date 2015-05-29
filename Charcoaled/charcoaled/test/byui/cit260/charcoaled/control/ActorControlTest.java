/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author ih8pcs
 */
public class ActorControlTest {
    
    public ActorControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    /**
     * Test of calcLengthOfRope method, of class ActorControl.
     */
    @Test
    public void testCalcLengthOfRope() {
        
        System.out.println("calcLengthOfRope");
        /***********************************
         * Test Case #1
         **********************************/
        System.out.println("\tTest case #1");
        
        //input values for text case 1
        double girth = 22.0;
        double floor = 3.0;
        double height = 7.0;
        
        double expResult = 22.8333; //expected output returned value
        
        //create instance of ActorControl class
        ActorControl instance = new ActorControl();
        
        //call function to run test
        double result = instance.calcLengthOfRope(girth, floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

        /***********************************
         * Test Case #2
         **********************************/
        System.out.println("\tTest case #2");
        
        //input values for text case 2
        girth = 19.0;
        floor = 2.0;
        height = 8.0;
        
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcLengthOfRope(girth, floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

        /***********************************
         * Test Case #3
         **********************************/
        System.out.println("\tTest case #3");
        
        //input values for text case 3
        girth = 45.0;
        floor = 2.0;
        height = 8.0;
        
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcLengthOfRope(girth, floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

        /***********************************
         * Test Case #4
         **********************************/
        System.out.println("\tTest case #4");
        
        //input values for text case 4
        girth = 27.0;
        floor = 0.0;
        height = 6.0;
        
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcLengthOfRope(girth, floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

        /***********************************
         * Test Case #5
         **********************************/
        System.out.println("\tTest case #5");
        
        //input values for text case 5
        girth = 27.0;
        floor = 6.0;
        height = 6.0;
        
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcLengthOfRope(girth, floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************************
         * Test Case #6
         **********************************/
        System.out.println("\tTest case #6");
        
        //input values for text case 6
        girth = 30.0;
        floor = 5.0;
        height = -3.0;
        
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcLengthOfRope(girth, floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

        /***********************************
         * Test Case #7
         **********************************/
        System.out.println("\tTest case #7");
        
        //input values for text case 7
        girth = 30.0;
        floor = 5.0;
        height = 11.0;
        
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcLengthOfRope(girth, floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

        /***********************************
         * Test Case #8
         **********************************/
        System.out.println("\tTest case #8");
        
        //input values for text case 8
        girth = 20.0;
        floor = 2.0;
        height = 0.0;
        
        expResult = 1.6666; //expected output returned value
        
        //call function to run test
        result = instance.calcLengthOfRope(girth, floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

        /***********************************
         * Test Case #9
         **********************************/
        System.out.println("\tTest case #9");
        
        //input values for text case 9
        girth = 40.0;
        floor = 5.0;
        height = 10.0;
        
        expResult = 53.3333; //expected output returned value
        
        //call function to run test
        result = instance.calcLengthOfRope(girth, floor, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

    }

    /**
     * Test of calcForceNeeded method, of class ActorControl.
     */
    @Test
    public void testCalcForceNeeded() {
        double weight;
        double cof;
        double expResult;  //expected output returned value
        double result; //actual result
        ActorControl instance = new ActorControl(); //create instance of ActorControl class
        
        System.out.println("calcForceNeeded");
        /***********************************
         * Test Case #1
         **********************************/
        System.out.println("\tTest case #1");
        
        //input values for text case 1
        weight = 30.0;
        cof = .5;
        expResult = 147.0;
        
        //call function to run test
        result = instance.calcForceNeeded(weight, cof);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        
        /***********************************
         * Test Case #2
         **********************************/
        System.out.println("\tTest case #2");
        
        //input values for text case 2
        weight = 116.0;
        cof = .2;
        expResult = -1;
        
        //call function to run test
        result = instance.calcForceNeeded(weight, cof);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************************
         * Test Case #3
         **********************************/
        System.out.println("\tTest case #3");
        
        //input values for text case 3
        weight = 80;
        cof = .3;
        expResult = -1;
        
        //call function to run test
        result = instance.calcForceNeeded(weight, cof);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************************
         * Test Case #4
         **********************************/
        System.out.println("\tTest case #4");
        
        //input values for text case 4
        weight = 60;
        cof = .4;
        expResult = -1;
        
        //call function to run test
        result = instance.calcForceNeeded(weight, cof);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************************
         * Test Case #5
         **********************************/
        System.out.println("\tTest case #5");
        
        //input values for text case 5
        weight = 46.5;
        cof = .5;
        expResult = -1;
        
        //call function to run test
        result = instance.calcForceNeeded(weight, cof);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************************
         * Test Case #6
         **********************************/
        System.out.println("\tTest case #6");
        
        //input values for text case 6
        weight = 38.5;
        cof = .6;
        expResult = -1;
        
        //call function to run test
        result = instance.calcForceNeeded(weight, cof);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        
        /***********************************
         * Test Case #7
         **********************************/
        System.out.println("\tTest case #7");
        
        //input values for text case 7
        weight = 40;
        cof = .7;
        expResult = -1;
        
        //call function to run test
        result = instance.calcForceNeeded(weight, cof);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************************
         * Test Case #8
         **********************************/
        System.out.println("\tTest case #8");
        
        //input values for text case 8
        weight = 1;
        cof = .1;
        expResult = .98;
        
        //call function to run test
        result = instance.calcForceNeeded(weight, cof);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /***********************************
         * Test Case #9
         **********************************/
        System.out.println("\tTest case #9");
        
        //input values for text case 9
        weight = 45.918;
        cof = .5;
        expResult = 224.9982;
        
        //call function to run test
        result = instance.calcForceNeeded(weight, cof);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
    }
    
}
