/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.modelo;

import java.util.Date;
import java.util.List;
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
public class PrestamoTest {
    
    public PrestamoTest() {
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
     * Test of getIdPrestamo method, of class Prestamo.
     */
    @Test
    public void testGetIdPrestamo() {
        System.out.println("getIdPrestamo");
        int expResult = 0;
        int result = Prestamo.getIdPrestamo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Prestamo.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Prestamo instance = null;
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Prestamo.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        Prestamo instance = null;
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaCopias method, of class Prestamo.
     */
    @Test
    public void testGetListaCopias() {
        System.out.println("getListaCopias");
        Prestamo instance = null;
        List<Copia> expResult = null;
        List<Copia> result = instance.getListaCopias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaCopias method, of class Prestamo.
     */
    @Test
    public void testSetListaCopias() {
        System.out.println("setListaCopias");
        List<Copia> listaCopias = null;
        Prestamo instance = null;
        instance.setListaCopias(listaCopias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaInicio method, of class Prestamo.
     */
    @Test
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        Prestamo instance = null;
        Date expResult = null;
        Date result = instance.getFechaInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaInicio method, of class Prestamo.
     */
    @Test
    public void testSetFechaInicio() {
        System.out.println("setFechaInicio");
        Date fechaInicio = null;
        Prestamo instance = null;
        instance.setFechaInicio(fechaInicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaFin method, of class Prestamo.
     */
    @Test
    public void testGetFechaFin() {
        System.out.println("getFechaFin");
        Prestamo instance = null;
        Date expResult = null;
        Date result = instance.getFechaFin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaFin method, of class Prestamo.
     */
    @Test
    public void testSetFechaFin() {
        System.out.println("setFechaFin");
        Date fechaFin = null;
        Prestamo instance = null;
        instance.setFechaFin(fechaFin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Prestamo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Prestamo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
