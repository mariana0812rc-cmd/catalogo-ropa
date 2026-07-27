package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "jumpers")
public class Jumper extends PrendaVestido {

    private String material;  // liso, flores, rayas, lunares
    private String forma;      // sin manga, corta, larga

    public Jumper() {}

    public Jumper(String nombre, String marca, double precio,
                         String talla, String color, String largo,
                         String material, String forma) {
        super(nombre, marca, precio, talla, color, largo, "casual");
        this.material = material;
        this.forma = forma;
    }

    @Override
    public String getTipo() { return "Jumper"; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getForma() { return forma; }
    public void setForma(String manga) { this.forma = forma; }
}
