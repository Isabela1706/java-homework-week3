package javaprograms;
/**
 * .Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator add = new Calculator();
        add.cal();

    }
    public void cal(){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter an operation symbol (+, -, *, /):) ");
        double symbol = scanner.next().charAt(0);


        if (symbol == '+'){
            System.out.println("Result: " + (num1 + num2));
        } else if (symbol == '-') {
            System.out.println("Result: " + (num1 - num2));
        }else if (symbol == '*'){
            System.out.println("Result: " + (num1 * num2));
        }else if (symbol == '/'){
            if (num2 != 0){
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid symbol entered.");
        }
        scanner.close();




    }
}
