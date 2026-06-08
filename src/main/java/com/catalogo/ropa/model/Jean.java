package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "jeans")
public class Jean extends PrendaInferior {

    private String lavado;  // claro, oscuro, rotos, desteñido

    public Jean() {}

    public Jean(String nombre, String marca, double precio,
                String talla, String color, String corte, String lavado) {
        super(nombre, marca, precio, talla, color, corte);
        this.lavado = lavado;
    }

    @Override
    public String getTipo() { return "Jean"; }

    public String getLavado() { return lavado; }
    public void setLavado(String lavado) { this.lavado = lavado; }
}