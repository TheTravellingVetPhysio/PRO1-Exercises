package session7_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class L10FindingElementInList
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    String[] initialFruits = {"apple", "banana", "cherry", "date", "elderberry",
        "fig", "grape", "kiwi"};
    ArrayList<String> fruits = new ArrayList<>(Arrays.asList(initialFruits));


    while (true)
    {
      System.out.println("Enter a fruit to search for (or \"exit\" to stop): ");
      String input = scanner.nextLine().trim().toLowerCase();

      if (input.equals("exit"))
      {
        System.out.println("The program has stopped...");
        break;
      }
      else if (fruits.contains(input))
      {
        System.out.println("Found: " + input);
      }
      else
      {
        System.out.println("Did not find " + input + "...");
      }
    }
  }
}
