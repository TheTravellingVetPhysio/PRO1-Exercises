package session5_loop;

import java.util.Scanner;

public class Triangle
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number representing the height of a triangle: ");
    int n = scanner.nextInt();

    for (int i = 1; i <= n; i++){
      for (int j = 1; j <= i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
