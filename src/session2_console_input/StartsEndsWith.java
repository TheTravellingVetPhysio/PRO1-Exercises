package session2_console_input;

import java.util.Scanner;

public class StartsEndsWith
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a sentence:");
    String sentence = scanner.nextLine();
    String sentenceLower = sentence.toLowerCase();

    System.out.println("Enter a word:");
    String prefix = scanner.nextLine();
    String prefixLower = prefix.toLowerCase();

    System.out.println("Write the last word:");
    String suffix = scanner.nextLine();
    String suffixLower = suffix.toLowerCase();

    boolean starts = sentenceLower.startsWith(prefixLower);
    boolean ends = sentenceLower.endsWith(suffixLower);


    System.out.println("The sentence starts with: \"" + prefixLower + "\":" + starts);
    System.out.println("The sentence ends with: \"" + suffixLower + "\":" + ends);

  }
}
