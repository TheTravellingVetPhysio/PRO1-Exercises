package session6_arrays;

import java.util.Arrays;

public class ArraysReverseOrder
{
  public static void main(String[] args)
  {
    int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    System.out.print("Arrays in reverse order: ");
    for (int i = n.length - 1; i >= 0; i--)
    {
      System.out.print(n[i] + " ");
    }
  }
}
