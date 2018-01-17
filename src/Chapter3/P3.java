package Chapter3;
import java.util.Scanner;
/**
 * Program compares numbers
 *
 * @author Zach Conaughty
 */


public class P3 {
/**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a number ");
        double number = input.nextDouble();
        System.out.print(" Enter a second number ");
        double number2 = input.nextDouble();
        if (number < number2) {
            System.out.println(" The first number is less than the second ");
        }
        if (number > number2) {
            System.out.println("The first number is greater than the second ");
        }
        if (number == number2) {
            System.out.println(" The first number is equall to the second ");
        }
        if (number <= number2) {
            System.out.println(" The first number is less than or equall to the second ");
        }
        if (number != number2) {
            System.out.println(" The first number is not equal to the second ");
        }
        if (number2 == 0) {
            System.out.println(" Cannot divide by zero ");
        } else if (number / number2 < 1) {
            System.out.println(" Proper fraction ");
        } else {
            System.out.println(" Improper fraction ");
        }
        if (number >= 90) {
            System.out.println(" A ");
        } else if (number >= 80) {
            System.out.println(" B ");
        } else if (number >= 70) {
            System.out.println(" C ");
        } else if (number >= 60) {
            System.out.println(" D ");
        } else {
            System.out.println(" F ");
        }
        if (number2 >= 1 && number2 <= 100) {
            System.out.println(" In range ");
        } else {
            System.out.println(" Out of range ");
        }

    }
}
