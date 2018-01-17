package Chapter2;
import java.util.Scanner;
/**
 * Program read the subtotal and gratuity rate then computes it to the total and gratuity
 *
 * @author Zach Conaughty
 */


public class C2_5 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a subtotal and a gratuity rate:");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + "and total is $" + total);
    }
}
