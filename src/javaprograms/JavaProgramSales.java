package javaprograms;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 */

public class JavaProgramSales {
    public static void main(String[] args) {
        JavaProgramSales t = new JavaProgramSales();
        t.method();

    }
    public void method(){
        Scanner scanner = new Scanner(System.in);

        // Input sales details
        System.out.print("Enter Sales ID: ");
        int salesId = scanner.nextInt();

        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter Seller's Name: ");
        String sellerName = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate commission based on sales amount
        double commissionPercentage;

        if (salesAmount >= 50000) {
            commissionPercentage = 35;
        } else if (salesAmount >= 30000) {
            commissionPercentage = 20;
        } else if (salesAmount >= 20000) {
            commissionPercentage = 10;
        } else if (salesAmount >= 10000) {
            commissionPercentage = 5;
        } else {
            commissionPercentage = 2;
        }
// Calculate commission amount
        double commission = (commissionPercentage / 100) * salesAmount;

        // Output the results
        System.out.println("__________________________________________________");
        System.out.println("|       Sales Commission                         |");
        System.out.println("|________________________________________________|");
        System.out.println("| Sales ID       : " + salesId + "               |");
        System.out.println("| Seller's Name  : " + sellerName + "            |");
        System.out.println("|________________________________________________|");
        System.out.printf("| Sales Amount   : %.2f            |\n", salesAmount);
        System.out.printf("| Basic Salary   : %.2f            |\n", basicSalary);
        System.out.printf("| Commission %%    : %.2f |\n", commissionPercentage);
        System.out.printf("| Commission Amt : %.2f             |\n", commission);
        System.out.println("|_________________________________________________|");

        // Close the scanner
        scanner.close();




    }
}
