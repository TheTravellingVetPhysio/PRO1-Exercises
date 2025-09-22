package session5_loop;

import java.util.Scanner;

public class SumUntilX
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    String line = "Enter a number (x to stop): ";
    int sum = 0;
    String input;

    do
    {
      System.out.println(line);
      input = scanner.nextLine();

      if (!input.equals("x"))
      {
        int n = Integer.parseInt(input);
        sum = sum + n;
      }
    }
    while (!input.equals("x"));
    System.out.println("The total sum is: " + sum);
  }
}

