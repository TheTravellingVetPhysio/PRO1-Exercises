package session2_console_input;

import java.util.Scanner;

public class ReplaceSpaces
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a sentence:");
    String sentence = scanner.nextLine();

    String space = " ";
    String minus = "";

    System.out.println("Here is your weird word: " + sentence.replace(space, minus));
  }
}
