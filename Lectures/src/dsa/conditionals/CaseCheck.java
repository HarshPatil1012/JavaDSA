package dsa.conditionals;
import java.util.*;
public class CaseCheck {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        // in.next() --> is String input
        // .trim() --> string method used to removes the extra spaces from the beginning and end of a string
        // .charAt(0) --> used to get first character of the string
        System.out.println(ch);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercaase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
