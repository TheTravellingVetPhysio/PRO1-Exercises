package session6_arrays;

import jfx.incubator.scene.control.richtext.SelectionSegment;

import java.util.Scanner;

public class SumOfArray
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int[] n = new int[5];
    int sum = 0;

    for (int i = 0; i <= 4; i++)
    {
      System.out.print("Enter number " + (i + 1) + ": ");
      n[i] = scanner.nextInt();
      sum = sum + n[i];
    }
    System.out.println("The sum of all numbers is: " + sum);
  }
}
