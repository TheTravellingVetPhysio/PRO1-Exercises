package session2_console_input;

import java.util.Scanner;

public class Palidrome
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter phrase: ");
    String normalized = scanner.nextLine().trim().toLowerCase().replaceAll(" ","").replaceAll("\\W", "");

    String reversed = new StringBuffer(normalized).reverse().toString();

    System.out.println("Normalized: " + normalized + "\nReversed: " + reversed);
    System.out.println("Is it a palidrome? " + normalized.equals(reversed));

  }
}
