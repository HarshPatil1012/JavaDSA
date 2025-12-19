package dsa.strings;

public class String_Builder {
    // can't be named StringBuilder as it is already a class in java.lang package
    public static void main(String args[]) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println("Initial StringBuilder: " + sb.toString());

        // length of StringBuilder
        System.out.println("Length: " + sb.length());

        // Insert a string at a specific index
        sb.insert(5, ",");
        System.out.println("After insert: " + sb.toString());

        // Replace a substring with another string
        sb.replace(7, 12, "Java");
        System.out.println("After replace: " + sb.toString());

        // Delete a substring from the StringBuilder
        sb.delete(5, 6);
        System.out.println("After delete: " + sb.toString());

        // Reverse the contents of the StringBuilder
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());

        // Convert StringBuilder to String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
    }
}