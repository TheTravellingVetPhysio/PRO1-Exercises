package session2_console_input;

import java.util.Scanner;

public class IntegerSum
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter first integer:");
    int input1 = scanner.nextInt();

    System.out.println("Enter second integer:");
    int input2 = scanner.nextInt();

    int sum = input1 + input2;

    System.out.println("Here is your sum: " + '\n' + sum);
  }
}
