package dsa.loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x
        int ans = 0;
        while (true) {
            // Take the operator as input
            System.out.print("Enter the Operator : ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two numbers
                System.out.println("Enter Two Numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }

                if (op == '-') {
                    ans = num1 - num2;
                }

                if (op == '*') {
                    ans = num1 * num2;
                }

                if (op == '/') {
                    if (num2 != 0){
                        ans = num1 / num2;
                    }
                    else{
                        System.out.println("Denominator can't be 0");
                    }
                }

                if (op == '%') {
                    ans = num1 % num2;
                }
            }
            else if (op == 'x' || op == 'X') {
                break;
            }
            else {
                System.out.println("Invalid Operation !!");
            }
            System.out.println("Answer is: ");
            System.out.println(ans);
        }
    }
}
