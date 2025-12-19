import java.util.*;

public class trapping_rainwater {

// Question 42: https://leetcode.com/problems/trapping-rain-water/description/
// Question : Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

// this code has a time complexity of O(n)
    public static int trappedrainwater(int height[]) {
        int n = height.length;
        
        // used the concept of auxillary space
        // here we used two auxillary arrays to store leftmax and rightmax boundary
        
        // calculate left max boundary - array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1; i<n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        
        // calculate right max boundary - array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        
        int trappedwater = 0;
        // loop
        for(int i = 0; i<n; i++) {

            // waterlevel = min(leftmaxboundary, rightmaxboundary)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // trapped water = waterlevel - height[i]
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int height[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<n; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println("The total trapped rainwater is: " + trappedrainwater(height));
        sc.close();
    }

}