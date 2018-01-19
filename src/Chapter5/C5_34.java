package Chapter5;

import java.util.Scanner;

/**
 * Program reads Celsius and converts to Fahrenheit
 *
 * @author Zach Conaughty
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerGuess, playerGuess;
        int compCount = 0, playerCount = 0;
        do {
            System.out.print("Enter Scissors(0),Rock(1), or Paper(2) ");
            playerGuess = input.nextInt();
            computerGuess = (int) (Math.random() * 3);
            switch (playerGuess) {
                case 0:
                    if (computerGuess == 0) //Its a tie
                    {
                        System.out.println("The computer is " + computerGuess + " your guess " + playerGuess + " you tied!");
                    } else if (computerGuess == 1) {// You Lose
                        compCount++;
                        System.out.println("The computer is " + computerGuess + " your guess " + playerGuess + " you lose!");
                    } else if (computerGuess == 2) {//You win
                        playerCount++;
                        System.out.println("The computer is " + computerGuess + " your guess " + playerGuess + " you win!");
                    }
                    break;
                case 1:
                    if (computerGuess == 0) //Its a tie
                    {
                        System.out.println("The computer is " + computerGuess + " your guess " + playerGuess + " you tied!");
                    } else if (computerGuess == 1) { // You Lose
                        compCount++;
                        System.out.println("The computer is " + computerGuess + " your guess " + playerGuess + " you lose!");
                    } else if (computerGuess == 2) {//You win
                        playerCount++;
                        System.out.println("The computer is " + computerGuess + " your guess " + playerGuess + " you win!");
                    }
                    break;
                case 2:
                    if (computerGuess == 0) //Its a tie
                    {
                        System.out.println("The computer is " + computerGuess + " your guess " + playerGuess + " you tied!");
                    } else if (computerGuess == 1) {// You Lose
                        compCount++;
                        System.out.println("The computer is " + computerGuess + " your guess " + playerGuess + " you lose!");
                    } else if (computerGuess == 2) {//You win
                        playerCount++;
                        System.out.println("The computer is " + computerGuess + " your guess " + playerGuess + " you win!");
                    }
                    break;
            }
        } while (playerCount < 2 && compCount < 2);
        if (playerCount < compCount) {
            System.out.println("The computer has won more than two games");
        }
        if (playerCount > compCount) {
            System.out.println("You have won more than two games");
        }
    }
}
