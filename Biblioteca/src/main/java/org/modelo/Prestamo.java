package org.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prestamo {
    private static int idPrestamo = 0;
    private Usuario usuario;
    private List<Copia> listaCopias;
    private Date fechaInicio;
    private Date fechaFin;
    
    public Prestamo(Date fechaInicio, Date fechaFin, Usuario usuario, List<Copia> copias) {
        this.idPrestamo++;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.usuario = usuario;
        this.listaCopias = copias;
    }

    public static int getIdPrestamo() {
        return idPrestamo;
    }

    public static void setIdPrestamo(int idPrestamo) {
        Prestamo.idPrestamo = idPrestamo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Copia> getListaCopias() {
        return listaCopias;
    }

    public void setListaCopias(List<Copia> listaCopias) {
        this.listaCopias = listaCopias;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
    
    //    public String mostarLibrosPrestados(){
//        for (int i = 0; i < libros.size(); i++){
//            return libros.get(1).getNombreAutor();
//        }
//        return "xd";
//    }

    @Override
    public String toString() {
        return "Prestamo:" + " Usuario:" + usuario.getNombre() + ", listaCopias:" + listaCopias.size() + ", fechaInicio=" + fechaInicio.toString() + ", fechaFin=" + fechaFin.toString() + '}';
    }


}
