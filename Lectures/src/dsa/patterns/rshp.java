package dsa.patterns;

import java.util.*;

public class rshp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

    // ---> print half pyramid rightwards
        // with space 
        for (int lines = 1; lines <= n; lines++) {
        
            // for star
            for (int star = 1; star <= lines; star++) {
                System.out.print("* "); 
            }
        
            System.out.println();
        }
    
        // without space
        for (int lines = 1; lines <= n; lines++) {
    
            // for star
            for (int star = 1; star <= lines; star++) {
                System.out.print("*"); 
            }
    
            System.out.println();
        }
    


    // ---> Print half pyramid rightwards with spaces
        
        for (int lines = 1; lines <= n; lines++) {
        
            // for star
            for (int star = 1; star <= 2 * lines - 1; star++) {
                if (star % 2 == 0) {
                    System.out.print("_"); // space
                } else {
                    System.out.print("*");
                }
            }
        
            System.out.println();
        }
        
        
    // ---> print inverted half pyramid rightwards
        
        // 1st approach
        for (int lines = n; lines > 0; lines--) {
        
            // for star
            for (int star = 1; star <= lines; star++) {
                System.out.print("* "); // with space
                // System.out.print("*"); // without space
            }
        
            System.out.println();
        }
        
        // 2nd approach
        for (int lines = 1; lines <= n; lines++) {
        
            // for star
            for (int star = n; star >= lines; star--) {
                System.out.print("* "); // with space
                // System.out.print("*"); // without space
            }
        
            System.out.println();
        }
        
        // 3rd approach
        for (int lines = 1; lines <= n; lines++) {
        
            // for star
            for (int star = 1; star <= n - lines + 1; star++) { // important
                System.out.print("* "); // with space
                // System.out.print("*"); // without space
            }
        
            System.out.println();
        }        
        sc.close();
    }
}