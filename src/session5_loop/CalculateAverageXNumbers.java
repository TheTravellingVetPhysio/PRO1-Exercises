package session5_loop;

import java.util.Scanner;

public class CalculateAverageXNumbers
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    double sum = 0;
    int i = 0;

    while (true)
    {
      System.out.print("Enter a number (or / to get the average): ");
      String input = scanner.nextLine();

      if (input.equals("/"))
      {
        double average = (double) sum / i;
        System.out.println("The average is: " + average);
        break;
      }
      else if (input.matches("-?\\d+(\\.\\d+)?"))
      {
        double inputD = Double.parseDouble(input);
        sum = sum + inputD;
        i++;
      }
      else
      {
        System.out.println("Not a valid entry.");
      }
    }
  }
}
