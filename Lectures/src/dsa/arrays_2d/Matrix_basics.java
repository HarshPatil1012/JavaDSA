package dsa.arrays_2d;

import java.util.*;

public class Matrix_basics {

    // search for a key in a 2D array or matrix
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at: (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    // print min and max element in the matrix
    public static void min_max(int matrix[][]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    // 2D Array declaration or creation
        int matrix [][] = new int [3][3]; // this consists of 9 cells

        // int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 
        // int matrix[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        // rows and columns
        int n = matrix.length; // number of rows
        int m = matrix[0].length; // number of columns
        
        // input
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 5);
        min_max(matrix);
        sc.close();
    }
}