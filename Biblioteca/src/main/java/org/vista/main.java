/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.vista;

import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.modelo.Copia;
import org.modelo.EstadoCopia;
import org.modelo.Libro;
import org.modelo.Prestamo;
import org.modelo.TipoUsuario;
import org.modelo.Usuario;
import org.negocio.Control;
import org.negocio.LibroDAO;

/**
 *
 * @author fabri
 */
public class main {
    
    public static void main(String[] args) throws PersistenciaException {
        Control control = Control.getInstance();
//        frmNuevoLibro n = new frmNuevoLibro(control);
//        n.setVisible(true);
        Libro libro = new Libro("ferderico", "hambre de poder", "123456", 5);
        Libro libro2 = new Libro("otro libro 2", "sexin de poder", "2224122", 2);
        Libro libro3 = new Libro("otro libro 3", "macho alfa de poder", "985472", 10);
        LibroDAO dao = new LibroDAO();
        dao.agregarLibro(libro);
        dao.agregarLibro(libro2);
        dao.agregarLibro(libro3);

//        frmEditarLibro e = new frmEditarLibro(control);
//        e.setVisible(true);
//        frmEliminarLibro l = new frmEliminarLibro(control);
//        l.setVisible(true);
        // USUARIO PIDE PRESTADOS N LIBROS -> SE VERIFICA CANTIDAD SOLICITADA < CANTIDAD REAL DE CADA LIBRO -> SE REGISTRA PRESATMO -> SE DESCUENTAN COPIAS
        control.crearUsuarios();
        System.out.println(control.obtenerUsuarios());
        Usuario user = new Usuario(21, "chaka", "csssa", TipoUsuario.BIBLIOTECARIO, "123", "123");
//        frmPrestamo f = new frmPrestamo(control, user);
//        f.setVisible(true);
//List<Copia> copias = new ArrayList<>();
//copias.add(new Copia(EstadoCopia.PRESTADO, libro));
//copias.add(new Copia(EstadoCopia.PRESTADO, libro2));
//copias.add(new Copia(EstadoCopia.PRESTADO, libro3));
//Prestamo prestamo = new Prestamo(new Date(), new Date(124, 01, 30), user, copias);
//    control.registrarPrestamo(prestamo);
////        frmDevolucion f = new frmDevolucion(user, control);
////        f.setVisible(true);
//frmVerLibro v = new frmVerLibro(control);
//v.setVisible(true);
    }
}
