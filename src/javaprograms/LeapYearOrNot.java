package javaprograms;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class LeapYearOrNot {
    public static void main(String[] args) {
        LeapYearOrNot obj = new LeapYearOrNot();
        obj.method();

    }
    public void method(){

        //Create a scanner
        Scanner scanner = new Scanner(System.in);

        //Ask user to input a year
        System.out.println("Enter a year : ");
        int year = scanner.nextInt();

        //check if the year is a leap year
        boolean isLeapYear = false;

        //A year is a leap year if
        //1. It is divided by 4
        //2. If it is divisible by 100, it should also be divisible by 400.
        if (year % 4 == 0 ){
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }else{
            isLeapYear = true;
            }
        }

            if(isLeapYear) {
                System.out.println(year + " is leap year ");
            }else{
                System.out.println(year + " is not a leap year ");

                scanner.close();

        }
    }


}
