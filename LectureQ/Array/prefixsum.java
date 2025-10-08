// optimized approach to find the maximum and minimum subarray sum using prefix sums

import java.util.*;

public class prefixsum {

    public static void max_subarray_sum(int numbers[]) {
    // variables initialization
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        int prefix[] = new int[numbers.length];
        int sum = 0;

        // calculating prefix sum
        prefix[0] = numbers[0];
        for(int i=1; i < numbers.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

    // generating subarrays
        // index of starting point
        for(int i=0; i < numbers.length; i++) { 
            
            // index of ending point
            for(int j = i; j < numbers.length; j++) { 

                // printing the subarray sum
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                // updating max and min sum
                if(sum > max_sum) {
                    max_sum = sum;
                }
                if(sum < min_sum) {
                    min_sum = sum;
                }
            }

        }

        // printing the results
        System.out.println("Maximum subarray sum: " + max_sum);
        System.out.println("Minimum subarray sum: " + min_sum);
    }
 
    public static void main(String args[]) {
      
        int[] numbers = {1, -2, 6, -1, 3};
        max_subarray_sum(numbers);

    }
}

// this code has a time complexity of O(n^2) because of the two nested loops
// and a space complexity of O(n) due to the prefix sum array.