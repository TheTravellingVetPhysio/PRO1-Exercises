package session6_arrays;

import java.util.Arrays;

public class FindLargestNumber
{
  public static void main(String[] args)
  {
    int[] n = {12, 45, 7, -89, 23, 2, 17, 16, 33};
    int largest = n[0];

    for (int i = 0; i < n.length; i++)
    {
      if (n[i] > largest)
      {
        largest = n[i];
      }
    }
    System.out.println("The largest number is: " + largest);
  }
}