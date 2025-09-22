/** package session7_list;

import java.util.ArrayList;

public class L9E1FruitList
{
  public static void main(String[] args)
  {
    // Basic For Loop Iteration
    public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cherry");
    fruits.add("Date");

    System.out.println("Using traditional for loop:");
    for (int i = 0; i < fruits.size(); i++) {
      String fruit = fruits.get(i);
      System.out.println("Index " + i + ": " + fruit);
    }

    // Basic For-Each Loop
    ArrayList<String> colors = new ArrayList<>();
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");
    colors.add("Yellow");

    System.out.println("Using enhanced for loop:");
    for (String color : colors) {
      System.out.println("Color: " + color);
    }

    /**
     * Comparison: When to Use Each Method
     * Use Traditional For Loop When:
     * You need access to the index of each element
     * You want to modify elements in the list using set()
     * You need to iterate backwards through the list
     * You want to skip certain elements based on index
     * You need to compare adjacent elements
     * Use Enhanced For Loop When:
     * You only need to read the values
     * You want cleaner, more readable code
     * You're processing each element independently
     * You don't need the index information
     * Important Notes
     * Enhanced For Loop Limitations
     * The enhanced for loop has some limitations:
     *
     * Cannot modify the original list elements
     * Cannot access the current index
     * Cannot iterate in reverse order
     * Cannot easily skip elements

  }
  }
}
*/