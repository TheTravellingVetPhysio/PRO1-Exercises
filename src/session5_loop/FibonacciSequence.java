package session5_loop;

import java.util.Scanner;

public class FibonacciSequence
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a number: ");
    int n = scanner.nextInt();

    int a = 0;
    int b = 1;

    for (int next = a + b; next <= n; next = a + b){
      System.out.println(next);
      a = b;
      b = next;
    }
  }
}
