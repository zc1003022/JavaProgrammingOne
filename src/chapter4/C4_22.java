package chapter4;
import java.util.Scanner;
/**
 * Program to display "Welcome to Java" to the console
 *
 * @author Zach Conaughty
 */


public class C4_22 {
/**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String1 ");

        String s1 = input.nextLine();
        System.out.print("Enter String2 ");
        String s2 = input.nextLine();
        if (s1.indexOf(s2) != -1) {
            System.out.printf("%s is a substring of %s%n ", s2, s1);
        } else {
            System.out.printf("%s is not a substring of %s%n ", s2, s1);
        }
    }
}
