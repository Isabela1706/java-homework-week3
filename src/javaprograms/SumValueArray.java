package javaprograms;

public class SumValueArray {
    public static void main(String[] args) {
        mt();

    }
    private static void mt(){
        // Initialize an array of integers
        int[] array = {10, 20, 30, 40, 50};

        // Variable to hold the sum
        int sum = 0;

        // Loop through the array and add each element to the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Print the sum of the array
        System.out.println("The sum of the array values is: "+ sum);
    }
}

