package com.catalogo.ropa.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class PrendaSuperior extends Prenda {

    private String talla;
    private String color;

    public PrendaSuperior() {}

    public PrendaSuperior(String nombre, String marca, double precio,
                          String talla, String color) {
        super(nombre, marca, precio);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() { return talla; }
    public void setTalla(String talla) { this.talla = talla; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}