package com.estudio.ejemploAbstracto;

class Rectangulo extends FiguraGeometrica {
    private double largo;
    private double ancho;

    // Constructor
    public Rectangulo(String nombre, String color, double largo, double ancho) {
        super(nombre, color);
        this.largo = largo;
        this.ancho = ancho;
    }

    // Implementación del cálculo del área
    @Override
    public double calcularArea() {
        return largo * ancho;
    }

    // Implementación del cálculo del perímetro
    @Override
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }
}

