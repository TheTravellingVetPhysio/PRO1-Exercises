package session6_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountWithCondition
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    int[] n = {10, 20, 30, 40, 50, 60, 70, 80, 90};

    System.out.println("Enter a number: ");
    int input = scanner.nextInt();
    int sum = 0;

    for (int i = n.length-1; i >= 0; i--)
    {
      if (input < n[i])
      {
        sum = sum+1;
      }
    }
    System.out.println("There are " + sum + " numbers larger than " + input);
  }
}
