package session5_loop;

import java.util.Scanner;

public class SumOfNumbers
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int number = scanner.nextInt();

    int result = 0;
    String details = "(";
    for (int i = 0; i <= number; i++)
    {
      result += i;
      details += i;
      if (i < number) {
        details += "+";
      }
    }
    details += "): ";

    System.out.println("Sum of " + details + result);
  }
}
