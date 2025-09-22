package session7_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class L14ListApp
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> list = new ArrayList<>();
    Collections.addAll(list, "Apple", "Kiwi", "Apple", "Banana");
    int input;

    while (true)
    {
      System.out.println("\nWhat do you want to do (enter number): ");
      System.out.println("0. Exit");
      System.out.println("1. Display list");
      System.out.println("2. Add an item");
      System.out.println("3. Remove an item");
      System.out.println("4. Remove a value");
      System.out.println("5. Remove all occurences of single item");
      System.out.println("6. Search for element");
      System.out.println("7. Count total number of items in list");
      System.out.println("8. Clear list");
      System.out.println("9. Replace item");

      if (!scanner.hasNextInt())
      {
        System.out.println("Invalid input! Please enter a number.");
        scanner.nextLine(); // discard invalid input
        continue; // restart loop
      }

      input = scanner.nextInt();
      scanner.nextLine();

      switch (input)
      {
        case 0:
          System.out.println("The program has terminated.");
          scanner.close();
          return;
        case 1:
          printSummary(list);
          break;
        case 2:
          addItem(scanner, list);
          break;
        case 3:
          removeItem(scanner, list);
          break;
        case 4:
          removeValue(scanner, list);
          break;
        case 5:
          removeAll(scanner, list);
          break;
        case 6:
          searchItem(scanner, list);
          break;
        case 7:
          countItems(scanner, list);
          break;
        case 8:
          clearList(scanner, list);
          break;
        case 9:
          replaceItem(scanner, list);
          break;
        default:
          System.out.println(
              "Your number is not part of the choices. Try again!");
      }
    }
  }

  private static void addItem(Scanner scanner, ArrayList<String> list)
  {
    System.out.println("Enter what to add: ");
    String item = scanner.nextLine().trim();
    list.add(item);
    System.out.println("\"" + item + "\" was added to the list.");
  }

  private static void printSummary(ArrayList<String> list)
  {
    System.out.println("The list currently contains: " + list.size()
        + " items and consist of: ");
    if (list.isEmpty())
    {
      System.out.println("The list is currently empty...");
      return;
    }
    else
    {
      System.out.println(list);
    }
  }

  private static void removeItem(Scanner scanner, ArrayList<String> list)
  {
    printSummary(list);
    System.out.println("Which index does the item you want to remove have? ");
    int index = scanner.nextInt();

    if (index >= 0 && index < list.size())
    {
      String removed = list.remove(index);
      System.out.println("Removed \"" + removed + "\" from the list.");
    }
    else
    {
      System.out.println("Not a valid index...");
    }
  }

  private static void removeValue(Scanner scanner, ArrayList<String> list)
  {
    printSummary(list);
    System.out.println("Which item do you want to remove? ");
    String input = scanner.nextLine().trim();

    if (list.contains(input))
    {
      list.remove(input);
      System.out.println("Removed \"" + input + "\" from the list.");
    }
    else
    {
      System.out.println("Your input was not found.");
    }
  }

  private static void removeAll(Scanner scanner, ArrayList<String> list)
  {
    printSummary(list);
    System.out.println("Which item do you wish to remove all occurences of? ");
    String input = scanner.nextLine().trim();

    boolean found = false;

    for (int i = list.size() - 1; i >= 0; i--)
    {
      if (list.get(i).equalsIgnoreCase(input))
      {
        list.remove(i);
        found = true;
      }
    }
    if (found)
    {
      System.out.println("Removed all " + input + " from the list.");
    }
    else
    {
      System.out.println("Did not find " + input + " in the list...");
    }
  }

  private static void searchItem(Scanner scanner, ArrayList<String> list)
  {
    System.out.println("What do you want to seach for? ");
    String input = scanner.nextLine().trim();

    if (list.contains(input))
    {
      System.out.print("The list contains " + input + " at index: ");
      for (int i = 0; i < list.size(); i++)
      {
        if (list.get(i).equals(input))
        {
          System.out.print(i + " ");
        }
      }
      System.out.println("\n");
    }
    else
    {
      System.out.println("Your input wasn't found in the list...");
    }
  }

  private static void countItems(Scanner scanner, ArrayList<String> list)
  {
    System.out.println("There are " + list.size() + " elements in the list.");
  }

  private static void clearList(Scanner scanner, ArrayList<String> list)
  {
    System.out.println(
        "Are you sure you want to clear the whole list (yes / no)?");

    switch (scanner.nextLine().trim().toLowerCase())
    {
      case "yes":
        list.clear();
        System.out.println("The list has been cleared.");
        break;
      case "no":
        System.out.println("The list is preserved.");
        break;
      default:
        System.out.println(
            "Your input was not recognized. Choose again to proceed.");
    }
  }

  private static void replaceItem(Scanner scanner, ArrayList<String> list)
  {
    printSummary(list);
    System.out.println(
        "What index do you want to replace and add a new value to?");
    int index = scanner.nextInt();
    scanner.nextLine();

    if (index >= 0 && index < list.size())
    {
      System.out.println("What should it be replaced with?");
      String newString = scanner.nextLine().trim();
      String oldString = list.set(index, newString);
      System.out.println(oldString + " has been replaced with " + newString);
      printSummary(list);
    }
    else
    {
      System.out.println("Index not found or entry invalid.");
    }
  }
}