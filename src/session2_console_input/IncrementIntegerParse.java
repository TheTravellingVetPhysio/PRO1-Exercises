package session2_console_input;

import java.util.Scanner;

public class IncrementIntegerParse
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Input integer:");
    String input = scanner.nextLine();

    int number = Integer.parseInt(input);
    int increment = number + 1;

    System.out.println("Here is your incremented integer:" + '\n' + increment);

  }
}
