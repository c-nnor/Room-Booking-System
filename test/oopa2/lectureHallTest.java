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
public class lectureHallTest {
    
    public lectureHallTest() {
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
     * Test of setMicrophoneType method, of class lectureHall.
     */
    @Test
    public void testSetMicrophoneType() {
        System.out.println("setMicrophoneType");
        String microphoneType = "Lectern";
        lectureHall instance = new lectureHall();
        instance.setMicrophoneType(microphoneType);
        assertEquals(microphoneType, instance.getMicrophoneType());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTieredSeating method, of class lectureHall.
     */
    @Test
    public void testSetTieredSeating() {
        System.out.println("setTieredSeating");
        boolean tieredSeating = false;
        lectureHall instance = new lectureHall();
        instance.setTieredSeating(tieredSeating);
        assertEquals(tieredSeating, instance.getTieredSeating());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMicrophoneType method, of class lectureHall.
     */
    @Test
    public void testGetMicrophoneType() {
        System.out.println("getMicrophoneType");
        lectureHall instance = new lectureHall("Lab1-1", 1, 1, 10, "Lectern", false);
        String expResult = "Lectern";
        String result = instance.getMicrophoneType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTieredSeating method, of class lectureHall.
     */
    @Test
    public void testGetTieredSeating() {
        System.out.println("getTieredSeating");
        lectureHall instance = new lectureHall("Lab1-1", 1, 1, 10, "Lectern", false);
        boolean expResult = false;
        boolean result = instance.getTieredSeating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
