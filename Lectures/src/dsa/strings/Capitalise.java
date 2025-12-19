package dsa.strings;

import java.util.*;

public class Capitalise {
    // Function to capitalise the first letter of each word in the string
    
    // Approach: Split the string into words, capitalise the first letter of each word, and join them back together
        // Time Complexity: O(n) where n is the length of the string
    public static String capitaliseWords(String str) {
        String[] words = str.split(" "); // Split the string into words using space as delimiter
        StringBuilder capitalisedStr = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalise the first letter and append the rest of the word
                String capitalisedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                capitalisedStr.append(capitalisedWord).append(" ");
            }
        }

        // Remove the trailing space and return the result
        return capitalisedStr.toString().trim();
    }

    // Function to convert first character to uppercase
        // Approach: Use StringBuilder to build the new string with the first character in uppercase
        // Time Complexity: O(n) where n is the length of the string
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length() - 1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a string from user
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine(); // Use nextLine() to read the entire line including spaces
        System.out.println("User Input: " + userInput);

        // Capitalise the first letter of each word
        String capitalisedString = capitaliseWords(userInput);
        String upperCaseString = toUpperCase(userInput);
        System.out.println("Capitalised String: " + capitalisedString);
        System.out.println("Uppercase String: " + upperCaseString);
    
        sc.close();
    }
    
}