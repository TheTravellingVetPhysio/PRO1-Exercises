package session3_if_boolean;

import java.util.Scanner;

public class ThreeNumbers
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter three numbers: ");
    String number = scanner.nextLine().trim().replaceAll(" ","").replaceAll("\\D", "");
    String number1 = number.substring(0,1);
    int numberOne = Integer.parseInt(number1);
    String number2 = number.substring(1,2);
    int numberTwo = Integer.parseInt(number2);
    String number3 = number.substring(2,3);
    int numberThree = Integer.parseInt(number3);

    if (numberOne > numberTwo && numberTwo > numberThree)
    {
      System.out.println("Ascending: " + numberThree + numberTwo + numberOne);
    }
    if (numberOne > numberThree && numberThree > numberTwo)
    {
      System.out.println("Ascending: " + numberTwo + numberThree + numberOne);
    }
    if (numberTwo > numberOne && numberOne > numberThree)
    {
      System.out.println("Ascending: " + numberThree + numberOne + numberTwo);
    }
    if (numberTwo > numberThree && numberThree > numberOne)
    {
      System.out.println("Ascending: " + numberOne + numberThree + numberTwo);
    }
    if (numberThree > numberOne && numberOne > numberTwo)
    {
      System.out.println("Ascending: " + numberTwo + numberOne + numberThree);
    }
    if (numberThree > numberTwo && numberTwo > numberOne)
    {
      System.out.println("Ascending: " + numberOne + numberTwo + numberThree);
    }
  }
}
