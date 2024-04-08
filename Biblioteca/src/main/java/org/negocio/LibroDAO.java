package org.negocio;

import excepciones.PersistenciaException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.modelo.Copia;
import org.modelo.Libro;
import org.modelo.Prestamo;

public class LibroDAO {

    Control control;

    public LibroDAO() {
        control = Control.getInstance();
    }

    // LO ESENCIAL: AGREGAR MODIFICAR ELIMINAR Y VER
    public boolean agregarLibro(Libro libro) throws PersistenciaException {
            try {
                control.agregarLibro(libro);
                return true;

            } catch (PersistenciaException ex) {
                Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }

    }

    public boolean editarLibro(Libro libro) throws PersistenciaException {
        try {
            control.editarLibro(libro);
            System.out.println(control.obtenerLibros());
            return true;
        } catch (PersistenciaException e) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, e);

        }
        return false;

    }

    public boolean eliminarLibro(String isbn) {
        try {
            control.eliminarLibro(isbn);
            System.out.println(control.obtenerLibros());
            return true;
        } catch (PersistenciaException e) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, e);

        }
        return false;
    }

    public Libro verLibroPorIsbn(String isbn) throws PersistenciaException {
        try {

            return control.verLibroPorIsbn(isbn);

        } catch (PersistenciaException e) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, e);

        }
        return null;
    }

    public Libro verLibroPorTitulo(String titulo) throws PersistenciaException {
        try {

            return control.verLibroPorTitulo(titulo);

        } catch (PersistenciaException e) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, e);

        }
        return null;
    }

    public Libro verLibroPorAutor(String autor) throws PersistenciaException {
        try {

            return control.verLibroPorAutor(autor);

        } catch (PersistenciaException e) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, e);

        }
        return null;
    }

}
