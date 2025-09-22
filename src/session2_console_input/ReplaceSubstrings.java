package session2_console_input;

import java.util.Scanner;

public class ReplaceSubstrings
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a sentence: ");
    String sentence = scanner.nextLine();

    System.out.println("Write a word from your sentence: ");
    String orgword = scanner.nextLine();

    System.out.println("Choose a new word: ");
    String newword = scanner.nextLine();

    System.out.println("Your new sentence: " + sentence.replace(orgword, newword));
  }
}
