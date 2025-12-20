package dsa.loops;

import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int RevNum = 0;
        while (n > 0){
            int rem = n % 10;
            RevNum = RevNum * 10 + rem;
            n /= 10;
        }
        System.out.println(RevNum);
    }
}
