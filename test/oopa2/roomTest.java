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
public class roomTest {
    
    public roomTest() {
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
     * Test of setRoomId method, of class room.
     */
    @Test
    public void testSetRoomId() {
        System.out.println("setRoomId");
        String roomId = "Lab1-1";
        room instance = new room();
        instance.setRoomId(roomId);
        assertEquals(roomId, instance.getRoomId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomNumber method, of class room.
     */
    @Test
    public void testSetRoomNumber() {
        System.out.println("setRoomNumber");
        int roomNumber = 1;
        room instance = new room();
        instance.setRoomNumber(roomNumber);
        assertEquals(roomNumber, instance.getRoomNumber());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFloor method, of class room.
     */
    @Test
    public void testSetFloor() {
        System.out.println("setFloor");
        int floor = 1;
        room instance = new room();
        instance.setFloor(floor);
        assertEquals(floor, instance.getFloor());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacity method, of class room.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 23;
        room instance = new room();
        instance.setCapacity(capacity);
        assertEquals(capacity, instance.getCapacity());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomId method, of class room.
     */
    @Test
    public void testGetRoomId() {
        System.out.println("getRoomId");
        room instance = new room("Lab1-1", 1, 1, 10);
        String expResult = "Lab1-1";
        String result = instance.getRoomId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomNumber method, of class room.
     */
    @Test
    public void testGetRoomNumber() {
        System.out.println("getRoomNumber");
        room instance = new room("Lab1-1", 1, 1, 10);
        int expResult = 1;
        int result = instance.getRoomNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFloor method, of class room.
     */
    @Test
    public void testGetFloor() {
        System.out.println("getFloor");
        room instance = new room("Lab1-1", 1, 1, 10);
        int expResult = 1;
        int result = instance.getFloor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class room.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        room instance = new room("Lab1-1", 1, 1, 10);
        int expResult = 10;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


}
