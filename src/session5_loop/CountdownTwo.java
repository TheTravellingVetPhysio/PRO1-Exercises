package session5_loop;

import java.util.Scanner;

public class CountdownTwo
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int n = scanner.nextInt();

    while (n > 0) {
      System.out.println(n);
      n--;
    }
    System.out.println("Happy New Year");
  }
}
