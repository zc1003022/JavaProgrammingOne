package Chapter3;
import java.util.Scanner;
/**
 * Program compares prices
 *
 * @author Zach Conaughty
 */


public class C3_33 {
/**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the weight and price for package 1 ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print(" Enter the weight and price for package 2 ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        if (price1 / weight1 < price2 / weight2) {
            System.out.println(" Package 1 has a better price ");
        } else if (price2 / weight2 < price1 / weight1) {
            System.out.print(" Package 2 has a better price ");
        } else {
            System.out.print(" Package 1 has the same price as Package 2 ");
        }
    }
}
