package com.catalogo.ropa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "chamarras")
public class Chamarra extends PrendaSuperior {

    private String material;   // cuero, mezclilla, nylon, lana
    private String cierre;     // cremallera, botones, ninguno
    private String capucha;    // con capucha, sin capucha

    public Chamarra() {}

    public Chamarra(String nombre, String marca, double precio,
                    String talla, String color,
                    String material, String cierre, String capucha) {
        super(nombre, marca, precio, talla, color);
        this.material = material;
        this.cierre = cierre;
        this.capucha = capucha;
    }

    @Override
    public String getTipo() { return "Chamarra"; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getCierre() { return cierre; }
    public void setCierre(String cierre) { this.cierre = cierre; }
    public String getCapucha() { return capucha; }
    public void setCapucha(String capucha) { this.capucha = capucha; }
}