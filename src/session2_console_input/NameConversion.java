package session2_console_input;

import java.util.Scanner;

public class NameConversion
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write your first name: ");
    String firstname = scanner.nextLine();

    System.out.println("Write your last name: ");
    String lastname = scanner.nextLine();

    System.out.println("Full name: " + firstname.substring(0, 1).toUpperCase() + firstname.substring(1).toLowerCase() + " " + lastname.trim().substring(0, 1).toUpperCase() + lastname.substring(1).toLowerCase());

    System.out.println("Write your pets name: ");
    String petsname = scanner.nextLine().trim().toUpperCase();

    System.out.println(petsname);
  }
}
