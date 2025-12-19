package dsa.arrays;

public class linearsearch {
    
    public static int linearSearch(int numbers[], int keys) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == keys) {
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for(int i = 0; i < numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE; // +infinity
        for(int i = 0; i < numbers.length; i++) {
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
/*       
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 20;
        int index = linearSearch(numbers, key);

        if (index != -1) {
            System.out.println("Key " + key + " found at index: " + index);
        } else {
            System.out.println("index of Key " + key + " not found.");
        }
*/



    // --> Largest of 3 no.s
        int number[] = {1, 2, 6, 3, 5};
        System.out.println("Largest no. is: " + getLargest(number));
        System.out.println("smallest no. is: " + getSmallest(number));

    }
}