package session2_console_input;

import java.util.Scanner;

public class DoubleInteger
{
  public static void main(String[] args)
  {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a number: ");
    Double num1 = scanner.nextDouble();

    int num2 = num1.intValue();
    boolean result = ( num1 == num2);

    System.out.println("Double value: " + num1 +
        "\nInteger value: " + num2 +
        "\nIs double = integer? " + result);
  }
}
