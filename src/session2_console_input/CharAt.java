package session2_console_input;

import java.util.Scanner;

public class CharAt
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a long word: ");
    String word = scanner.nextLine();

    System.out.println("Write a single number:");
    int index = scanner.nextInt();

    char letter = word.charAt(index);
    int last = word.length()-1;

    System.out.println("The character at place number \"" + index + "\" is " + letter);
    System.out.println("The first character is \"" + word.charAt(0) + "\" \nThe last character is \"" + word.charAt(last) );
  }
}
