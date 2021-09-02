package com.example.mvp.Modelo;

public class Empleado {

    private int     codigo ;
    private String  nombre ;
    private int     foto ;

    public Empleado(int codigo, String nombre, int foto) {
        this.codigo  = codigo;
        this.nombre  = nombre;
        this.foto    = foto;
    }

    public Empleado() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
