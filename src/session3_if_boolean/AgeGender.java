package session3_if_boolean;

import java.util.Scanner;

public class AgeGender
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write F for female or M for male: ");
    char gender = scanner.next().charAt(0);

    System.out.println("Write an age: ");
    int age = scanner.nextInt();

    if ((gender != 'M' && gender != 'F') || (age < 0))
    {
      System.out.println("Invalid entry");
      return;
    }
    else if (gender == 'F' && age < 18)
    {
      System.out.println("Girl");
    }
    else if (gender == 'F' && age >= 18)
    {
      System.out.println("Woman");
    }
    else if (gender == 'M' && age < 18)
    {
      System.out.println("Boy");
    }
    else if (gender == 'M' && age >= 18)
    {
      System.out.println("Man");
    }
  }
}