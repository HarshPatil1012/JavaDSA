package dsa.patterns;

import java.util.*;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
 

        
    // --> print pyramid
        // 1st approach
        for (int lines = 1; lines <= n; lines++) {
            //for spaces
            for(int space=n-lines; space>=1; space--){
                System.out.print(" ");
            }
        
            // for star
            for (int star = 1; star <= lines; star++) {
                System.out.print("* "); // with space (important line)
            }
        
            System.out.println();
        }
        
        
        // 2nd approach
        for (int lines = 1; lines <= n; lines++) {
            //for spaces
            for(int space=n-lines; space>=1; space--){
                System.out.print(" ");
            }
        
            // for star
            for(int star = 2 * lines - 1; star > 0; star--){
            // for (int star = 1; star <= lines - 1; star++) {
                if (star % 2 == 0) {
                    System.out.print("_"); // space
                } else {
                    System.out.print("*");
                }
            }
        
            System.out.println();
        }
        
        
        // 3rd approach
        for (int lines = 1; lines <= n; lines++) {
            //for spaces
            for(int space=n-lines; space>=1; space--){
                System.out.print("  "); //double space
            }
        
            // for star
            for (int star = 1; star <= 2 * lines - 1; star++) {
                System.out.print("* ");
            }
        
            System.out.println();
        }
        

  
    // print inverted pyramid
        // 1st approach
        for (int lines = n; lines > 0; lines--) { // just reverse the iteration order; it will create inverted pyramid
            //for spaces
            for(int space= n-lines; space>0; space--){
                System.out.print(" ");
            }
        
            // for star
            for (int star = 1; star <= lines; star++) {
                System.out.print("* ");
            }
        
            System.out.println();
        }
        
        // 2nd approach
        for (int lines = n; lines > 0; lines--) {
            //for spaces
            for(int space= n-lines; space>0; space--){
                System.out.print(" ");
        }
        
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
        
        // 3rd approach
        for (int lines = n; lines > 0; lines--) {
            //for spaces
            for(int space= n-lines; space>0; space--){
                System.out.print(" ");
            }
        
            // for star
            for (int star = 1; star <= 2 * lines - 1; star++) {
                System.out.print("*");
            }
        
            System.out.println();
        }
        
        // 4th approach
        for (int lines = n; lines > 0; lines--) {
            //for spaces
            for(int space= n-lines; space>0; space--){
                System.out.print("  ");
            }
        
            // for star
            for (int star = 1; star <= 2 * lines - 1; star++) {
                System.out.print("* ");
            }
        
            System.out.println();
        }
    


        sc.close();
    }

}
