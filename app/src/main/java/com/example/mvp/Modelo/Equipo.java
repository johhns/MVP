package com.example.mvp.Modelo;

public class Equipo {

    private String codigo ;
    private String descripcion ;
    private int    foto ;

    public Equipo(String codigo, String descripcion, int foto) {
        this.codigo      = codigo;
        this.descripcion = descripcion;
        this.foto        = foto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
