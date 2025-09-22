package session5_loop;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGuessingGame
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int random = ThreadLocalRandom.current().nextInt(1, 10+1);

    String line = "Guess the number (1-10): ";
    int n;

    do {
      System.out.print(line);
      n = scanner.nextInt();

      if (n < random)
      {
        System.out.println("Too low - try again!");
      }
      else if (n > random)
      {
        System.out.println("Too high - try again!");
      }
    }
    while (n != random);
    System.out.println("Yipeee! You guessed it. The number is " + random);
  }
}
