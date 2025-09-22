package session3_if_boolean;

import java.util.Scanner;

public class AgeDescription
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter you age: ");
    int age = scanner.nextInt();

    if (age < 0)
    {
      System.out.println("Error, try again");
      return;
    }
    else if (age <= 12)
    {
      System.out.println("Child");
    }
    else if (age <= 19)
    {
      System.out.println("Teenager");
    }
    else if (age <= 65)
    {
      System.out.println("Adult");
    }
    else
    {
      System.out.println("Senior");
    }
  }
}
