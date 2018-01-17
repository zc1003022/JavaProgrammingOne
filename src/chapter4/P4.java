
package chapter4;
import java.util.Scanner;
/**
 * Program to display "Welcome to Java" to the console
 *
 * @author Zach Conaughty
 */

public class P4{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args ){
         Scanner input = new Scanner(System.in);
//Steps 1-3         
        System.out.print(" What is the name of the first bidder ");        
        String FirstBidder = input.next();
        System.out.print(" Enter the amount of hours required ");
        int FirstHours = input.nextInt();
        System.out.print(" Enter the amount charged per hour ");
        double FirstRate = input.nextDouble();
//Steps 4-6        
        System.out.print(" What is the name of the second bidder ");
        String SecondBidder = input.next();
        System.out.print(" Enter the amount of hours required ");
        int  SecondHours = input.nextInt();
        System.out.print(" Enter the amount charged per hour ");
        double SecondRate = input.nextDouble();
//Steps 7-8        
        double FirstCost = FirstHours * FirstRate;
        double SecondCost = SecondHours * SecondRate;
//Steps 9-13
        if (FirstCost < SecondCost)
            System.out.printf(" The winner is %s with the price %.2f", FirstBidder, FirstCost);
        if (SecondCost < FirstCost)
            System.out.printf(" The winner is %s with the price %.2f", SecondBidder, SecondCost);
        if (FirstCost == SecondCost && FirstHours < SecondHours)
            System.out.printf(" The winner is %s with the price %.2f with %d ", FirstBidder, FirstCost, FirstHours);
        if (SecondCost == FirstCost && SecondHours < FirstHours)
            System.out.printf(" The winner is %s the price %.2f with %d ", SecondBidder, SecondCost, SecondHours);
        if (FirstCost == SecondCost && FirstHours == SecondHours)
            System.out.printf(" Both %s and %s have the same price %.2f with %d hours ", FirstBidder, SecondBidder, FirstCost, FirstHours);
    }
}
