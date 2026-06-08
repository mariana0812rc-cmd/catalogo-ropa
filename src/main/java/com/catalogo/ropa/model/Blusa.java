package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "blusas")
public class Blusa extends PrendaSuperior {

    private String escote;    // redondo, v, cuadrado, off-shoulder
    private String material;  // seda, algodón, chiffon

    public Blusa() {}

    public Blusa(String nombre, String marca, double precio,
                 String talla, String color,
                 String escote, String material) {
        super(nombre, marca, precio, talla, color);
        this.escote = escote;
        this.material = material;
    }

    @Override
    public String getTipo() { return "Blusa"; }

    public String getEscote() { return escote; }
    public void setEscote(String escote) { this.escote = escote; }
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
}