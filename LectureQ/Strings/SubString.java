import java.util.*;

public class SubString {
    public static String substring(String str, int start, int end) {
        String substr = "";
        for (int i = start; i < end && i < str.length(); i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args){

        String str = "This is a sample string";
        // Substring from index 7 to 12
        System.out.println("Substring from index 7 to 12: " + substring(str, 7, 12));

        System.out.println("Substring using built-in method from index 7 to 12: " + str.substring(7, 12));
            // substring() is a method in string class which returns the substring from the specified index to the specified index
            // it includes the character at the starting index but excludes the character at the ending index

    }
}