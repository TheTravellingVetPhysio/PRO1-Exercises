package session2_console_input;

import java.util.Scanner;

public class IncrementInteger
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Input integer:");
    int input = scanner.nextInt();

    int output = input + 1;
    System.out.println('\n' + "Here is your incrementet integer:" + '\n' + output);
  }
}
