package session6_arrays;

import java.util.Arrays;

public class PrintArrayElement
{
  public static void main(String[] args)
  {
    int[] n = {42, 17, 85, 3, 99};

    for (int i = 0; i <= (n.length - 1); i++)
      System.out.println("Index " + i +": " + n[i]);
  }
}
