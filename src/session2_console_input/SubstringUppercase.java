package session2_console_input;

import java.util.Scanner;

public class SubstringUppercase
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a sentence:");
    String sentence = scanner.nextLine();

    System.out.println("Write a number between 2 and 6: ");
    int index1 = scanner.nextInt();

    System.out.println("Write a number between 7 and 12: ");
    int index2 = scanner.nextInt();

    String output = sentence.substring(index1, index2).trim().toUpperCase().replace(" ","");

    System.out.println("Substring cleaned of space to uppercase: " + output);
  }
}
