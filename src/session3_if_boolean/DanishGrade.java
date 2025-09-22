package session3_if_boolean;

import java.util.Scanner;

public class DanishGrade
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a grade: ");
    int grade = scanner.nextInt();

    String result = "Fail";

    if (grade != 12 && grade != 10 && grade != 7 && grade != 4 && grade != 2 && grade !=0 && grade !=-3)
    {
      System.out.println("That is not a valid grade:");
      return;
    }
    if (grade == 12)
    {
      result = "A";
    }
    else if (grade == 10)
    {
      result = "B";
    }
    else if (grade == 7)
    {
      result = "C";
    }
    else if (grade == 4)
    {
      result = "D";
    }
    else if (grade == 2)
    {
      result = "E";
    }
    else if (grade == 0)
    {
      result = "Fx";
    }
    else if (grade == -3)
    {
      result = "F";
    }
    System.out.println("Your grade is " + result);
  }
}
