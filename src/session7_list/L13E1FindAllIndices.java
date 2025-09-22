package session7_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class L13E1FindAllIndices
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    String[] initialFruits = {"apple", "banana", "cherry", "date", "elderberry",
        "kiwi", "fig", "grape", "kiwi"};
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
        System.out.print("The list contains " + input + " at index: ");
        for (int i = 0; i < fruits.size(); i++)
        {
          if (fruits.get(i).equals(input))
          {
            System.out.print(i + " ");
          }
        }
        System.out.println("\n");
      }
      else
        {
          System.out.println("Your input wasn't found in the fruit list...");
        }
      }
    }
  }
