
package org.negocio;

import excepciones.PersistenciaException;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelo.Libro;


/**
 *
 * @author Jairi
 */
@ExtendWith(MockitoExtension.class)
public class LibroDAOTest {
    
    @Mock
    Control controlMock;
    
    @InjectMocks
    LibroDAO libroDAOMock;
    
    
    public LibroDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregarLibro method, of class LibroDAO.
     */
    @Test
    public void testAgregarLibro() throws PersistenciaException {
        Libro libroEsperado = new Libro("Cervantes", "Quijote", "1212dwqw", 2);
        
        //Se define el comportamiento del Mock
        Mockito.when(controlMock.agregarLibro(libroEsperado)).thenReturn(true);
        
        //Se ejecuta el metodo a probar
        boolean resultado = libroDAOMock.agregarLibro(libroEsperado);
        
        //Se verifica que el metodo haya sido invocado
        verify(controlMock).agregarLibro(libroEsperado);
        
        //Verfica el resultado
        assertTrue(resultado);
    }

    /**
     * Test of editarLibro method, of class LibroDAO.
     */
    @Test
    public void testEditarLibro() throws PersistenciaException {
        Libro libroEsperado = new Libro("Borges", "Ficciones", "qwerteqiy", 5);
        
        //Comportamiento del mock
        Mockito.when(controlMock.editarLibro(libroEsperado)).thenThrow(new PersistenciaException("ERROR EDICION DEL LIBRO"));
        
        //Ejecucion del metodo a probar
        boolean resultado = libroDAOMock.editarLibro(libroEsperado);
        
        //Verificacion del metodo invocado
        verify(controlMock).editarLibro(libroEsperado);
        
        //Verifica el resultado
        assertFalse(resultado);
    }

    /**
     * Test of eliminarLibro method, of class LibroDAO.
     * Este Test revisa que un libro pueda ser borrado exitosamente
     */
    @Test
    public void testEliminarLibroExito() throws PersistenciaException {
        String isbn = "123456789";
        
        //Cuando eliminarLibro se invocado, regresa 'true'
        doNothing().when(controlMock).eliminarLibro(isbn);
        
        boolean resultado = libroDAOMock.eliminarLibro(isbn);
        
        //Verifica que eliminarLibro fue invocado con la isbn correcta
        verify(controlMock).eliminarLibro(isbn);
        
        //Acierta si el resultado es 'True'
        assertTrue(resultado);
    }

    /*
      Este test revisa que un libro 
    */
    @Test
    public void testEliminarLibroFalla() throws PersistenciaException {
        String isbn = "123456789";
        
        //Cuando eliminarLibro es invocado, lanza una'PersistenciaException'
        Mockito.doThrow(new PersistenciaException("Error al eliminar el libro")).when(controlMock).eliminarLibro(isbn);
        
        boolean resultado = libroDAOMock.eliminarLibro(isbn);
        
        //Verifica que eliminarLibro fue invocado con la isbn correcta
        verify(controlMock).eliminarLibro(isbn);
        
        //Acierta si el resultado es 'True'
        assertFalse(resultado);
    }
    
    /**
     * Test of verLibroPorIsbn method, of class LibroDAO.
     */
    @Test
    public void testVerLibroPorIsbnExito() throws PersistenciaException {
        String isbn = "123456789";
        Libro libroEsperado = new Libro("Huxley", "Mundo Feliz", isbn, 6);
        
        //Cuando verLibroPorIsbnExito sea invocado, debe retornar 'libroEsperado'
        Mockito.when(controlMock.verLibroPorIsbn(isbn)).thenReturn(libroEsperado);
        
        Libro resultado = libroDAOMock.verLibroPorIsbn(isbn);
        
        //Verifica que verLibroPorIsbn sea invocado con el isbn correcto
        verify(controlMock).verLibroPorIsbn(isbn);
        
        //Confirma que el resultado sea 'libroEsperado'
        assertEquals(libroEsperado, resultado);
    }
    
    @Test
    public void testVerLibroPorIsbnFalla() throws PersistenciaException {
        String isbn = "123456789";
        
        //Cuando verLibroPorIsbn es invocado, lanza una PersistenciaException
        Mockito.when(controlMock.verLibroPorIsbn(isbn)).thenThrow(new PersistenciaException("Error en la consulta de este isbn"));
        
        assertThrows(PersistenciaException.class,()-> {
            libroDAOMock.verLibroPorIsbn(isbn);
        });
        
        //Verifica que verLibroPorIsbn fue invocado por el correcto isbn
        verify(controlMock).verLibroPorIsbn(isbn);
    }

    /**
     * Test of verLibroPorTitulo method, of class LibroDAO.
     */
    @Test
    public void testVerLibroPorTitulo() throws Exception {
        System.out.println("verLibroPorTitulo");
        String titulo = "El libro trol";
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
