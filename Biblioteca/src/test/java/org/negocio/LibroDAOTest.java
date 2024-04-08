/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.negocio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.modelo.Libro;

/**
 *
 * @author Jairi
 */
public class LibroDAOTest {
    
    public LibroDAOTest() {
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
     * Test of agregarLibro method, of class LibroDAO.
     */
    @Test
    public void testAgregarLibro() throws Exception {
        System.out.println("agregarLibro");
        Libro libro = null;
        LibroDAO instance = new LibroDAO();
        boolean expResult = false;
        boolean result = instance.agregarLibro(libro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarLibro method, of class LibroDAO.
     */
    @Test
    public void testEditarLibro() throws Exception {
        System.out.println("editarLibro");
        Libro libro = null;
        LibroDAO instance = new LibroDAO();
        boolean expResult = false;
        boolean result = instance.editarLibro(libro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarLibro method, of class LibroDAO.
     */
    @Test
    public void testEliminarLibro() {
        System.out.println("eliminarLibro");
        String isbn = "";
        LibroDAO instance = new LibroDAO();
        boolean expResult = false;
        boolean result = instance.eliminarLibro(isbn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verLibroPorIsbn method, of class LibroDAO.
     */
    @Test
    public void testVerLibroPorIsbn() throws Exception {
        System.out.println("verLibroPorIsbn");
        String isbn = "";
        LibroDAO instance = new LibroDAO();
        Libro expResult = null;
        Libro result = instance.verLibroPorIsbn(isbn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verLibroPorTitulo method, of class LibroDAO.
     */
    @Test
    public void testVerLibroPorTitulo() throws Exception {
        System.out.println("verLibroPorTitulo");
        String titulo = "";
        LibroDAO instance = new LibroDAO();
        Libro expResult = null;
        Libro result = instance.verLibroPorTitulo(titulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verLibroPorAutor method, of class LibroDAO.
     */
    @Test
    public void testVerLibroPorAutor() throws Exception {
        System.out.println("verLibroPorAutor");
        String autor = "";
        LibroDAO instance = new LibroDAO();
        Libro expResult = null;
        Libro result = instance.verLibroPorAutor(autor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
