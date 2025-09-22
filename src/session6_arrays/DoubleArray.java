package session6_arrays;

import java.util.Arrays;

public class DoubleArray
{
  public static void main(String[] args)
  {
    int[] n = {5, 10, 15, 20, 25};

    String printN = Arrays.toString(n);
    System.out.print("Original array: " + printN);


    for (int i = 0; i <= n.length-1; i++)
    {
      n[i] = (n[i]*2);
    }

    String doubled = Arrays.toString(n);
    System.out.println("\nDoubled array: " + doubled);
  }
}
