package com.example.lucas.entregableintegradormaterialdesign;

/**
 * Created by Lucas on 6/1/16.
 */
public class Jugadores {

    private String nombre;
    private Integer numeroDeCamiseta;

    public Jugadores(String nombre, Integer numeroDeCamiseta) {
        this.nombre = nombre;
        this.numeroDeCamiseta = numeroDeCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroDeCamiseta() {
        return numeroDeCamiseta;
    }

    public void setNumeroDeCamiseta(Integer numeroDeCamiseta) {
        this.numeroDeCamiseta = numeroDeCamiseta;
    }
}
