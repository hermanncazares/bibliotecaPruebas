package org.negocio;

import excepciones.PersistenciaException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelo.Libro;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class LibroDAOTest {

    @Mock
    private Control controlMock;

    @InjectMocks
    private LibroDAO libroDAO;

    @BeforeEach
    void setUp() {
        libroDAO = new LibroDAO();
        libroDAO.control = controlMock;
    }

    @Test
    void testAgregarLibro() throws PersistenciaException {
        Libro libro = new Libro("Autor", "Título", "ISBN123", 5);
        when(controlMock.agregarLibro(libro)).thenReturn(true);

        boolean resultado = libroDAO.agregarLibro(libro);

        assertTrue(resultado);
        verify(controlMock, times(1)).agregarLibro(libro);
    }

    @Test
    void testEditarLibro() throws PersistenciaException {
        Libro libro = new Libro("Autor", "Título", "ISBN123", 5);
        when(controlMock.editarLibro(libro)).thenReturn(true);

        boolean resultado = libroDAO.editarLibro(libro);

        assertTrue(resultado);
        verify(controlMock, times(1)).editarLibro(libro);
    }

    @Test
    void testEliminarLibro() throws PersistenciaException {
        String isbn = "ISBN123";
        when(controlMock.eliminarLibro(isbn)).thenReturn(true);

        boolean resultado = libroDAO.eliminarLibro(isbn);

        assertTrue(resultado);
        verify(controlMock, times(1)).eliminarLibro(isbn);
    }

    @Test
    void testVerLibroPorIsbn() throws PersistenciaException {
        String isbn = "ISBN123";
        Libro libroEsperado = new Libro("Autor", "Título", isbn, 5);
        when(controlMock.verLibroPorIsbn(isbn)).thenReturn(libroEsperado);

        Libro resultado = libroDAO.verLibroPorIsbn(isbn);

        assertEquals(libroEsperado, resultado);
        verify(controlMock, times(1)).verLibroPorIsbn(isbn);
    }

}
