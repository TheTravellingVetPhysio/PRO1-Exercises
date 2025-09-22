package session5_loop;

import java.util.Scanner;

public class Countdown
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int n;

    do
    {
      System.out.println("Enter a positive number: ");
      n = scanner.nextInt();
      if (n <= 0)
      {
        System.out.println("Whoops, you number needs to be positive, try again ... ");
      }
    } while (n <= 0);

    while (n > 0)
    {
      System.out.println(n);
      n--;
    };
  }
}
