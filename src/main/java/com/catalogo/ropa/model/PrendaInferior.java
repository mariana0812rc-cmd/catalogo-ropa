package com.catalogo.ropa.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class PrendaInferior extends Prenda {

    private String talla;
    private String color;
    private String corte;

    public PrendaInferior() {}

    public PrendaInferior(String nombre, String marca, double precio,
                          String talla, String color, String corte) {
        super(nombre, marca, precio);
        this.talla = talla;
        this.color = color;
        this.corte = corte;
    }

    public String getTalla() { return talla; }
    public void setTalla(String talla) { this.talla = talla; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getCorte() { return corte; }
    public void setCorte(String corte) { this.corte = corte; }
}