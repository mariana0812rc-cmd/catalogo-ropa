package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "faldas_plisadas")
public class FaldaPlisada extends PrendaFalda {

    private String material;   // tul, satén, algodón
    private int numeroDePliegues;

    public FaldaPlisada() {}

    public FaldaPlisada(String nombre, String marca, double precio,
                        String talla, String color, String largo,
                        String material, int numeroDePliegues) {
        super(nombre, marca, precio, talla, color, largo);
        this.material = material;
        this.numeroDePliegues = numeroDePliegues;
    }

    @Override
    public String getTipo() { return "Falda Plisada"; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public int getNumeroDePliegues() { return numeroDePliegues; }
    public void setNumeroDePliegues(int n) { this.numeroDePliegues = n; }
}