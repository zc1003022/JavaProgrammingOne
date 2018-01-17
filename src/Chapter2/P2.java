
package Chapter2;
import java.util.Scanner;
/**
 * Program read the prices you give it then adds them giving you the subtotal,tax,tip and total
 *
 * @author Zach Conaughty
 */


public class P2{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the price of meal ");
        double meal = input.nextDouble();
        System.out.print(" Enter price of drink ");
        double drink = input.nextDouble();
        System.out.print(" Enter price of dessert ");
        double dessert = input.nextDouble();
        double subtotal = meal + drink + dessert;
        double tax = subtotal * 0.10;
        double tip = ( subtotal + tax ) * 0.15;
        double total = subtotal + tax + tip;
        System.out.println("The subtotal is $" + subtotal);
        System.out.println("The tax is $" + tax);
        System.out.println("The tip is $" + tip);
        System.out.println("The total is $" + total);
    }
}