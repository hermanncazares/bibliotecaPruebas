package org.modelo;

import java.util.List;

public class Copia {
    private static int id;
    private Libro libro;
    private EstadoCopia estadoCopia;
    private Prestamo prestamo;
    
    
    
    public Copia(EstadoCopia estadoCopia, Libro libro) {
        this.id++;
        this.estadoCopia = estadoCopia;
        this.libro = libro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public EstadoCopia getEstadoCopia() {
        return estadoCopia;
    }

    public void setEstadoCopia(EstadoCopia estadoCopia) {
        this.estadoCopia = estadoCopia;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
    
    public static void asignarCopiaPrestamo(Prestamo prestamo){
        
    }

    @Override
    public String toString() {
        return "Copia:" + "libro:" + libro.getTitulo()+ ", Estado de Copia:" + estadoCopia + ", Prestamo:" + prestamo.getUsuario().getNombre();
    }
    
    
}
