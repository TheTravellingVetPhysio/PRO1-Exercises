package session7_list;

import java.util.ArrayList;
import java.util.Scanner;

public class E8E1InteractiveList
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> list = new ArrayList<>();

    while (true)
    {
      System.out.println("This is your current list: " + list);
      System.out.println(
          "Do you want to 1) add or 2) remove something from the list or 0) stop the program (write the number 0, 1 or 2)?");
      int action = scanner.nextInt();
      scanner.nextLine();
      int index;
      String input;

      if (action == 0)
      {
        System.out.println("The program has finished. Your list is: " + list);
        break;
      }
      else if (action == 1)
      {
        System.out.println("What do you want to add to the list?");
        input = scanner.nextLine();
        list.add(input);
      }
      else if (action == 2)
      {
        if (list.isEmpty())
        {
          System.out.println("Your list is already empty...");
        }
        else
        {
          System.out.println(
              "At which index do you wish to remove an index? Choose between 0 and " + (list.size() - 1) + ": ");
          index = scanner.nextInt();
          if (index >= 0 && index < list.size())
          {
            list.remove(index);
          }
          else
          {
            System.out.println("Whoops, that index is not a part of the list...");
          }
        }
      }
    }
  }
}
// To improve my code I could use switch statements with case 0-2 and put the actual actions into separate helper methods.

/**
public class E8E1InteractiveList {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();

    while (true) {
      System.out.println("\nCurrent list: " + list);
      System.out.println("Choose an action:");
      System.out.println("1) Add item");
      System.out.println("2) Remove item");
      System.out.println("0) Exit");

      int action = scanner.nextInt();
      scanner.nextLine(); // Clear newline

      switch (action) {
        case 0:
          exitProgram(list);
          return;
        case 1:
          addItem(scanner, list);
          break;
        case 2:
          removeItem(scanner, list);
          break;
        default:
          System.out.println("Invalid choice. Please enter 0, 1, or 2.");
      }
    }
  }

  private static void exitProgram(ArrayList<String> list) {
    System.out.println("Program ended. Final list: " + list);
  }

  private static void addItem(Scanner scanner, ArrayList<String> list) {
    System.out.print("Enter item to add: ");
    String input = scanner.nextLine();
    list.add(input);
    System.out.println("Added \"" + input + "\" to the list.");
  }

  private static void removeItem(Scanner scanner, ArrayList<String> list) {
    if (list.isEmpty()) {
      System.out.println("List is empty. Nothing to remove.");
      return;
    }
    System.out.print("Enter index to remove (0 to " + (list.size() - 1) + "): ");
    int index = scanner.nextInt();
    scanner.nextLine(); // Clear newline

    if (index >= 0 && index < list.size()) {
      String removed = list.remove(index);
      System.out.println("Removed \"" + removed + "\" from the list.");
    } else {
      System.out.println("Invalid index.");
    }
  }
}
*/