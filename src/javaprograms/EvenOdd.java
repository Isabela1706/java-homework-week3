package javaprograms;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd abc = new EvenOdd();
        abc.method();

    }

    private void method(){
        //Create a scanner here #
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
        scanner.close();
    }

}
