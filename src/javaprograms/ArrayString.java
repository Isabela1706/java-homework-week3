package javaprograms;

import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        ArrayString qt = new ArrayString();
        qt.data();

    }

    public void data(){
        int[] numericArray = {1, 2, 9, 7, 5, 3};

        // String array
        String[] stringArray = {"Banana", "Apple", "Orange", "Grape", "Mango"};

        // Sort the numeric array
        Arrays.sort(numericArray);

        // Sort the string array
        Arrays.sort(stringArray);

        // Print sorted numeric array
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));

        // Print sorted string array
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}

