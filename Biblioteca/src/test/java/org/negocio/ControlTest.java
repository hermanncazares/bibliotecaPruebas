/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.negocio;

import excepciones.PersistenciaException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.modelo.Copia;
import org.modelo.Libro;
import org.modelo.Prestamo;
import org.modelo.Usuario;

/**
 *
 * @author Jairi
 */
public class ControlTest {
    
    @Mock
    private Libro libroMock; //Objeto Simulado para un libro
    
    @Mock
    private Usuario usuarioMock;//Objeto Simulado para un usuario
    
    @InjectMocks
    private Control control; //Clase bajo prueba
    
    
    public ControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        
        MockitoAnnotations.openMocks(this);
        
        control = Control.getInstance();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregarLibro method, of class Control.
     */
    @Test
    public void testAgregarLibro() throws PersistenciaException {
//        boolean esperado = new boolean()
//        
//        Mockito.when(control.agregarLibro(libroMock));
    }

    /**
     * Test of editarLibro method, of class Control.
     */
    @Test
    public void testEditarLibro() throws Exception {
        System.out.println("editarLibro");
        Libro libro = null;
        Control instance = null;
        boolean expResult = false;
        boolean result = instance.editarLibro(libro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarLibro method, of class Control.
     */
    @Test
    public void testEliminarLibro() throws PersistenciaException {
        // Agregamos un libro mock a la lista de libros
        control.obtenerLibros().add(libroMock);
        // Verificamos que la lista de libros contenga al menos un libro
        assertFalse(control.obtenerLibros().isEmpty());
        // Simulamos el comportamiento del método eliminarLibro para que no lance excepciones
        when(control.eliminarLibro(anyString())).thenReturn(true);
        // Llamamos al método eliminarLibro con el ISBN de un libro mock
        assertTrue(control.eliminarLibro("1234567890"));
        // Verificamos que el libro fue eliminado de la lista
        assertFalse(control.obtenerLibros().contains(libroMock));
    }

    /**
     * Test of verLibroPorIsbn method, of class Control.
     */
    @Test
    public void testVerLibroPorIsbn() throws Exception {
        System.out.println("verLibroPorIsbn");
        String isbn = "";
        Control instance = null;
        Libro expResult = null;
        Libro result = instance.verLibroPorIsbn(isbn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verLibroPorTitulo method, of class Control.
     */
    @Test
    public void testVerLibroPorTitulo() throws Exception {
        System.out.println("verLibroPorTitulo");
        String titulo = "";
        Control instance = null;
        Libro expResult = null;
        Libro result = instance.verLibroPorTitulo(titulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verLibroPorAutor method, of class Control.
     */
    @Test
    public void testVerLibroPorAutor() throws Exception {
        System.out.println("verLibroPorAutor");
        String autor = "";
        Control instance = null;
        Libro expResult = null;
        Libro result = instance.verLibroPorAutor(autor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarPrestamo method, of class Control.
     */
    @Test
    public void testRegistrarPrestamo() throws Exception {
        System.out.println("registrarPrestamo");
        Prestamo prestamo = null;
        Control instance = null;
        boolean expResult = false;
        boolean result = instance.registrarPrestamo(prestamo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarUsuarioPorId method, of class Control.
     */
    @Test
    public void testBuscarUsuarioPorId() throws Exception {
        System.out.println("buscarUsuarioPorId");
        int id = 0;
        Control instance = null;
        Usuario expResult = null;
        Usuario result = instance.buscarUsuarioPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verPrestamo method, of class Control.
     */
    @Test
    public void testVerPrestamo() throws Exception {
        System.out.println("verPrestamo");
        int idPrestamo = 0;
        Control instance = null;
        Prestamo expResult = null;
        Prestamo result = instance.verPrestamo(idPrestamo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of regex method, of class Control.
     */
    @Test
    public void testRegex() {
        System.out.println("regex");
        String expresionRegular = "";
        String texto = "";
        Control instance = null;
        boolean expResult = false;
        boolean result = instance.regex(expresionRegular, texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearUsuarios method, of class Control.
     */
    @Test
    public void testCrearUsuarios() {
        System.out.println("crearUsuarios");
        Control instance = null;
        instance.crearUsuarios();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerLibros method, of class Control.
     */
    @Test
    public void testObtenerLibros() {
        System.out.println("obtenerLibros");
        Control instance = null;
        List<Libro> expResult = null;
        List<Libro> result = instance.obtenerLibros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuarios method, of class Control.
     */
    @Test
    public void testObtenerUsuarios() {
        System.out.println("obtenerUsuarios");
        Control instance = null;
        List<Usuario> expResult = null;
        List<Usuario> result = instance.obtenerUsuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPrestamos method, of class Control.
     */
    @Test
    public void testObtenerPrestamos() {
        System.out.println("obtenerPrestamos");
        Control instance = null;
        List<Prestamo> expResult = null;
        List<Prestamo> result = instance.obtenerPrestamos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCopias method, of class Control.
     */
    @Test
    public void testObtenerCopias() {
        System.out.println("obtenerCopias");
        Control instance = null;
        List<Copia> expResult = null;
        List<Copia> result = instance.obtenerCopias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
