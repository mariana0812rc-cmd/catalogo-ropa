package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pantalones")
public class Pantalon extends Prenda {

    private String talla;   // 28, 30, 32, 34
    private String color;
    private String corte;   // skinny, recto, wide leg

    public Pantalon() {}

    public Pantalon(String nombre, String marca, double precio,
                    String talla, String color, String corte) {
        super(nombre, marca, precio);
        this.talla = talla;
        this.color = color;
        this.corte = corte;
    }

    @Override
    public String getTipo() { return "Pantalon"; }

    public String getTalla() { return talla; }
    public void setTalla(String talla) { this.talla = talla; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getCorte() { return corte; }
    public void setCorte(String corte) { this.corte = corte; }
}
