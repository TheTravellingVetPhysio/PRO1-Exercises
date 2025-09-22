package session2_console_input;

import java.util.Scanner;

public class Trim
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a word with empty spaces before and after: ");
    String word = scanner.nextLine();
    String trimword = word.trim();

    System.out.println("Write the same word again: ");
    String word2 = scanner.nextLine();
    String trimword2 = word2.trim();

    System.out.println("Here is your original input: " + word);
    System.out.println("Here is a cleaner input: " + trimword);

    System.out.println("Are the two words equal? " + trimword.equalsIgnoreCase(trimword2));

  }
}
