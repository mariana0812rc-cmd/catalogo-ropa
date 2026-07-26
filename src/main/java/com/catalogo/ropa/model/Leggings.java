package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "leggings")
public class Leggings extends PrendaInferior {

    private String lavado;

    public Leggings () {}

    public Leggings (String nombre, String marca, double precio,
                String talla, String color, String corte, String lavado) {
        super(nombre, marca, precio, talla, color, corte);
        this.lavado = lavado;
    }

    @Override
    public String getTipo() { return "leggings"; }

    public String getLavado() { return lavado; }
    public void setLavado(String lavado) { this.lavado = lavado; }
}