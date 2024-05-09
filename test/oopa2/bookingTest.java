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
public class bookingTest {
    
    public bookingTest() {
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
     * Test of setBookingId method, of class booking.
     */
    @Test
    public void testSetBookingId() {
        System.out.println("setBookingId");
        int bookingId = 1;
        booking instance = new booking();
        instance.setBookingId(bookingId);
        assertEquals(bookingId, instance.getBookingId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomId method, of class booking.
     */
    @Test
    public void testSetRoomId() {
        System.out.println("setRoomId");
        String roomId = "1";
        booking instance = new booking();
        instance.setRoomId(roomId);
        assertEquals(roomId, instance.getRoomId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class booking.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "12/04/2024";
        booking instance = new booking();
        instance.setDate(date);
        assertEquals(date, instance.getDate());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTime method, of class booking.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String time = "9:00 - 11:00";
        booking instance = new booking();
        instance.setTime(time);
        assertEquals(time, instance.getTime());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setContactPerson method, of class booking.
     */
    @Test
    public void testSetContactPerson() {
        System.out.println("setContactPerson");
        String person = "Connor Charnock";
        booking instance = new booking();
        instance.setContactPerson(person);
        assertEquals(person, instance.getContactPerson());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setContactEmail method, of class booking.
     */
    @Test
    public void testSetContactEmail() {
        System.out.println("setContactEmail");
        String email = "connorcharnock@hotmail.co.uk";
        booking instance = new booking();
        instance.setContactEmail(email);
        assertEquals(email, instance.getContactEmail());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setContactPhone method, of class booking.
     */
    @Test
    public void testSetContactPhone() {
        System.out.println("setContactPhone");
        String phone = "07733994204";
        booking instance = new booking();
        instance.setContactPhone(phone);
        assertEquals(phone, instance.getContactPhone());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBookingId method, of class booking.
     */
    @Test
    public void testGetBookingId() {
        System.out.println("getBookingId");
        booking instance = new booking(111, "Lab1-1", "28/04/2024", "9:00 - 11:00", "Connor Charnock", "connorcharnock@hotmail.co.uk", "07733994204");
        int expResult = 111;
        int result = instance.getBookingId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomId method, of class booking.
     */
    @Test
    public void testGetRoomId() {
        booking instance = new booking(111, "Lab1-1", "28/04/2024", "9:00 - 11:00", "Connor Charnock", "connorcharnock@hotmail.co.uk", "07733994204");
        String expResult = "Lab1-1";
        String result = instance.getRoomId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class booking.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        booking instance = new booking(111, "Lab1-1", "28/04/2024", "9:00 - 11:00", "Connor Charnock", "connorcharnock@hotmail.co.uk", "07733994204");
        String expResult = "28/04/2024";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class booking.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        booking instance = new booking(111, "Lab1-1", "28/04/2024", "9:00 - 11:00", "Connor Charnock", "connorcharnock@hotmail.co.uk", "07733994204");
        String expResult = "9:00 - 11:00";
        String result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getContactPerson method, of class booking.
     */
    @Test
    public void testGetContactPerson() {
        System.out.println("getContactPerson");
        booking instance = new booking(111, "Lab1-1", "28/04/2024", "9:00 - 11:00", "Connor Charnock", "connorcharnock@hotmail.co.uk", "07733994204");
        String expResult = "Connor Charnock";
        String result = instance.getContactPerson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getContactEmail method, of class booking.
     */
    @Test
    public void testGetContactEmail() {
        System.out.println("getContactEmail");
        booking instance = new booking(111, "Lab1-1", "28/04/2024", "9:00 - 11:00", "Connor Charnock", "connorcharnock@hotmail.co.uk", "07733994204");
        String expResult = "connorcharnock@hotmail.co.uk";
        String result = instance.getContactEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getContactPhone method, of class booking.
     */
    @Test
    public void testGetContactPhone() {
        System.out.println("getContactPhone");
        booking instance = new booking(111, "Lab1-1", "28/04/2024", "9:00 - 11:00", "Connor Charnock", "connorcharnock@hotmail.co.uk", "07733994204");
        String expResult = "07733994204";
        String result = instance.getContactPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   
    
}
