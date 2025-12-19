package dsa.patterns;

import java.util.*;

public class hollowshapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter height = ");
        int height = sc.nextInt();

        System.out.println("Enter width = ");
        int width = sc.nextInt();

        // ---> print hollow rectangle
        System.out.println("Hollow Rectangle :");
        // ---> for no. of lines
        for(int i=1; i<=height; i++){
            // ---> for no. of columns
            for(int j=1; j<=width; j++){
                // first and last line + left and right border
                if(i==1 || i==height || j==1 || j==width){
                    System.out.print("* ");
                }

                // between lines
                else{
                    System.out.print("  ");
                }
            }
         
            System.out.println();
        }



    // ---> print hollow rhombus
        System.out.println("Hollow Rhombus :");
        // ---> for no. of lines
        for(int i=1; i<=height; i++){
            
            // spaces
            for(int k=1; k<=height-i; k++){
                System.out.print(" ");
            }

            // ---> for no. of columns
            for(int j=1; j<=width; j++){

                // first and last line + left and right border
                if(i==1 || i==height || j==1 || j==width){
                    System.out.print("* ");
                }

                // between lines
                else{
                    System.out.print("  ");
                }
            }
         
            System.out.println();
        }
     
        sc.close();
    }
}