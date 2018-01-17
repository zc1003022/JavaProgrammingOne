package Chapter3;
import java.util.Scanner;
/**
 * Program to display heads or tails against your guess
 *
 * @author Zach Conaughty
 */


public class C3_14 {
/**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        int coin = (int) (Math.random() * 2);
        Scanner input = new Scanner(System.in);
        System.out.print("0 is Head's 1 is Tail's time to guess: ");
        int guess = input.nextInt();
        System.out.println("The coin is " + coin);
        if (guess == coin) {
            System.out.println(" you guessed right!! ");
        } else {
            System.out.println(" So Close! Try again ");
        }
    }
}
