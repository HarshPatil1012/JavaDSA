package dsa.sorting_algorithms;

import java.util.*;

public class selectionSort {

    // --> time complexity = O(n^2) in all cases (best, average, worst)
    
    public static void SelectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
        //      if(arr[minPos] < arr[j]){  // for descending order bcz now it will find maximum value and place it at first
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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
        SelectionSort(arr);
        printArr(arr);
        sc.close();
    }

}