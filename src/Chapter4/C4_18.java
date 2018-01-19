package Chapter4;

import java.util.Scanner;

/**
 * Program reads Celsius and converts to Fahrenheit
 *
 * @author Zach Conaughty
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the employee's name ");
        String name = input.nextLine();
        System.out.print("Enter how many hours they worked ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter their pay rate ");
        double payRate = input.nextDouble();
        System.out.print("Enter the federal tax withholding rate ");
        double federalTax = input.nextDouble();
        System.out.print("Enter the state tax withholding rate ");
        double stateTax = input.nextDouble();

        // Computations
        double grossPay = hoursWorked * payRate;
        double federalTaxWithholding = federalTax * grossPay;
        double stateTaxWithholding = stateTax * grossPay;
        double totalDeduction = federalTaxWithholding + stateTaxWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.printf("\nEmployee Name: %s", name);

        System.out.printf("\nHours Worked: %.2f", hoursWorked);

        System.out.printf("\nPayRate: $%.2f", payRate);

        System.out.printf("\nGross Pay: $%.2f", grossPay);

        System.out.printf("\nDeductions:\n   Federal Witholding (%.2f%%): $%.2f\n   State Witholding (%.2f%%): $%.2f\n   Total Deduction: $%.2f", (federalTax * 100), federalTaxWithholding, (stateTax * 100), stateTaxWithholding, (federalTaxWithholding + stateTaxWithholding));

        System.out.printf("\nNet Pay: $%.2f", netPay);

    }
}
