package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "faldas_mini")
public class FaldaMini extends PrendaFalda {

    private String material;   // mezclilla, cuero, tela
    private String estilo;     // tableada, lisa, asimétrica

    public FaldaMini() {}

    public FaldaMini(String nombre, String marca, double precio,
                     String talla, String color, String largo,
                     String material, String estilo) {
        super(nombre, marca, precio, talla, color, largo);
        this.material = material;
        this.estilo = estilo;
    }

    @Override
    public String getTipo() { return "Falda Mini"; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getEstilo() { return estilo; }
    public void setEstilo(String estilo) { this.estilo = estilo; }
}