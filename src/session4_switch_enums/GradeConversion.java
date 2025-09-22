package session4_switch_enums;

import java.util.Scanner;

public class GradeConversion
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a Danish grade: ");
    int grade = scanner.nextInt();

    String line = "The equivalent international grade is: ";

    switch (grade)
    {
      case 12:
        System.out.println(line + "A");
        break;
      case 10:
        System.out.println(line + "B");
        break;
      default:
        System.out.println("Error: Invalid Danish grade");
    }

    switch (grade)
    {
      case 12 -> System.out.println(line + "A");
      case 10 -> System.out.println(line + "B");
      case 7 -> System.out.println(line + "C");
      case 4 -> System.out.println(line + "D");
      case 2 -> System.out.println(line + "E");
      case 0 -> System.out.println(line + "Fx");
      case -3 -> System.out.println(line + "F");
      default -> System.out.println(line + "Invalid");
    }

  }
}
