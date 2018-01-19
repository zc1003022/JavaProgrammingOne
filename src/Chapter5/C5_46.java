package Chapter5;

import java.util.Scanner;

/**
 * Program reads Celsius and converts to Fahrenheit
 *
 * @author Zach Conaughty
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println("The reversed string is " + (new StringBuffer(s).reverse().toString()));
    }
}
