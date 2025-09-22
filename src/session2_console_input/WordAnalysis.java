package session2_console_input;

import java.util.Scanner;

public class WordAnalysis
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a word: ");
    String word = scanner.nextLine().trim();

    System.out.println("It looks like this in uppercase: " + word.toUpperCase()
        + "\nThe length of the word is: " + word.length()
        + "\nThe first character is: " + word.charAt(0) + "\nLast character: "
        + word.charAt(word.length() - 1) + "\nWith vowels replaced: "
        + word.toLowerCase()
        .replace("a", "*")
        .replace("e", "*")
        .replace("i", "*")
        .replace("o", "*")
        .replace("u", "*")
        .replace("y", "*"));
  }
}
