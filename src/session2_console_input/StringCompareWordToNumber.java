package session2_console_input;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringCompareWordToNumber
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a word: ");
    String word = scanner.nextLine();

    System.out.println("Write a number: ");
    String number = scanner.nextLine();
    int numberInt = Integer.parseInt(number);

    boolean longerWord = word.length() > numberInt;
    System.out.println("Does the word consist of a higher number of letters than the number? " + longerWord);
  }
}
