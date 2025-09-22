package session7_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomAccessAnimals
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> animals = new ArrayList<>();
    Collections.addAll(animals, "Lion", "Buffalo", "Giraffe", "Zebra",
        "Elephant");
    int input;

    do
    {
      System.out.println(
          "Enter a number between 1 and 5 to find you soul animal (0 to stop the game): ");
      input = scanner.nextInt();

      if (input > 0 && input <= animals.size())
      {
        System.out.println("Your soul animal is: " + animals.get(input - 1)
            + " because you chose number " + (input) + ".");
      }
      else if (input != 0)
      {
        System.out.println(
            "Invalid input... Try again with a number inside the range.");
      }
    }
    while (input != 0);
    System.out.println("Stopping game ...");
  }
}
