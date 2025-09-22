package session5_loop;

import java.util.Scanner;

public class PasswordValidation
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    String line = "Enter the password: ";
    String password;

    do
    {
      System.out.println(line);
      password = scanner.nextLine();

      if (!password.equals("java123")) {
        System.out.println("Whoops, try again!");
      }
    }
    while (!password.equals("java123"));
    System.out.println("Access granted! Welcome!");
  }
}

