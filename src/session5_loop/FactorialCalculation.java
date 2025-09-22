package session5_loop;

import java.util.Scanner;

public class FactorialCalculation
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int sum = 1;
    System.out.println("Enter a positive integer: ");
    int n = scanner.nextInt();
    int track = 1;

    System.out.print("The factorial of " + n + " is: ");

    while (track < n)
    {
      System.out.print(track + " * ");
      sum = sum * track;
      track++;
    }
    while (track == n)
    {
      System.out.print(track + " = ");
      sum = sum * track;
      track++;
    }
    System.out.println(sum);

  }
}
