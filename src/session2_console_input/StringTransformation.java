package session2_console_input;

import java.util.Scanner;

public class StringTransformation
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a sentence: ");
    String sentence = scanner.nextLine().trim();

    System.out.println("Your sentence: \n" + sentence +
        "\nLength: " + sentence.length() +
        "\nIn uppercase: " + sentence.toUpperCase() +
        "\nIn lowercase: " + sentence.toLowerCase() +
        "\n \nEnter a word of the sentence: ");
    String word = scanner.nextLine().trim();

    System.out.println("Index of \"" + word + "\": " + sentence.indexOf(word) +
        "\nWith spaces replaced: " + sentence.replace(" ", "_") +
        "\nFirst character: " + sentence.charAt(0) +
        "\nLast character: " + sentence.charAt(sentence.length() - 1) +
        "\nSubstring: " + sentence.substring(1, 6));

  }
}
