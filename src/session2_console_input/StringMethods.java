package session2_console_input;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringMethods
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write your name: ");
    String name = scanner.nextLine();

    boolean tooLong = (name.length() > 5);

    System.out.println("\"" + name + "\"" + " has " + name.length() + " characters.");
    System.out.println("Is the word more than 5 characters? " + tooLong);
  }
}
