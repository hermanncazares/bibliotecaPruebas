/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jairi
 */
public class CopiaTest {
    
    public CopiaTest() {
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
     * Test of getId method, of class Copia.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Copia instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Copia.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Copia instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLibro method, of class Copia.
     */
    @Test
    public void testGetLibro() {
        System.out.println("getLibro");
        Copia instance = null;
        Libro expResult = null;
        Libro result = instance.getLibro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLibro method, of class Copia.
     */
    @Test
    public void testSetLibro() {
        System.out.println("setLibro");
        Libro libro = null;
        Copia instance = null;
        instance.setLibro(libro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoCopia method, of class Copia.
     */
    @Test
    public void testGetEstadoCopia() {
        System.out.println("getEstadoCopia");
        Copia instance = null;
        EstadoCopia expResult = null;
        EstadoCopia result = instance.getEstadoCopia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoCopia method, of class Copia.
     */
    @Test
    public void testSetEstadoCopia() {
        System.out.println("setEstadoCopia");
        EstadoCopia estadoCopia = null;
        Copia instance = null;
        instance.setEstadoCopia(estadoCopia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrestamo method, of class Copia.
     */
    @Test
    public void testGetPrestamo() {
        System.out.println("getPrestamo");
        Copia instance = null;
        Prestamo expResult = null;
        Prestamo result = instance.getPrestamo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrestamo method, of class Copia.
     */
    @Test
    public void testSetPrestamo() {
        System.out.println("setPrestamo");
        Prestamo prestamo = null;
        Copia instance = null;
        instance.setPrestamo(prestamo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asignarCopiaPrestamo method, of class Copia.
     */
    @Test
    public void testAsignarCopiaPrestamo() {
        System.out.println("asignarCopiaPrestamo");
        Prestamo prestamo = null;
        Copia.asignarCopiaPrestamo(prestamo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Copia.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Copia instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
