package session5_loop;

import java.util.Scanner;

public class ForLoopsNumbersEven
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = scanner.nextInt();

    for (int i = 0; i <= n; i += 2)
    {
      System.out.println(i);

    }

    for (int ii = 0; ii <= n; ii++)
    {
      if (ii % 2 == 0)
      {
        System.out.println(ii);
      }

    }
  }
}
