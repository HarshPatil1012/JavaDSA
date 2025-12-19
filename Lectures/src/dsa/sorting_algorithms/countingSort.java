package dsa.sorting_algorithms;

import java.util.*;


public class countingSort {

        public static void printArr(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void CountingSort(int arr[]) {
            int largest = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                largest = Math.max(largest, arr[i]);
            }

            int count[] = new int[largest + 1]; 
            // +1 because of 0 based indexing and largest is also an element of the array
            for (int i = 0; i < arr.length; i++) {
                count[arr[i]]++;
            }

            // sorting
            int j = 0;
            for (int i = 0; i < count.length; i++) {
                while (count[i] > 0) {
                    arr[j] = i;
                    j++;
                    count[i]--;
                }
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        CountingSort(arr);
        printArr(arr);
        
        sc.close();
    }

}