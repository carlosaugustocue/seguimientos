package com.estudio.vector.dependency;

public class LinearDependency {

    // Function to perform Gaussian elimination and find the rank of a matrix
    public int rank(double[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int rank = 0;

        for (int row = 0; row < m; row++) {
            if (matrix[row][rank] != 0) {
                for (int col = 0; col < m; col++) {
                    if (col != row) {
                        double multiplier = matrix[col][rank] / matrix[row][rank];
                        for (int k = 0; k < n; k++) {
                            matrix[col][k] -= multiplier * matrix[row][k];
                        }
                    }
                }
                rank++;
            }
            if (rank == n) break;
        }
        //Return matrix rank
        return rank;
    }
}
