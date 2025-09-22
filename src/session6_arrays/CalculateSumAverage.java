package session6_arrays;

import java.util.Arrays;

public class CalculateSumAverage
{
  public static void main(String[] args)
  {
    int[] n = {12, 45, 7, 89, 23, 2, 17, 16, 33};
    int sum = 0;
    int largest = n[0];

    for (int i = 0; i < n.length; i++)
    {
      sum = sum + n[i];
    }
    System.out.println(
        "Total sum: " + sum + "\nAverage: " + (sum / (n.length)));
  }
}
