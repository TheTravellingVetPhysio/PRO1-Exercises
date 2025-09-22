package session3_if_boolean;

import java.util.Scanner;

public class BeginnerIf
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int number = scanner.nextInt();

    if (number >= 0) {
      System.out.println("The number is positive.");
    }
    if (number < 0)
    {
      System.out.println("The number is negative.");
    }
    if (number % 2 == 0)
    {
      System.out.println("The number is even.");
    }
    if (number % 2 == 1)
    {
      System.out.println("The number is odd.");
    }
  }
}
