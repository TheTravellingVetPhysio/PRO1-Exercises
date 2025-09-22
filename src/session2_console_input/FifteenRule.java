package session2_console_input;

import java.util.concurrent.ThreadLocalRandom;

public class FifteenRule
{
  public static void main(String[] args)
  {

    int firstNumber = ThreadLocalRandom.current().nextInt(-0,20);
    int secondNumber = ThreadLocalRandom.current().nextInt(-5, 15);
    int sum = firstNumber + secondNumber;

    boolean equals = (firstNumber == 15 || secondNumber == 15);
    boolean difference = (firstNumber - secondNumber == 15) || (secondNumber-firstNumber == 15);
    boolean result = equals || difference || sum == 15;

    System.out.println("First integer: " + firstNumber +
        "\nSecond integer: " + secondNumber +
        "\nResult: " + result);

  }
}
