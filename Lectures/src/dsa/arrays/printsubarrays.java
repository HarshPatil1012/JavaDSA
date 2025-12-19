import java.util.*;

public class printsubarrays {

    public static void PrintSubarrays(int numbers[]) {
    // variables initialization
        int totalSubarrays = 0;
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;

    // generating subarrays
        // index of starting point
        for(int i=0; i < numbers.length; i++) { 
        //  for(int i=numbers.length - 1; i >= 0; i--) { // index of starting point in reverse order
            
            // index of ending point
            for(int j = i; j < numbers.length; j++) { 
                int sum = 0;
                System.out.print("[ ");

                // printing the subarray
        //      for(int k = i; k <= j; k++) { 
                for(int k = i; k < j+1; k++) { 
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }
                System.out.print("]:sum =  " + sum + ", ");


                totalSubarrays++; // counting the subarrays

                // updating max and min sum
                if(sum > max_sum) {
                    max_sum = sum;
                }
                if(sum < min_sum) {
                    min_sum = sum;
                }
            }
            System.out.println();
        }

        // printing the results
        System.out.println("Total subarrays: " + totalSubarrays);
        System.out.println("Total subarrays mathematically: " + (numbers.length * (numbers.length + 1) / 2));
        System.out.println("Maximum subarray sum: " + max_sum);
        System.out.println("Minimum subarray sum: " + min_sum);
    }
 
    public static void main(String args[]) {
      
        int[] numbers = {2, 4, 6, 8, 10};
        PrintSubarrays(numbers);

    }
}

// this code has a time complexity of O(n^3) because of the three nested loops
// this is the brute force or most basic way to print subarrays