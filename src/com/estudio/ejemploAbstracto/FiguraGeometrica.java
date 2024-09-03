package com.estudio.ejemploAbstracto;

abstract class FiguraGeometrica {
    private String nombre;
    private String color;

    // Constructor
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    // Métodos abstractos para calcular área y perímetro
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

