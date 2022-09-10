package com.openbootcamp;

public class Coche {
    // defino atributos

    String color;
    String modelo;
    String marca;
    Double peso;
    Double largo;

    public Coche(String color, String modelo, String marca, Double largo, Double peso){

        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.largo = largo;
        this.peso = peso;

    }


    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                '}';
    }
}
