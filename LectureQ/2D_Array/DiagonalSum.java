import java.util.*;

public class DiagonalSum {
    public static void Diagonal_Sum(int matrix[][]) {

        int sum = 0;

/*
        // brute force approach (here middle element is counted twice in odd dimension matrices)
        // time complexity: O(n^2)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // primary diagonal
                if (i == j) {
                    sum += matrix[i][j];
                }
                // secondary diagonal
                if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
*/

        // optimized approach
        // time complexity: O(n)
        for(int i = 0; i < matrix.length; i++) {
            // primary diagonal
            sum += matrix[i][i];
            
            // secondary diagonal
            if(i != matrix.length - 1 - i) { // to avoid double counting the middle element in odd dimension matrices
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
    
        
        System.out.println("Diagonal Sum: " + sum);

    }

    public static void main(String args[]) {

        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};

        Diagonal_Sum(matrix);

    }
}