package com.estudio.estatico;

public class Operaciones {


    public static int sumar(int num1,int num2){
        return num1 + num2;
    }

    public static int restar(int num1,int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1,int num2){
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.err.println("Error: División por cero.");
            return 0;
        }
    }
}
