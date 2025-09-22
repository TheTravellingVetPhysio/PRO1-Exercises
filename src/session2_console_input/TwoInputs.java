package session2_console_input;

import java.util.Scanner;

public class TwoInputs
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("First text:");
    String first = scanner.nextLine();

    System.out.println("Second text:");
    String second = scanner.nextLine();

    // String concentrated = first + " " + second; WHY THIS PART?

    System.out.println(first + " " + second);
  }
}
