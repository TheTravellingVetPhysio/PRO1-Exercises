package session3_if_boolean;

import java.util.Scanner;

public class ComparingFloats
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number with several decimals: ");
    String a = scanner.nextLine();

    System.out.println("Enter another number with decimals: ");
    String b = scanner.nextLine();

    String aThree = a.substring(0, 4);
    String bThree = b.substring(0, 4);

    System.out.println(aThree + "\n" + bThree);

    String result = aThree.equals(bThree) ? "The three first numbers are equal" : "The three first numbers are not equal";
  }
}
