package com.estudio.mathematicsOperations;

import com.sun.source.doctree.SummaryTree;

public class Main {
    public static void main(String[] args) {
        MathematicsOperations operation = new MathematicsOperations(0,0);
        operation.setNumber1(10.2);
        operation.setNumber2(50.25);
        System.out.println(operation.sumOfNumbers());
    }
}
