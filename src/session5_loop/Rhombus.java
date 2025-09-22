package session5_loop;

import java.util.Scanner;

public class Rhombus
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    int n;

    while (true)
    {
      System.out.println("Enter a height for the rhombus:");
      n = scanner.nextInt();

      if (n % 2 == 1)
      {
        break;
      }
      else
      {
        System.out.println("A rhomboid must have an odd number. Try again.");
      }
    }

    for (int i = 1; i <= n/2+1 ; i++)
    {
      for (int j = n; j > i; j--)
      {
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i - 1); k++)
      {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = n/2; i >= 1; i--)
    {
      for (int j = n; j > i; j--)
      {
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i - 1); k++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
