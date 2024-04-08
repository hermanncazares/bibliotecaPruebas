/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.modelo;

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
public class LibroTest {
    
    public LibroTest() {
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
     * Test of getIDLibro method, of class Libro.
     */
    @Test
    public void testGetIDLibro() {
        System.out.println("getIDLibro");
        Libro instance = null;
        int expResult = 0;
        int result = instance.getIDLibro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdLibro method, of class Libro.
     */
    @Test
    public void testGetIdLibro() {
        System.out.println("getIdLibro");
        int expResult = 0;
        int result = Libro.getIdLibro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdLibro method, of class Libro.
     */
    @Test
    public void testSetIdLibro() {
        System.out.println("setIdLibro");
        int idLibro = 0;
        Libro.setIdLibro(idLibro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumCopias method, of class Libro.
     */
    @Test
    public void testGetNumCopias() {
        System.out.println("getNumCopias");
        Libro instance = null;
        int expResult = 0;
        int result = instance.getNumCopias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumCopias method, of class Libro.
     */
    @Test
    public void testSetNumCopias() {
        System.out.println("setNumCopias");
        int numCopias = 0;
        Libro instance = null;
        instance.setNumCopias(numCopias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaCopias method, of class Libro.
     */
    @Test
    public void testGetListaCopias() {
        System.out.println("getListaCopias");
        Libro instance = null;
        List<Copia> expResult = null;
        List<Copia> result = instance.getListaCopias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaCopias method, of class Libro.
     */
    @Test
    public void testSetListaCopias() {
        System.out.println("setListaCopias");
        List<Copia> listaCopias = null;
        Libro instance = null;
        instance.setListaCopias(listaCopias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreAutor method, of class Libro.
     */
    @Test
    public void testGetNombreAutor() {
        System.out.println("getNombreAutor");
        Libro instance = null;
        String expResult = "";
        String result = instance.getNombreAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreAutor method, of class Libro.
     */
    @Test
    public void testSetNombreAutor() {
        System.out.println("setNombreAutor");
        String nombre = "";
        Libro instance = null;
        instance.setNombreAutor(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Libro.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Libro instance = null;
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Libro.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Libro instance = null;
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getISBN method, of class Libro.
     */
    @Test
    public void testGetISBN() {
        System.out.println("getISBN");
        Libro instance = null;
        String expResult = "";
        String result = instance.getISBN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setISBN method, of class Libro.
     */
    @Test
    public void testSetISBN() {
        System.out.println("setISBN");
        String ISBN = "";
        Libro instance = null;
        instance.setISBN(ISBN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCopias method, of class Libro.
     */
    @Test
    public void testGetCopias() {
        System.out.println("getCopias");
        Libro instance = null;
        List<Copia> expResult = null;
        List<Copia> result = instance.getCopias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCopia method, of class Libro.
     */
    @Test
    public void testSetCopia() {
        System.out.println("setCopia");
        Copia copia = null;
        Libro instance = null;
        instance.setCopia(copia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Libro.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Libro instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
