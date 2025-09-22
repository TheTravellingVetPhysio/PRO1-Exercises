package session6_arrays;

import java.util.Arrays;

public class SafeArrayAccess
{
  public static void main(String[] args)
  {
    int[] n = {10, 20, 30, 40, 50};
    System.out.println(n.length + "\n" + n[0] + " " + n[2] + " " + n[n.length-1]);
  }
}
