package org.negocio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import excepciones.PersistenciaException;
import org.modelo.Usuario;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.modelo.TipoUsuario;

@ExtendWith(MockitoExtension.class)
public class UsuarioDAOTest {

    @Mock
    private Control controlMock;
    private UsuarioDAO usuarioDAO;

    @BeforeEach
    public void setUp() {
        usuarioDAO = new UsuarioDAO();
        usuarioDAO.control = controlMock;
    }

    @Test
    public void testBuscarUsuarioPorId() throws PersistenciaException {
        // Configuración del caso de prueba
        Usuario usuarioEsperado = new Usuario(1, "Nombre", "Apellido", TipoUsuario.BIBLIOTECARIO, "contraseña", "usuario");
        when(controlMock.buscarUsuarioPorId(1)).thenReturn(usuarioEsperado);

        // Ejecución del método a probar
        Usuario usuarioObtenido = usuarioDAO.buscarUsuarioPorId(1);

        // Verificación
        assertEquals(usuarioEsperado, usuarioObtenido);
        verify(controlMock, times(1)).buscarUsuarioPorId(1); // Verificamos que el método de control se haya llamado exactamente una vez con el argumento 1
    }
}
