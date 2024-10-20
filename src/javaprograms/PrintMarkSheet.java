package javaprograms;
/**
 * Pirnt the marksheet
 */

import java.util.Scanner;

public class PrintMarkSheet {
    public static void main(String[] args) {
        PrintMarkSheet obj = new PrintMarkSheet();
        obj.method();



    }
    public void method(){
        Scanner scanner = new Scanner(System.in);

        //Input student details
        System.out.println("Enter Student name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        //Input and validate marks
        int mathMarks = validMarks(scanner, "Math");
        int scienceMarks = validMarks(scanner, "Science");
        int englishMarks = validMarks(scanner, "English");

        //Calculate total and percentage
        int total = mathMarks + scienceMarks + englishMarks;
        double percentage = total / 3.0;

        //Determine pass or fail
        String result = (percentage >= 35) ? "Pass" : "Fail";

        //Determine grade
        String grade;
        if (percentage >=80){
            grade = "A+";
        } else if (percentage >=60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        }else {
            grade = "F";
        }

        //Print the mark sheet
        System.out.println("________________________________");
        System.out.println("|                              |");
        System.out.println("|         Mark Sheet           |");
        System.out.println("|______________________________|");
        System.out.println("| Name    : " + name + "       |");
        System.out.println("| Roll No : " + rollNo + "     |");
        System.out.println("|______________________________|");
        System.out.println("| Subjects: Marks             |");
        System.out.println("|______________________________|");
        System.out.println("| Math    : " + mathMarks + " |");
        System.out.println("| Science : " + scienceMarks +"|");
        System.out.println("| English : " + englishMarks + "|");
        System.out.println("|______________________________|");
        System.out.println("| Total   : " + total + "     |");
        System.out.println("|______________________________|");
        System.out.println("| Percentage: " + percentage +"|");
        System.out.println("| Result   : " + result + "    | ");
        System.out.println("| Grade  : " + grade +"        |");
        System.out.println("|______________________________|");
    }

    //Method to get valid marks between 0 to 100
    private static int validMarks(Scanner scanner, String subject){
        int marks;
        while(true){
            System.out.println("Enter " + subject + " marks (0-100): ");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100){
                break;
            } else {
                System.out.println("Invalid Input, Marks should be between 0 to 100.");
            }
        }
        return marks;
    }
}
