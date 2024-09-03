package com.estudio.ejemploAbstracto;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo("Círculo", "Rojo", 5);
        FiguraGeometrica rectangulo = new Rectangulo("Rectángulo", "Azul", 4, 6);
        FiguraGeometrica triangulo = new Triangulo("Triángulo", "Verde", 3, 4, 3, 4, 5);

        System.out.println(circulo.getNombre() + " - Área: " + circulo.calcularArea() + ", Perímetro: " + circulo.calcularPerimetro());
        System.out.println(rectangulo.getNombre() + " - Área: " + rectangulo.calcularArea() + ", Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println(triangulo.getNombre() + " - Área: " + triangulo.calcularArea() + ", Perímetro: " + triangulo.calcularPerimetro());
    }
}

