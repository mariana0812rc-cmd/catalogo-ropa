package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "playeras")
public class Playera extends PrendaSuperior {

    private String manga;      // corta, sin manga, larga
    private String estampado;  // liso, gráfico, rayas, flores

    public Playera() {}

    public Playera(String nombre, String marca, double precio,
                   String talla, String color,
                   String manga, String estampado) {
        super(nombre, marca, precio, talla, color);
        this.manga = manga;
        this.estampado = estampado;
    }

    @Override
    public String getTipo() { return "Playera"; }

    public String getManga() { return manga; }
    public void setManga(String manga) { this.manga = manga; }
    public String getEstampado() { return estampado; }
    public void setEstampado(String estampado) { this.estampado = estampado; }
}