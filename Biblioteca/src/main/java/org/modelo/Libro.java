package org.modelo;

import java.util.List;

public class Libro {
    private static int idLibro;
    private String nombreAutor;
    private String titulo;
    private String ISBN;
    private int numCopias;
    private List<Copia> listaCopias;

    public Libro(String nombreAutor, String titulo, String ISBN, int numCopias) {
        this.idLibro++;
        this.nombreAutor = nombreAutor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.numCopias = numCopias;
    }

    public int getIDLibro(){
        return idLibro;
    }
    
    public Libro(String nombre) {
        this.nombreAutor = nombreAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombre) {
        this.nombreAutor = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public List<Copia> getCopias() {
        return listaCopias;
    }

    public void setCopia(Copia copia) {
        listaCopias.add(copia);
    }
    
    
    
}
