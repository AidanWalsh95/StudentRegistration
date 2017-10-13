/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.aidan.student.registration.project;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class StudentTest {
    
      Student aidan = new Student("Aidan", "Walsh", 22, "1995-08-17", 14467852);

    /**
     * Test of getUsername method, of class Student.
     */
    @Test
    public void testGetUsername() {

        String expResult = "AidanWalsh22";
        String result = aidan.getUsername();
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
}
