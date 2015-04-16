/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testcasesfeature2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class TestCasesFeature2Test {
    
    public TestCasesFeature2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class TestCasesFeature2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TestCasesFeature2.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void divide(){
        System.out.println("divide");
        int currentFee = 350;
        int discountOf = 10;
        int expResult = 35;
        int result = TestCasesFeature2.divide(currentFee, discountOf);
        assertEquals(expResult, result);
    }
    
}
