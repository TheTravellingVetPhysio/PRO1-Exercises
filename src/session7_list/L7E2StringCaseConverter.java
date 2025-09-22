package session7_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class L7E2StringCaseConverter
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> wordPool = new ArrayList<>();
    Collections.addAll(wordPool, "hello", "WORLD", "Java", "CODE",
        "programming", "FUN");

    System.out.println("Here is a list of words:");
    printListWithPositions(wordPool);

    while (true)
    {
      System.out.print("Current words: ");
      printListWithPositions(wordPool);
      System.out.println("Enter word position for word, you would like to modify (or 0 to exit): ");
      int index = scanner.nextInt();

      if (index == 0)
      {
        System.out.println("Program finished... Final words: ");
        printListWithPositions(wordPool);
        break;
      }

      if (index < 0 || index >= wordPool.size() + 1)
      {
        System.out.println("Invalid position, try again!");
        continue;
      }

      System.out.println(
          "Which of the following alterations would you like to do? (Enter the number)\n1. Convert to UPPERcase\n2. Convert to lowercase\n3. Capitalize");
      int mod = scanner.nextInt();

      String oldWord = wordPool.get(index - 1);
      String newWord;

      if (mod == 1)
      {
        newWord = oldWord.toUpperCase();
      }
      else if (mod == 2)
      {
        newWord = oldWord.toLowerCase();
      }
      else if (mod == 3)
      {
        newWord = oldWord.substring(0, 1).toUpperCase() + oldWord.substring(1)
            .toLowerCase();
      }
      else
      {
        System.out.println("Invalid entry. Try again...");
        return;
      }

      wordPool.set(index - 1, newWord);

      System.out.println(
          "Word at position " + index + " changed from '" + oldWord + "' to '"
              + newWord + "'");
      System.out.println("Updated words: " + wordPool);
    }

    scanner.close();
  }

    public static void printListWithPositions(ArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.println((i + 1) + ": " + list.get(i) + " ");
    }
  }
}
