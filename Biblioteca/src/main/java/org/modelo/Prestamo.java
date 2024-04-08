package org.modelo;

import java.util.Date;
import java.util.List;

public class Prestamo {
//    public static int idPrestamo = 0;
    private int idPrestamo;
    private Usuario usuario;
    private List<Copia> listaCopias;
    private Date fechaInicio;
    private Date fechaFin;
    
    public Prestamo(Date fechaInicio, Date fechaFin, Usuario usuario, List<Copia> copias) {
//        this.idPrestamo++;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.usuario = usuario;
        this.listaCopias = copias;
    }

    public Prestamo(int idPrestamo, Usuario usuario, List<Copia> listaCopias, Date fechaInicio, Date fechaFin) {
        this.idPrestamo = idPrestamo;
        this.usuario = usuario;
        this.listaCopias = listaCopias;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    

//    public static int getIdPrestamo() {
//        return idPrestamo;
//    }

  

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

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "idPrestamo=" + idPrestamo + ", usuario=" + usuario + ", listaCopias=" + listaCopias + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }

   

   


}
