package dsa.arrays;//more optimized approach than prefix sums

public class kadanesalgorithm{

    public static void kadanes(int numbers[]) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        boolean Flag = false;

        for(int i : numbers) {
            if(i >= 0){
                Flag = true;
                break;
            }
        } 

        if(Flag == true){   
            for(int i=0; i<numbers.length; i++) {
                curr_sum = curr_sum + numbers[i];
                if(curr_sum < 0) {
                    curr_sum = 0;
                }
                max_sum = Math.max(curr_sum, max_sum);
            }
            System.out.println("Maximum subarray sum using Kadane's algorithm: " + max_sum);
        }
        else{
            max_sum = numbers[0];
            for(int i=1; i<numbers.length; i++) {
                if(numbers[i] > max_sum){
                    max_sum = numbers[i];
                }
            }
            System.out.println("Maximum subarray sum using Kadane's algorithm: " + max_sum);
        }
    }

    public static void main(String args[]) {
      
        int[] numbers = {-2, -3, 4, -7, 8, 9, -5, -3};
        kadanes(numbers);

    }
}
// this code has a time complexity of O(n)
// and a space complexity of O(1) because we are using only a few extra variables.