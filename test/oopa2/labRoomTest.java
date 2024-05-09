/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package oopa2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author conno
 */
public class labRoomTest {
    
    public labRoomTest() {
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
     * Test of setNumberOfPcs method, of class labRoom.
     */
    @Test
    public void testSetNumberOfPcs() {
        System.out.println("setNumberOfPcs");
        int numOfPcs = 1;
        labRoom instance = new labRoom();
        instance.setNumberOfPcs(numOfPcs);
        assertEquals(numOfPcs, instance.getNumberOfPcs());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOperatingSystem method, of class labRoom.
     */
    @Test
    public void testSetOperatingSystem() {
        System.out.println("setOperatingSystem");
        String operatingSystem = "Windows";
        labRoom instance = new labRoom();
        instance.setOperatingSystem(operatingSystem);
        assertEquals(operatingSystem, instance.getOperatingSystems());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfPcs method, of class labRoom.
     */
    @Test
    public void testGetNumberOfPcs() {
        System.out.println("getNumberOfPcs");
        labRoom instance = new labRoom("Lab1-1", 1, 1, 10, 1, "Windows");
        int expResult = 1;
        int result = instance.getNumberOfPcs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOperatingSystems method, of class labRoom.
     */
    @Test
    public void testGetOperatingSystems() {
        System.out.println("getOperatingSystems");
        labRoom instance = new labRoom("Lab1-1", 1, 1, 10, 1, "Windows");
        String expResult = "Windows";
        String result = instance.getOperatingSystems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
