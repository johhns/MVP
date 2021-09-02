package com.example.mvp.Modelo;

public class Producto {

    private String codigo ;
    private String descripcion ;
    private Double precio ;
    private Double cantidad ;
    private int    foto ;

    public Producto(String codigo, String descripcion, Double precio, Double cantidad, int foto) {
        this.codigo      = codigo;
        this.descripcion = descripcion;
        this.precio      = precio;
        this.cantidad    = cantidad;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

}
