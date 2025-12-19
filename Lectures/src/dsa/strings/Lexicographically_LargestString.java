package dsa.strings;

public class Lexicographically_LargestString {

    // time complexity: O(n * m) where n is the number of strings and m is the average length of the strings
    public static void main(String[] args){
        String fruits[] = {"apple", "banana", "grape", "orange", "kiwi"};

        String largest = fruits[0];
        for(int i = 1; i < fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println("Lexicographically largest string: " + largest);


/*
        Explanation of compareTo() method:
        --> compareTo() is a method in string class which compares two strings lexicographically
        --> lexicographically means dictionary order
        --> returns a negative integer if the first string is lexicographically less than the second string
        --> returns a positive integer if the first string is lexicographically greater than the second string  
        --> returns 0 if both strings are equal


        compareTo() --> 'A' & 'a' are different characters & 'A' < 'a'
        compareToIgnoreCase() --> 'A' & 'a' are considered same characters

        int result = strA.compareTo(strB);
        if (result < 0) {
            System.out.println(strA + " is less than " + strB);
        } else if (result > 0) {
            System.out.println(strA + " is greater than " + strB);
        } else {
            System.out.println(strA + " is equal to " + strB);
        }

*/
    }
}