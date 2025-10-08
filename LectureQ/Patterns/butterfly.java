import java.util.*;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


    // ---> Print butterfly pattern


        // 1st approach
        // part 1
        // for no. of lines
        for( int i = 1; i <= n; i++) {

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // space
            for (int j = 1; j <= 2 * (n-i); j++) {
                System.out.print("  ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        // part 2
        for( int i = n; i > 0; i--) {

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // space
            for (int j = 1; j <= 2 * (n-i); j++) {
                System.out.print("  ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }


        sc.close();
    }

}
