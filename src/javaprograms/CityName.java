package javaprograms;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class CityName {
    public static void main(String[] args) {
        CityName C = new CityName();
        C.city();

    }
    protected void city(){

        //Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        //Input an alphabet
        System.out.println("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().toUpperCase().charAt(0);

        //Check the input alphabet and print corresponding city name
        if (alphabet == 'A'){
            System.out.println("A --> Amritsar");
        } else if (alphabet == 'B'){
            System.out.println("B --> Bardford");
        } else if (alphabet == 'C') {
            System.out.println("C --> Cape Town");
        } else if (alphabet == 'D') {
            System.out.println("D --> Dallas");
        } else if (alphabet == 'E') {
            System.out.println("E --> Erzurum");
        }else if (alphabet == 'F'){
            System.out.println("F --> Fulda");
        }else {
            System.out.println("Invalid entry");
        }
scanner.close();
    }
}
