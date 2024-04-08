package org.modelo;

import java.util.List;

public class Usuario {

//    public static int id = 0;
    private int id;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String usuario;
    private List<Prestamo> prestamos;
    private TipoUsuario tipoUsuario;

    public Usuario(String nombre, String apellido, TipoUsuario tipoUsuario, String contraseña, String usuario) {
//        this.id++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoUsuario = tipoUsuario;
        this.contraseña = contraseña;
        this.usuario = usuario;
    }

    public Usuario(int id, String nombre, String apellido, TipoUsuario tipoUsuario, String contraseña, String usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.usuario = usuario;
        this.tipoUsuario = tipoUsuario;
        this.id = id;
    }

    public Usuario() {
    }
//    public static int getId(){
//        return id;
//    }
    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

//    public int getId() {
//        return id;
//    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    @Override
    public String toString() {
        return "Id: " + id + " ,Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", contrase\u00f1a=" + contraseña + ", usuario=" + usuario + ", tipoUsuario=" + tipoUsuario + '}';
    }

}
