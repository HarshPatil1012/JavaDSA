package dsa.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

//        sum();

//        int ans = sum2();

        int ans = sum3(10,20);
        System.out.println(ans);
    }


    // example of void return type where we are not required to return anything from the function
    static void sum () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    // Example of int return type where we have to return value from function
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    // Example of function with parameters
    // pass the value of number when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }


}
