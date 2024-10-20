package javaprograms;

import java.util.Scanner;

public class PosNegZer {
    public static void main(String[] args) {
        method();
        
    }
    static void method(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        

        if(number > 0 ){
        System.out.println(number + " Positive ");
        } else if (number < 0) {
            System.out.println(number + " Negative ");
        }else {
            System.out.println("The number is Zero ");
        }
        scanner.close();
    }
}
