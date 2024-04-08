/**
 *
 * Esta clase simula un poco el comportamiento de la base de datos
 * Tambien, los daos heredan aqui parte de la persistencia
 *
 * VISTA -> NEGOCIO (DAO -> CONTROL) -> MODELO
 *
 */
package org.negocio;

import excepciones.PersistenciaException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.modelo.*;

public class Control {

    private static Control instance;
    private final List<Libro> listaLibros;
    private final List<Usuario> listaUsuarios;
    private final List<Copia> listaCopias;
    private List<Prestamo> listaPrestamos;

    private Control() {
        listaLibros = new ArrayList<>();
        listaUsuarios = new ArrayList<>();
        listaCopias = new ArrayList<>();
        listaPrestamos = new ArrayList<>();
    }

    /**
     * Para simular un poco mejor la base de datos, implementamos un patron
     * Singleton
     *
     * @return regresa una unica instancia de la clase
     */
    public static Control getInstance() {
        if (instance == null) {
            instance = new Control();
        }
        return instance;
    }

    public boolean agregarLibro(Libro libro) throws PersistenciaException {
        try {
            listaLibros.add(libro);
            return true;

        } catch (Exception e) {
            throw new PersistenciaException("Error al agregar el libro\n" + e);
        }
    }

    public boolean editarLibro(Libro libro) throws PersistenciaException {
        try {
            for (Libro l : listaLibros) {
                if (libro.getISBN().equals(l.getISBN())) {
                    listaLibros.set(listaLibros.indexOf(l), libro);
                    return true;
                }
            }
            throw new PersistenciaException("El ISBN es incorrecto o no existe");

        } catch (Exception e) {
            throw new PersistenciaException("Error al editar el libro, intente de nuevo" + e);
        }
    }

    public boolean eliminarLibro(String isbn) throws PersistenciaException {
        try {
            try {
                for (Libro l : listaLibros) {
                    if (l.getISBN().equals(isbn)) {
                        listaLibros.remove(l);
                        return true;
                    }
                }
            } catch (Exception e) {
                throw new PersistenciaException("El ISBN es incorrecto o no existe");

            }

        } catch (Exception e) {
            throw new PersistenciaException("Error al eliminar el libro, intente de nuevo" + e);
        }
        return false;
    }

    public Libro verLibroPorIsbn(String isbn) throws PersistenciaException {
        try {
            try {
                for (Libro l : listaLibros) {
                    if (l.getISBN().equals(isbn)) {
                        return l;
                    }
                }
            } catch (Exception e) {
                throw new PersistenciaException("El ISBN es incorrecto o no existe");

            }

        } catch (Exception e) {
            throw new PersistenciaException("Error al obtener el libro, intente de nuevo" + e);
        }
        return null;
    }

    public Libro verLibroPorTitulo(String titulo) throws PersistenciaException {
        try {
            try {
                for (Libro l : listaLibros) {
                    if (l.getTitulo().equals(titulo)) {
                        return l;
                    }
                }
            } catch (Exception e) {
                throw new PersistenciaException("El titulo es incorrecto o no existe");

            }

        } catch (Exception e) {
            throw new PersistenciaException("Error al obtener el libro" + e);
        }
        return null;
    }

    public Libro verLibroPorAutor(String autor) throws PersistenciaException {
        try {
            try {
                for (Libro l : listaLibros) {
                    if (l.getNombreAutor().equals(autor)) {
                        return l;
                    }
                }
            } catch (Exception e) {
                throw new PersistenciaException("El ISBN es incorrecto o no existe");

            }

        } catch (Exception e) {
            throw new PersistenciaException("Error al obtener el libro, intente de nuevo" + e);
        }
        return null;
    }

    public boolean registrarPrestamo(Prestamo prestamo) throws PersistenciaException {
        try {
            listaPrestamos.add(prestamo);
            return true;
        } catch (Exception e) {
            throw new PersistenciaException("Error al registrar el prestamo, intente de nuevo" + Arrays.toString(e.getStackTrace()));
        }
    }

    public Usuario buscarUsuarioPorId(int id) throws PersistenciaException {
        try {
            for (Usuario u : listaUsuarios) {
                if (u.getId() == id) {
                    return u;
                }
            }
            throw new PersistenciaException("El usuario no existe, o su id es incorrecto");
        } catch (Exception e) {
            throw new PersistenciaException("Error al obtener el usuario, intente de nuevo" + e);

        }
    }

    public Prestamo verPrestamo(int idPrestamo) throws PersistenciaException {
        System.out.println(listaPrestamos);
        try {
            for (Prestamo p : listaPrestamos) {
                if (p.getIdPrestamo() == idPrestamo) {
                    return p;
                }
            }
            throw new PersistenciaException("El prestamo no existe, o su id es incorrecto");

        } catch (Exception e) {
            throw new PersistenciaException("Error al obtener el prestamo, intente de nuevo" + e);

        }
    }

    public boolean regex(String expresionRegular, String texto) {
        Pattern pattern = Pattern.compile(expresionRegular);
        Matcher matcher = pattern.matcher(texto);
        return matcher.matches();
    }

    public void crearUsuarios() {
        for (int i = 0; i < 20; i++) {
            Usuario usuario = new Usuario((i + 1), generarApellidoAleatorio(), generarApellidoAleatorio(), generarEstadoAleatorio(), generarContraseñaAleatoria(10), generarUsuarioAleatorio());
//            Usuario usuario = new Usuario( generarApellidoAleatorio(), generarApellidoAleatorio(), generarEstadoAleatorio(), generarContraseñaAleatoria(10), generarUsuarioAleatorio());
            listaUsuarios.add(usuario);
        }
    }

    private String generarUsuarioAleatorio() {
        SecureRandom random = new SecureRandom();
        StringBuilder usuarioAleatorio = new StringBuilder();

        int longitud = random.nextInt(6) + 5;
        for (int i = 0; i < longitud; i++) {
            char caracter = (char) (random.nextInt(26) + 'a');
            usuarioAleatorio.append(caracter);
        }

        return usuarioAleatorio.toString();
    }

    private String generarApellidoAleatorio() {
        Random random = new Random();
        StringBuilder apellidoAleatorio = new StringBuilder();

        int longitud = random.nextInt(6) + 5;
        for (int i = 0; i < longitud; i++) {
            char caracter = (char) (random.nextInt(26) + 'a');
            apellidoAleatorio.append(caracter);
        }

        return apellidoAleatorio.toString();
    }

    private String generarContraseñaAleatoria(int longitud) {
        SecureRandom random = new SecureRandom();
        StringBuilder contraseñaAleatoria = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+{}[]|:;<>,.?/~".length());
            contraseñaAleatoria.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+{}[]|:;<>,.?/~".charAt(indice));
        }

        return contraseñaAleatoria.toString();
    }

    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    public List<Usuario> obtenerUsuarios() {
        return listaUsuarios;
    }

    public List<Prestamo> obtenerPrestamos() {
        return listaPrestamos;
    }

    public List<Copia> obtenerCopias() {
        return listaCopias;
    }

    private TipoUsuario generarEstadoAleatorio() {
        Random random = new Random();
        int indice = random.nextInt(TipoUsuario.values().length);
        return TipoUsuario.values()[indice];

    }
}
