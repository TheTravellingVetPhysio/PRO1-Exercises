package session6_arrays;

import java.util.Arrays;

public class ReverseArrayCopy
{
  public static void main(String[] args)
  {
    int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] copy = new int[n.length];
    int j = 0;

    for (int i = n.length-1; i >= 0; i--)
    {
      copy[j] = n[i];
      j++;
    }
    String formatArrayN = Arrays.toString(n);
    String formatArrayCopy = Arrays.toString(copy);
    System.out.println(formatArrayN);
    System.out.println(formatArrayCopy);
  }
}
