/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ed.u3.pkg4.ex;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Eloy Beltrán López
 */
public class EDU34ExTest {

    public EDU34ExTest() {
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
     * Test of suma method, of class EDU34Ex.
     */
    @Test
    public void testSuma_int_int() {
        System.out.println("suma");
        int a = 100;
        int b = 30;
        int expResult = 130;
        int result = EDU34Ex.suma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of suma method, of class EDU34Ex.
     */
    @Test
    public void testSuma_double_double() {
        System.out.println("suma");
        double a = 30.5;
        double b = 100.4;
        double expResult = 130.9;
        double result = EDU34Ex.suma(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class EDU34Ex.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double a = 100.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = EDU34Ex.divide(a, b);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class EDU34Ex.
     */
    @Ignore
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EDU34Ex.main(args);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
