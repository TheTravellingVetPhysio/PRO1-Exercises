package session5_loop;

import java.util.Scanner;

public class SumUntilBelowMinusTen
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int min = -10;

    while (true)
    {
      System.out.println("Enter a number: ");
      int input = scanner.nextInt();
      sum = sum + input;

      if (sum >= min)
      {
        System.out.println("Current sum: " + sum);
      }
      else
      {
        System.out.println("Sum has dropped below -10. Stopping.\nFinal sum: " + sum);
        break;
      }
    }
  }
}
