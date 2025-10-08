import java.util.*;

public class lshp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

    // ---> print half pyramid leftwards
        
        // without space
        for (int lines = 1; lines <= n; lines++) {
            //for spaces
            for(int space=n-lines; space>=1; space--){
                System.out.print(" ");
            }
        
            // for star
            for (int star = 1; star <= lines; star++) {
                System.out.print("*");
            }
        
            System.out.println();
        }
        
        // with space
        // 1st approach
        for (int lines = 1; lines <= n; lines++) {
            //for spaces
            for(int space=2*(n-lines); space>=1; space--){
                System.out.print(" ");
            }
        
            // for star
            for (int star = 1; star <= 2*lines - 1; star++) {
                if (star % 2 == 0) {
                    System.out.print("_"); // space
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
        
        // 2nd approach
        for (int lines = 1; lines <= n; lines++) {
            //for spaces
            for(int space=n-lines; space>=1; space--){
                System.out.print("  "); //double space
            }
        
            // for star
            for (int star = 1; star <= lines; star++) {
                System.out.print("* ");
            }
        
            System.out.println();
        }
        
    
    // ---> print inverse half pyramid leftwards
        
        // without space
        for (int lines = 1; lines <= n; lines++) {
            //for spaces
            for(int space=lines-1; space>0; space--){
                System.out.print(" ");
            }
        
            // for star
            for (int star = n-lines+1; star>0 ; star--) {
                System.out.print("*");
            }
        
            System.out.println();
        }
        
        
        // with space
        // 1st approach
        for (int lines = 1; lines <= n; lines++) {
            //for spaces
            for(int space=lines-1; space>0; space--){
                System.out.print("  "); //double space
            }
        
            // for star
            for (int star = n-lines+1; star>0 ; star--) {
                System.out.print("* ");
            }
        
            System.out.println();
        }
        
        // 2nd approach
        for (int lines = n; lines > 0; lines-- ) {        
    //    for (int lines = 1; lines <= n; lines++) {
            //for spaces
            for(int space=n-lines; space>0; space--){
        //    for(int space=lines-1; space>0; space--){
                System.out.print("  "); //double space
            }
        
            // for star
            for (int star = 2 * lines - 1  ; star > 0; star--) {
        //    for (int star = 2*(n-lines)+1 ; star > 0; star--) {
                if (star % 2 == 0) {
                    System.out.print("_"); // space
                } else {
                    System.out.print("*");
                }
            }
        
            System.out.println();
        }        
       
        sc.close();
    }
}