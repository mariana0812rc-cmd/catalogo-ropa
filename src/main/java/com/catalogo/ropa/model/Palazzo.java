package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "palazzos")
public class Palazzo extends PrendaVestido {

    private String material;  // liso, flores, rayas, lunares
    private String manga;      // sin manga, corta, larga

    public Palazzo() {}

    public Palazzo(String nombre, String marca, double precio,
                         String talla, String color, String largo,
                         String material, String manga) {
        super(nombre, marca, precio, talla, color, largo, "casual");
        this.material = material;
        this.manga = manga;
    }

    @Override
    public String getTipo() { return "Palazzo"; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getManga() { return manga; }
    public void setManga(String manga) { this.manga = manga; }
}