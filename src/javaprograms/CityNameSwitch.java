package javaprograms;

import java.util.Scanner;

/**
 * Same as above program-8 using switch statement.
 */

public class CityNameSwitch {
    public static void main(String[] args) {
        method();

    }
    private static void method(){
        //Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        //Input an alphabet
        System.out.println("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().toUpperCase().charAt(0);

        switch (alphabet){
            case 'A' :
                System.out.println("A --> Amritsar");
                break;
            case 'B' :
                System.out.println("B --> Bardford");
                break;
            case 'C' :
                System.out.println("C --> Cape Town");
                break;
            case 'D' :
                System.out.println("D --> Dallas");
                break;
            case 'E' :
                System.out.println("E --> Erzurum");
                break;
            case 'F' :
                System.out.println("F --> Fulda");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
        scanner.close();

    }

}
