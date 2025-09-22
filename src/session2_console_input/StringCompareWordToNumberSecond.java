package session2_console_input;

import java.util.Scanner;

public class StringCompareWordToNumberSecond {

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a word:" );
    String word = scanner.nextLine();

    System.out.println("Write a number:");
    int number = scanner.nextInt();

    boolean longerWord = word.length() > number;
    System.out.println("Does the word consist of a higher number of letters than the number? " + longerWord);

  }
}
