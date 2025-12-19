package dsa.input;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter 1st number : ");
        int num1 = input.nextInt();
        System.out.print("please enter 2nd number : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.print("sum of two number is : " + sum);
    }
}