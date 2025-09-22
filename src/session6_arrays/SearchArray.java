package session6_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SearchArray
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    String[] fruits = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi"};

    System.out.println("Enter a fruit to search for: ");
    String searchFruit = scanner.nextLine().trim().toLowerCase();

    boolean found = false;
    int foundIndex = -1;

    for (int i = 0; i < fruits.length; i++)
    {
      if (fruits[i].equals(searchFruit))
      {
        found = true;
        foundIndex = i;
        break;
      }
    }

    if (found)
    {
      System.out.println("Found " + searchFruit + " at index " + foundIndex);
      System.out.println("The word has " + searchFruit.length() + " letters and starts with \"" + searchFruit.charAt(0) + "\"");
    }
    else
    {
      System.out.println("Your fruit " + searchFruit + " was not found.");
    }
  }
}
