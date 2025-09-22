package session4_switch_enums;

import java.util.Scanner;

public class Season
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write a month by number: ");
    int month = scanner.nextInt();

    switch (month)
    {
      case 1:
      case 12:
      case 2:
      {
        System.out.println("It is winter");
      }
      break;
      case 3:
      case 4:
      case 5:
      {
        System.out.println("It is spring");
      }
      break;
      case 6:
      case 7:
      case 8:
      {
        System.out.println("It is summer");
      }
      break;
      case 9:
      case 10:
      case 11:
      {
        System.out.println("It is autumn");
      }
      break;
    }
  }
}
