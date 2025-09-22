package session6_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UserDeterminesArraySize
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a size of an integer array: ");
    int i = scanner.nextInt();
    int[] n = new int[i];

    System.out.println("ENTER " + i + " NUMBERS ");

    for (i = 0; i <= n.length - 1; i++)
    {
      System.out.print("Enter " + (i + 1) + ". number: ");
      n[i] = scanner.nextInt();
    }
    System.out.println("Array contents: " + Arrays.toString(n));
  }
}
