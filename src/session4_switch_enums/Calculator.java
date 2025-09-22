package session4_switch_enums;

import java.util.Scanner;

public class Calculator
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a number:");
    int a = scanner.nextInt();

    System.out.println("Write a second number:");
    int b = scanner.nextInt();

    System.out.println("Enter an operator for calculation: ");
    int op = scanner.next().charAt(0);

    int result = 0;

    switch (op)
    {
      case '*' -> result = a * b;
      case '/' -> result = a / b;
      case '+' -> result = a + b;
      case '-' -> result = a - b;
      default -> System.out.println("Not a valid operator.");
    };

    System.out.println(a + op + b + " = " + result);
  }
}