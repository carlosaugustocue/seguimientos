package com.estudio.vector.dependency;

public class Main {
    public static void main(String[] args) {
        // Example: 4 vectors in 3-dimensional space
        double[][] vectors = {
                {1, 1, -1},  // Vector 1
                {-2, -3, 1},  // Vector 2
                {3, -4, 6},  // Vector 3
//                {2, 2, 2}   // Vector 4
        };

        // Checking if vectors are linearly independent
        LinearDependency linearDependency = new LinearDependency();

        int rank = linearDependency.rank(vectors);
        int numVectors = vectors.length;
        int dimensions = vectors[0].length;

        if (rank == Math.min(numVectors, dimensions)) {
            System.out.println("The vectors are linearly independent.");
        } else {
            System.out.println("The vectors are linearly dependent.");
        }
    }
}
