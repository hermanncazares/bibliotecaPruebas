package org.negocio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import excepciones.PersistenciaException;
import org.modelo.Copia;
import org.modelo.Prestamo;
import org.modelo.Usuario;
import java.util.Date;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.modelo.EstadoCopia;
import org.modelo.Libro;
import org.modelo.TipoUsuario;

@ExtendWith(MockitoExtension.class)
public class PrestamoDAOTest {

    @Mock
    private Control controlMock;

    private PrestamoDAO prestamoDAO;

    @BeforeEach
    public void setUp() {
        prestamoDAO = new PrestamoDAO();
        prestamoDAO.control = controlMock;
    }

    @Test
    public void testRegistrarPrestamo() throws PersistenciaException {
        // Configuración del caso de prueba
        Usuario usuario = new Usuario("nombre", "apellido", TipoUsuario.BIBLIOTECARIO, "contraseña", "usuario");
        Libro libro = new Libro("Autor", "Título", "ISBN123", 5);
        Copia copia = new Copia(EstadoCopia.DISPONIBLE, libro);
        List<Copia> copias = List.of(copia);
        Prestamo prestamo = new Prestamo(new Date(), new Date(), usuario, copias);
        when(controlMock.registrarPrestamo(prestamo)).thenReturn(true);

        // Ejecución del método a probar
        boolean resultado = prestamoDAO.registrarPrestamo(prestamo);

        // Verificación
        assertTrue(resultado);
        verify(controlMock, times(1)).registrarPrestamo(prestamo);
    }

    @Test
    public void testVerPrestamoExistente() throws PersistenciaException {
        // Configuración del caso de prueba
        int idPrestamo = 1;
        Libro libro = new Libro("Autor", "Título", "ISBN123", 5);
        Copia copia = new Copia(EstadoCopia.DISPONIBLE, libro);
        List<Copia> copias = List.of(copia);
        Prestamo prestamoEsperado = new Prestamo(idPrestamo, null, copias, new Date(), new Date());
        when(controlMock.verPrestamo(idPrestamo)).thenReturn(prestamoEsperado);

        // Ejecución del método a probar
        Prestamo resultado = prestamoDAO.verPrestamo(idPrestamo);

        // Verificación
        assertEquals(prestamoEsperado, resultado);
        verify(controlMock, times(1)).verPrestamo(idPrestamo);
    }

}
