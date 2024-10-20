package javaprograms;
/**
 * Created by Ishika Dhami
 *
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        method();


    }

    public static void method() {
        //scanner starts here
        Scanner scanner = new Scanner(System.in);


        //we will print the enter text here
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();

        String oddEven = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + oddEven);

        //scanner is close here
        scanner.close();
    }
}
