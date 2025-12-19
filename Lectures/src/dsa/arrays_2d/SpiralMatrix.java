package dsa.arrays_2d;

import java.util.*;

public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol) {
            // top
            for(int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for(int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for(int j = endCol - 1; j >= startCol; j--) {
                if(startRow == endRow) { // to avoid double printing when there's a single row
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for(int i = endRow - 1; i > startRow; i--) {
                if(startCol == endCol) { // to avoid double printing when there's a single column
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};

        /*    
        System.out.println("Enter the number of rows and columns:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        // input
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        */

        printSpiral(matrix);
        sc.close();
    }
}