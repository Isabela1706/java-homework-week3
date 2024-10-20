package javaprograms;

public class AvgArrays {
    public static void main(String[] args) {
        m2();

    }
    public static void m2(){
        // Initialize an array of integers
        int[] array = {10, 20, 30, 40, 50};

        // Variable to hold the sum
        int sum = 0;

        // Loop through the array and add each element
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        double average = (double) sum / array.length;


        // Print the sum of the array
        System.out.println("The average value of the array elements is: " + average);
    }
}
