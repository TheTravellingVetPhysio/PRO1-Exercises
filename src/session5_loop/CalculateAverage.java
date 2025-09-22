package session5_loop;

import java.util.Scanner;

public class CalculateAverage
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int input;
    int sum = 0;

    for (int i = 1; i <= 5; i++)
    {
      System.out.print("Enter number " + i + "/5: ");
      input = scanner.nextInt();
      sum = sum + input;
    }
    System.out.println("The average is: " + sum/5.0);
  }
}
