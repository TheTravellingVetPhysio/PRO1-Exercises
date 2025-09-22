package session2_console_input;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Substring
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a word:");
    String word = scanner.nextLine();
    int zero = 0;

    System.out.println("Enter a number:");
    int int1 = scanner.nextInt();

    System.out.println("Enter another number:");
    int int2 = scanner.nextInt();

    String sub1 = word.substring(zero, int1);
    String sub2 = word.substring(int1, int2);
    String sub3 = word.substring(int2);

    // String sub1mod = sub1.toLowerCase();
    // String sub2mod = sub2.toUpperCase();
    String sub3mod = sub3.toLowerCase();

    System.out.println("The substring is:" + sub1.toLowerCase() + sub2.toUpperCase() + sub3mod);

  }
}
