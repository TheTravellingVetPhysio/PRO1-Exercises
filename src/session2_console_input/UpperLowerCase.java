package session2_console_input;

import java.util.Scanner;

public class UpperLowerCase
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a word:");
    String word = scanner.nextLine();

    String upper = word.toUpperCase();
    String lower = word.toLowerCase();

    System.out.println("Lowercase: " + lower + "\n" + "Uppercase: " + upper);
  }
}
