package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "faldas_lapiz")
public class FaldaLapiz extends PrendaFalda {

    private String material;    // mezclilla, cuero, lino
    private boolean abertura;   // true = tiene abertura

    public FaldaLapiz() {}

    public FaldaLapiz(String nombre, String marca, double precio,
                      String talla, String color, String largo,
                      String material, boolean abertura) {
        super(nombre, marca, precio, talla, color, largo);
        this.material = material;
        this.abertura = abertura;
    }

    @Override
    public String getTipo() { return "Falda Lápiz"; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public boolean isAbertura() { return abertura; }
    public void setAbertura(boolean abertura) { this.abertura = abertura; }
}