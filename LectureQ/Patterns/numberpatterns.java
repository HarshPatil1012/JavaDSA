import java.util.*;

public class numberpatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


    // ---> print numbers inverted half pyramid
        for (int i = n; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }



    // print floys triangle
        int counter = 1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }



    // print 0-1 triangle
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                if ((i+j)%2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }



    // print number pyramid
        for (int i=1; i<=n; i++) {
            // spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


        
    // print palindromic pattern
        for (int i=1; i<=n; i++) {
            // spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            // decreasing numbers
            for (int j=i; j>=1; j--) {
                System.out.print(j + " ");
            }
            // increasing numbers
            for (int j=2; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}