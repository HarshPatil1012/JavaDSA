package dsa.sorting_algorithms;

import java.util.*;

public class insertionSort {

    // --> time complexity = O(n^2) in worst case and O(n) in best case (when array is already sorted)

    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {  // logic starts from 1st index bcz 0th index is already sorted
            int curr = arr[i];
            int prev = i - 1;  // Assuming 0 to i-1 is sorted

            // finding out the correct position to insert current element
            while (prev >= 0 && arr[prev] > curr) {
            //while (prev >= 0 && arr[prev] < curr) { // for descending order
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // insertion
            arr[prev + 1] = curr; // placing current element at its correct position
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        InsertionSort(arr);
        printArr(arr);
        sc.close();
    }

}