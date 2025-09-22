package session7_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class L12IndexofanElement
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    String[] initialFruits = {"apple", "banana", "cherry", "date", "elderberry", "kiwi",
        "fig", "grape", "kiwi"};
    ArrayList<String> fruits = new ArrayList<>(Arrays.asList(initialFruits));

    while (true)
    {
      System.out.println("Enter a fruit to search for (or \"exit\" to stop): ");
      String input = scanner.nextLine().trim().toLowerCase();

      if (input.equals("exit"))
      {
        System.out.println("The program has stopped.");
        break;
      }
      else if (fruits.contains(input))
      {
        System.out.println("Your search was succesfull! We found " + input + " at index " + fruits.indexOf(input) + ".");
      }
      else
      {
        System.out.println("Either we didn't find or understand your input...");
      }
    }
  }
}
