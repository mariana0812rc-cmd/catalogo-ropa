package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "camisas")
public class Camisa extends Prenda {

    private String talla;
    private String color;
    private String manga;

    public Camisa() {}

    public Camisa(String nombre, String marca, double precio,
                  String talla, String color, String manga) {
        super(nombre, marca, precio);
        this.talla = talla;
        this.color = color;
        this.manga = manga;
    }

    @Override
    public String getTipo() { return "Camisa"; }

    public String getTalla() { return talla; }
    public void setTalla(String talla) { this.talla = talla; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getManga() { return manga; }
    public void setManga(String manga) { this.manga = manga; }
}