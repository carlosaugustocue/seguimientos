package com.estudio.ejemploAbstracto;

class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triangulo(String nombre, String color, double base, double altura, double lado1, double lado2, double lado3) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Implementación del cálculo del área
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Implementación del cálculo del perímetro
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}

