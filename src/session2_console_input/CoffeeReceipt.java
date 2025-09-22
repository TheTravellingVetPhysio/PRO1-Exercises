package session2_console_input;

import java.util.Scanner;

public class CoffeeReceipt
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Drink name: ");
    String drink = scanner.nextLine().trim().toLowerCase();

    System.out.println("Enter size: ");
    String size = scanner.nextLine().trim().toLowerCase();

    System.out.println("Price: ");
    double price = scanner.nextDouble();

    System.out.println("Quantity: ");
    int integer = scanner.nextInt();

    System.out.println("You ordered " + integer + " " + size + " " + drink + " for a total of " + price);
  }
}
