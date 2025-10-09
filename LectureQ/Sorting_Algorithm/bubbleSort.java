import java.util.*;

public class bubbleSort {

    // --> time complexity = O(n^2) in worst and average case and O(n) in best case (when array is already sorted)

    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        for (int turn = 0; turn < n - 1; turn++) {
            for (int j = 0; j < n - turn - 1; j++) {

            //  swap if the element found is greater than the next element then greater elements are shifted towards left side causing array to be arranged in ascending order   
                
            // jo bada h usse last mein krte jayenge  
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void BubbleSortOptimized(int[] arr) {
        int n = arr.length;
        for (int turn = 0; turn < n - 1; turn++) {
            boolean swapped = false; // to check if any swapping happened in this pass
            for (int j = 0; j < n - turn - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                // If no two elements were swapped by inner loop, then break
                // i.e. array was already sorted
                break;
            }
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
        BubbleSort(arr);
        // BubbleSortOptimized(arr);
        printArr(arr);
        sc.close();
    }

}