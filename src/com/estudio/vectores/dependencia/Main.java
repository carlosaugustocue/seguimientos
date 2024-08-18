package com.estudio.vectores.dependencia;

public class Main {
    public static void main(String[] args) {
        // Example: 4 vectors in 3-dimensional space
        double[][] vectors = {
                {2, 7, -3},  // Vector 1
                {-2, -3, 1},  // Vector 2
                {8, 20, 4},  // Vector 3
                {2, 2, 2}   // Vector 4
        };

        // Checking if vectors are linearly independent
        LinearIndependence linearIndependence = new LinearIndependence();
        int rank = linearIndependence.rank(vectors);
        int numVectors = vectors.length;
        int dimensions = vectors[0].length;

        if (rank == Math.min(numVectors, dimensions)) {
            System.out.println("The vectors are linearly independent.");
        } else {
            System.out.println("The vectors are linearly dependent.");
        }
    }
}
