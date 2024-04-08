package org.negocio;

import excepciones.PersistenciaException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.modelo.Copia;
import org.modelo.Prestamo;

public class PrestamoDAO {

    Control control;

    public PrestamoDAO() {
        control = Control.getInstance();

    }

    public boolean registrarPrestamo(Prestamo prestamo) throws PersistenciaException {

        try {
            List<Copia> copias = prestamo.getListaCopias();

            for (Copia cop : copias) {
                if (copias.size() > cop.getLibro().getNumCopias()) {
                    System.out.println(copias.size() + " > " + cop.getLibro().getNumCopias());
                    return false;
                }
            }

            control.registrarPrestamo(prestamo);
            return true;
        } catch (PersistenciaException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public Prestamo verPrestamo(int idPrestamo) {
        try {
            return control.verPrestamo(idPrestamo);
        } catch (PersistenciaException ex) {
            Logger.getLogger(PrestamoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
