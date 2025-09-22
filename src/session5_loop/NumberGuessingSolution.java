package session5_loop;

import java.util.Scanner;

public class NumberGuessingSolution
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int randomNumber = (int)(Math.random() * 10) + 1;
    int guess = 0;

    while (guess != randomNumber) {
      System.out.print("Guess the number (1-10): ");
      guess = scanner.nextInt();

      if (guess < randomNumber) {
        System.out.println("Too low! Try again.");
      } else if (guess > randomNumber) {
        System.out.println("Too high! Try again.");
      }
    }

    System.out.println("Congratulations! You guessed it! The number was " + randomNumber + ".");
  }
}
