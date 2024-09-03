package com.estudio.ejemploAbstracto;

class Circulo extends FiguraGeometrica {
    private double radio;

    // Constructor
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    // Implementación del cálculo del área
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Implementación del cálculo del perímetro
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

