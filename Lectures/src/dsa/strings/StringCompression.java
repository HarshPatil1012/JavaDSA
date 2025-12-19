import java.util.*;
 
public class StringCompression {
    // Function to compress the string

    // Approach: Use a StringBuilder to build the compressed string by counting consecutive characters
        // Time Complexity: O(n) where n is the length of the string
  
    public static String compressString2(String str){
        StringBuilder newStr = new StringBuilder("");
        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++; // to avoid counting the same character again
            }
            newStr.append(str.charAt(i)); 
            if(count > 1){
                newStr.append(count);
            }
        }
        return newStr.toString();
    } 


    // Approach: Use string concatenation to build the compressed string by counting consecutive characters
        // Time Complexity: O(n) where n is the length of the string
    public static String compressString(String str){
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++; // to avoid counting the same character again
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;
    } 



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a string from user
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine(); // Use nextLine() to read the entire line including spaces
        System.out.println("User Input: " + userInput);

        // Compress the string
        String compressedString = compressString2(userInput);
        String concatenatedCompressedString = compressString(userInput);
        System.out.println("Compressed String: " + compressedString);
        System.out.println("Concatenated Compressed String: " + concatenatedCompressedString);
    
        sc.close();
    }
    
}