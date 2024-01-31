package org.ArkAcademy.week2.dataStructures.challange;

import static org.ArkAcademy.week2.dataStructures.challange.MatrixOperations.*;

public class Challenge7MatrixOperations {
    public static void main(String[] args) {
        // Initialize a 2D matrix with values
        int[][] matrix = initializeMatrix(3, 4);

        // Print the matrix
        printMatrix(matrix);

        // Find and print the sum of all elements in the matrix
        printMatrixSum(matrix);

        // Transpose the matrix and print the result
        transposeMatrix(matrix);
    }
}
class MatrixOperations {
    // Initialize a 2D matrix with values
    public static int[][] initializeMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }

        return matrix;
    }

    // Print the matrix
    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    // Find and print the sum of all elements in the matrix
    public static void printMatrixSum(int[][] matrix) {
        int sum = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }

        System.out.println("Sum of all elements in the matrix: " + sum);
    }

    // Transpose the matrix and print the result
    public static void transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transposed Matrix:");

        for (int[] row : transposedMatrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
