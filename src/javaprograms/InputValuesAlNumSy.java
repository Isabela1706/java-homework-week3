package javaprograms;

import java.util.Scanner;

public class InputValuesAlNumSy {
    public static void main(String[] args) {
        Inp();

    }
    public static void Inp(){
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a character
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);  // Read the first character input

        // Check if the character is an alphabet
        if ((input >= 'A' && input <= 'Z') || (input >= 'a' && input <= 'z')) {
            System.out.println(input + " is an alphabet.");
        }
        // Check if the character is a digit
        else if (input >= '0' && input <= '9') {
            System.out.println(input + " is a number.");
        }
        // If it's not an alphabet or a number, it must be a symbol
        else {
            System.out.println(input + " is a symbol.");
        }

        // Close the scanner
        scanner.close();
    }
}

