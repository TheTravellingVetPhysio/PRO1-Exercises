package session3_if_boolean;

import java.util.Scanner;

public class IfElse
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a number between 0 and 100:");
    int score = scanner.nextInt();

    if (score >= 50)
    {
      System.out.println("You passed");
    }

    if (score < 50)
    {
      System.out.println("You failed");
    }
  }
}
