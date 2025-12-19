import java.util.*;

public class StringComparison {

    public static void main(String[] args){
            
        // Compare two strings
        String s1 = "Tony";
        String s2 = "tony";
        String s3 = "Tony";
        String s4 = new String("Tony");

        // String "Tony" & "tony" are not equal as 'T' and 't' are different characters
        if(s1 == s2){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // String "Tony" & "Tony" are equal as they are identical
        // this is because of "string interning" where Java stores only one copy of each distinct string value
        // And since both s1 and s3 are initialized to the same string literal "Tony", they point to the same memory location in the string pool
        if(s1 == s3){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // String "Tony" & new String("Tony") are not equal as 's4' is created using 'new' keyword
        // 'new' keyword always creates a new object in heap memory, so s4 points to a different memory location than s1
        if(s1 == s4){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        System.out.println("Are the strings equal? : " + s1.equals(s4));
            // equals() is a method in string class which compares two strings and returns true if they are equal else false
            // it is case sensitive

    }
}