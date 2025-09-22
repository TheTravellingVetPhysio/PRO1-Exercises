package session2_console_input;

import java.util.Scanner;

public class StringEquality
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a text: ");
    String firstText = scanner.nextLine();

    System.out.println("Write a similar text: ");
    String secondText = scanner.nextLine();

    System.out.println("Are the two equals (exact)? " + firstText.equals(secondText) +
        "\nAre the two equals (ignore case)? " + firstText.equalsIgnoreCase(secondText));
  }
}
