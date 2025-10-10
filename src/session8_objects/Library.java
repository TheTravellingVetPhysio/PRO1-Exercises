/** package session8_objects;

import java.util.Scanner;

public class Library
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int input;

    Book isbn123 = new Book("The Big Terrible Thing", 123, "Mathew Perry");
    Book isbn456 = new Book("Frozen", 456, "Disney");
    Book isbn789 = new Book("The Hunger Games", 789, "Suzanne Collins");

    while (true)
    {
      System.out.println("What do you want to do? (enter number)");
      System.out.println("1. Search for a book");
      System.out.println("2. Loan a book");
      System.out.println("3. Return a book");
      System.out.println("4. Add a book to the library");
      System.out.println("5. Remove a book to the library");
      System.out.println("6. Display a complete book list of the library");
      System.out.println("0. End program");

      if (!scanner.hasNextInt())
      {
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
        }
      }
    }
    // Find a book:

  }
}
*/