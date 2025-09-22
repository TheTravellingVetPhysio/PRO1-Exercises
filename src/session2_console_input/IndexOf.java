package session2_console_input;

import java.util.Random;
import java.util.Scanner;

public class IndexOf
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a small sentence of at least 3 words:");
    String sentence = scanner.nextLine();

    System.out.println("Write a letter:");
    String letter = scanner.nextLine();

    System.out.println("Write a number from 1-10: ");
    int number = scanner.nextInt();

    int index1 = sentence.indexOf(letter, number);
    System.out.println("The first occurence of \"" + letter + "\" after the index \"" + number + "\" is at index: " + index1);

    int character = sentence.indexOf(letter);
    String substring = sentence.substring(0, character);
    System.out.println("The substring up to \"" + letter + "\" is: " + substring);

  }
}
