package session6_arrays;

import java.util.Arrays;

public class FruitsFormatted
{
  public static void main(String[] args)
  {
    String[] fruits = {"apple", "banana", "cherry", "date", "elderberry"};

    System.out.print("Formatted fruits: ");
    for (int i = 0; i < fruits.length; i++)
    {
      System.out.print(
          fruits[i].substring(0, 1).toUpperCase() + fruits[i].substring(1)
              .toLowerCase() + ". ");
    }
  }
}
