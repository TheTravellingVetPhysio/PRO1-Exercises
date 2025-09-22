package session2_console_input;

import java.util.Scanner;

public class Replace
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a word: ");
    String word = scanner.nextLine();
    String wordlower = word.toLowerCase();

    System.out.println("Choose a letter from your word: ");
    String originalletter = scanner.nextLine();

    System.out.println("Write a random letter: ");
    String newletter = scanner.nextLine();

    System.out.println("I have changed your word to: " + wordlower.replace(originalletter, newletter).substring(0,1).toUpperCase() + wordlower.substring(1));
  }
}
