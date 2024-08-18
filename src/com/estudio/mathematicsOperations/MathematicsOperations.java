package com.estudio.mathematicsOperations;

public class MathematicsOperations {
    private double number1;
    private double number2;

    public MathematicsOperations(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double sumOfNumbers() {
        return number1 + number2;
    }

    //Rounding a number up
    public int roundingUp(double value){
        return (int) Math.ceil(value);
    }

    //Rounding a number down
    public int roundingDown(double value){
        return (int) Math.floor(value);
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return "MathematicsOperations{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}
