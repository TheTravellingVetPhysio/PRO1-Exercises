package session2_console_input;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsMasker
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a word: ");
    String word = scanner.nextLine().toLowerCase();

    String replaced = word.replaceAll("[aeiouy]", "*");
    String consonants = word.replaceAll("[aeiouy]", "");

    int vowels = (replaced.length() - consonants.length());

    System.out.println("Word chosen: " + word +
        "\nMasked: " + replaced +
        "\nVowels replaced: " + vowels +
        "\nConsonants in the word: " + consonants +
        "\nNumber of consonants: " + consonants.length());
  }
}
