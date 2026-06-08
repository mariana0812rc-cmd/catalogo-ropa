package com.catalogo.ropa.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class PrendaVestido extends Prenda {

    private String talla;
    private String color;
    private String largo;
    private String ocasion;

    public PrendaVestido() {}

    public PrendaVestido(String nombre, String marca, double precio,
                         String talla, String color,
                         String largo, String ocasion) {
        super(nombre, marca, precio);
        this.talla = talla;
        this.color = color;
        this.largo = largo;
        this.ocasion = ocasion;
    }

    public String getTalla() { return talla; }
    public void setTalla(String talla) { this.talla = talla; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getLargo() { return largo; }
    public void setLargo(String largo) { this.largo = largo; }
    public String getOcasion() { return ocasion; }
    public void setOcasion(String ocasion) { this.ocasion = ocasion; }
}