package Chapter5;

import java.util.Scanner;

/**
 * Program reads Celsius and converts to Fahrenheit
 *
 * @author Zach Conaughty
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Y to vote yes, enter N to vote no, enter Q to quit voting. ");
        int yes = 0;
        int no = 0;
        int invalid = 0;
        int totalVotes = 0;
        String vote;
        vote = input.next().toLowerCase();
        while (!vote.equals("q")) {
            switch (vote) {
                case "y": {
                    ++totalVotes;
                    ++yes;
                }
                break;
                case "n": {
                    ++no;
                    ++totalVotes;
                }
                break;
                default: {
                    System.out.println("Invalid Code. Enter Y for yes, N for no, and Q to quit voting");
                    ++invalid;
                    ++totalVotes;
                }
                break;
            }
            System.out.println("Enter Y to vote yes, enter N to vote no, enter Q to quit voting. ");
            vote = input.next().toLowerCase();
        }
        System.out.println("For votes saying yes their is " + yes);
        System.out.println("For votes saying no their is " + no);
        System.out.println("For votes invalid their is " + invalid);
        System.out.println("For total votes their is " + totalVotes);
    }
}
