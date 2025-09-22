package session2_console_input;

import java.util.Scanner;

public class ImportExample
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input text:");
    String input = scanner.nextLine();
    int length = input.length();
    System.out.println("Here is your text back: " + '\n' + input);
  }
}
