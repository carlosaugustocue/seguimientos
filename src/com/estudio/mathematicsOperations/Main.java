package com.estudio.mathematicsOperations;

public class Main {
    public static void main(String[] args) {
        /*MathematicsOperations operation = new MathematicsOperations(0,0);
        operation.setNumber1(10.2);
        operation.setNumber2(50.25);
        System.out.println(operation.sumOfNumbers());
        System.out.println(operation.roundingUp(3.145468));
        System.out.println(operation.roundingDown(3.99999));*/
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};

        ANeedleInTheHaystack aNeedleInTheHaystack = new ANeedleInTheHaystack();
        String result = aNeedleInTheHaystack.findNeedle(haystack3);
        System.out.println(result);



    }
}
