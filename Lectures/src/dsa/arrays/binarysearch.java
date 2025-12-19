package dsa.arrays;

public class binarysearch {
    
    public static int binarySearch(int numbers[], int keys) {
        int start = 0, end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            //comparision
            if(numbers[mid] == keys) { // found
                return mid;
            } else if(numbers[mid] < keys) { // right
                start = mid + 1;
            } else {  // left
                end = mid - 1;
            }
        }
        return -1;
    }
 
    public static void main(String args[]) {
      
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};        
        int key = 10;
        int index = binarySearch(numbers, key);

        if (index != -1) {
            System.out.println("Key " + key + " found at index: " + index);
        } else {
            System.out.println("index of Key " + key + " not found.");
        }

    }
}