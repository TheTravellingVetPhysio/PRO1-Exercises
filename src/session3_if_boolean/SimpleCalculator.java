package session3_if_boolean;

import java.util.Scanner;

public class SimpleCalculator
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number:");
    double number1 = scanner.nextDouble();

    System.out.println("Enter another number:");
    double number2 = scanner.nextDouble();

    System.out.println("Enter operator:");
    char operator = scanner.next().charAt(0);

    double result = 0;

    if (operator == '+')
    {
      result = number1 + number2;
    }
    else if (operator == '-')
    {
      result = number1 - number2;
    }
    else if (operator == '*')
    {
      result = number1 * number2;
    }
    else if (operator == '/')
    {
      result = number1 / number2;
    }

    System.out.println("The result is: " + result);
  }
}
