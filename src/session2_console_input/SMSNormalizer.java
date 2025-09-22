package session2_console_input;

import java.util.Scanner;

public class SMSNormalizer
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a sentence: ");
    String sentence = scanner.nextLine();

    String trimSentence = sentence.trim();
    String trimSentenceCollapsed = sentence.trim().replaceAll(" +", " ");

    System.out.println("Trimmed: " + trimSentence);
    System.out.println("Collapsed: " + trimSentenceCollapsed);
    System.out.println(trimSentenceCollapsed.toLowerCase());
    System.out.println(trimSentenceCollapsed.length());

  }
}
