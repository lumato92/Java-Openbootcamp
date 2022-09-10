package com.openbootcamp;

public class CocheElectrico extends Coche{

    String motorElectrico;

    public CocheElectrico(String color, String modelo, String marca, Double largo, Double peso, String motorElectrico) {
        super(color, modelo, marca, largo, peso);
        this.motorElectrico = motorElectrico;
    }
}
