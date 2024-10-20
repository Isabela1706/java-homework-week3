package javaprograms;
/**
 * WAP to input data
 */

import java.util.Scanner;

class WapProgram5 {
    public static void main(String[] args) {
        method();
    }



     static void method(){
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();

        scanner.nextLine();  // Consume newline left-over

        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate HRA, TA, DA, PF, and Gross Salary
        double HRA = basicSalary * 0.10;  // 10% of basic salary
        double DA = basicSalary * 0.08;   // 8% of basic salary
        double TA = basicSalary * 0.09;   // 9% of basic salary
        double PF = basicSalary * 0.20;   // 20% of basic salary

        // Gross Salary calculation
        double grossSalary = basicSalary + HRA + DA + TA - PF;

        // Print Salary Slip
        System.out.println("_______________________________________");
        System.out.println("|          Salary Slip                |");
        System.out.println("|____________________________________ |");
        System.out.println("| Employee Id   : " + employeeId + "|");
        System.out.println("| Employee Name : " + employeeName + "|");
        System.out.println("|_____________________________________|");
        System.out.printf("| Basic Salary  : %.2f  |/n", basicSalary);
        System.out.printf("| HRA 10%%       : %.2f         |/n", HRA);
        System.out.printf("| DA 8%%         : %.2f         |/n", DA);
        System.out.printf("| TA 9%%         : %.2f         |/n", TA);
        System.out.printf("| PF - 20%%      : %.2f         |/n", PF);
        System.out.println("|_____________________________________|");
        System.out.printf("| Gross Salary  : %.2f  |/n", grossSalary);
        System.out.println("|=======================================|");

        // Close scanner
        scanner.close();
    }
}

