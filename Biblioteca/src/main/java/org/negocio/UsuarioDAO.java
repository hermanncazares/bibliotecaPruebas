
package org.negocio;

import excepciones.PersistenciaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.modelo.Usuario;


public class UsuarioDAO implements IUsuario{

    Control control;

    public UsuarioDAO() {
        control = Control.getInstance();

    }

    @Override
    public Usuario buscarUsuarioPorId(int id) {

        try {
            return control.buscarUsuarioPorId(id);
        } catch (PersistenciaException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
