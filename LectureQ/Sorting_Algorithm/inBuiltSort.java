import java.util.*;

// --> Arrays & Collections class is present in java.util package

// import java.util.Arrays;  
// import java.util.Collections;  

public class inBuiltSort {

        public static void printArr(Integer arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    // --> time complexity = O(n log n) in all cases (worst, average, best)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, 0, 3);
            // for sorting a particular range in the array
            // Note: ending index is exclusive (non inclusive)
        printArr(arr);
        
        // using in-built sort function
        Arrays.sort(arr);  
        printArr(arr);

        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
            // for sorting a particular range in the array in descending order
            // Note: ending index is exclusive (non inclusive)
        printArr(arr);

        Arrays.sort(arr, Collections.reverseOrder());  
            // for sorting in descending order
            // Note: this works only for Integer array not for int array, so we have to change int[] to Integer[]
            // because Collections is a class which works with objects only and Integer is a wrapper class of int
            printArr(arr);
        
        sc.close();
    }

}