package session2_console_input;

import java.util.Scanner;

public class CharacterPosition
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a word: ");
    String word = scanner.nextLine();

    System.out.println("Write a number:");
    int number = scanner.nextInt();

    String finalword = word.trim().toLowerCase();
    char chosenletter = finalword.charAt(number);

    System.out.println("Your word in lowercase: " + finalword + "\nCharacter at index \"" + number + "\": " + chosenletter);
  }
}
