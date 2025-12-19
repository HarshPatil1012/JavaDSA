import java.util.*;

public class BasicOperations {

    // Function to print each character of the string
    public static void printLetters(String str){
     for(int i = 0; i < str.length(); i++){
         System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // create a string 
        String str = "This is a sample string";
        String str2 = new String("abcd@#1234");
        System.out.println("Original String 1: " + str);
        System.out.println("Original String 2: " + str2);



        // input a string from user
        System.out.print("Enter a string: ");
    //  String userInput = sc.next();       // Use next() to read a single word and break on space
        String userInput = sc.nextLine();   // Use nextLine() to read the entire line including spaces
        System.out.println("User Input: " + userInput);
        


        // Length of the string
        System.out.println("Length: " + userInput.length());
            // length is a method in string class which returns the length of the string
            // length here is a method not a property like in arrays, so we need to use () after length
            
            

        // Concatenate strings
        String firstname = "John";
        String lastname = "wick";
        String concatenated = firstname + " " + lastname;
        System.out.println("Concatenated String: " + concatenated);
            // concatination is the process of joining two strings & + operator is used to concatenate two strings
        System.out.println("Concatenated String using concat(): " + firstname.concat(" ").concat(lastname));
            // concat() is a method in string class which concatenates two strings
            
            
            
        // Join strings with a delimiter
        String joined = String.join(" - ", firstname, lastname, "the", "legend");  
        System.out.println("Joined String: " + joined);
            // join() is a static method in string class which joins multiple strings with a specified delimiter
            // parts is an array of strings to be joined


        // Character at index 7
        System.out.println("Character at index 7: " + str.charAt(7));
            // charAt() is a method in string class which returns the character at the specified index
            // index starts from 0 as it is 0 based indexing



        // Print each character of the string
        printLetters(str2);
            // printing each character of the string using a function
            // function is created above main function




        // Find index of character 's'
        System.out.println("Index of first occurrence of 's': " + str.indexOf('s'));
        System.out.println("Index of last occurrence of 's': " + str.lastIndexOf('s'));
            // indexOf() is a method in string class which returns the index of the first occurrence of the specified character
            // lastIndexOf() is a method in string class which returns the index of the last occurrence of the specified character
            // if the character is not found, it returns -1



        // Trim whitespace from both ends
        String strWithSpaces = "   Hello World!   ";
        System.out.println("Trimmed String: " + strWithSpaces.trim());
            // trim() is a method in string class which removes whitespace from both ends
            // whitespace includes space, tab, newline etc.

            
            
        // Check if the string contains 'sample'
        System.out.println("Contains 'sample': " + str.contains("sample"));
            
        // Check if the string starts with 'This'
        System.out.println("Starts with 'This': " + str.startsWith("This"));
            
        // Check if the string ends with 'string'
        System.out.println("Ends with 'string': " + str.endsWith("string"));
           


           
        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());
        
        

        
        // Replace 'sample' with 'example'
        System.out.println("Replace 'sample' with 'example': " + str.replace("sample", "example"));        



        // printing an array of strings
        String[] text = {"apple", "banana", "cherry"};
        System.out.println("Array of Strings: " + Arrays.toString(text));
    

        // String to char array
        char[] charArray = str.toCharArray();   
        System.out.println("String to Char Array: " + Arrays.toString(charArray));
            // toCharArray() is a method in string class which converts the string to a char
 
        sc.close();
    }
}