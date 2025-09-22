package session6_arrays;

import java.util.Arrays;

public class FruitListWhileLoop
{
  public static void main(String[] args)
  {
    String[] fruit = {"apple", "banana", "orange", "grape"};
    int i = 0;

    while (i < fruit.length)
    {
      System.out.println("Fruit " + (i + 1) +": " + fruit[i]);
      i++;
    }
  }
}
