package com.catalogo.ropa.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class PrendaFalda extends Prenda {

    private String talla;
    private String color;
    private String largo;

    public PrendaFalda() {}

    public PrendaFalda(String nombre, String marca, double precio,
                       String talla, String color, String largo) {
        super(nombre, marca, precio);
        this.talla = talla;
        this.color = color;
        this.largo = largo;
    }

    public String getTalla() { return talla; }
    public void setTalla(String talla) { this.talla = talla; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getLargo() { return largo; }
    public void setLargo(String largo) { this.largo = largo; }
}