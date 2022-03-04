/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elolop
 */
public class OperacionRestaTest {

    public OperacionRestaTest() {
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
     * Test of resta method, of class OperacionResta.
     */
    @Test
    public void testResta_int_int() {
        System.out.println("resta");
        int x = 100;
        int y = 30;
        int expResult = 70;
        int result = OperacionResta.resta(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class OperacionResta.
     */
    @Test
    public void testResta_double_double() {
        System.out.println("resta");
        double x = 3.5;
        double y = 2.4;
        double expResult = 1.1;
        double result = OperacionResta.resta(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }

}
