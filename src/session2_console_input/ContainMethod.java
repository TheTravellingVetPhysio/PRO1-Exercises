package session2_console_input;

import java.util.Scanner;

public class ContainMethod
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    String text = "Hello, world!";
    boolean containsHello = text.contains("Hello");
    boolean containsJava = text.contains("Java");
    System.out.println("Contains 'Hello': " + containsHello); // true
    System.out.println("Contains 'Java': " + containsJava);   // false

    System.out.println("\n" + "Write a sentence: ");
    String sentence = scanner.nextLine();
    String sentenceLower = sentence.toLowerCase();

    System.out.println("Write a word:");
    String word = scanner.nextLine();
    String wordLower = word.toLowerCase();

    boolean wordInSentence = sentenceLower.contains(wordLower);
    System.out.println("The sentence contains the word \"" + wordLower + "\": " + wordInSentence);

  }
}
