package session5_loop;

import java.util.Scanner;

public class PasswordAttemptsWithLimit
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    String password;
    int attempt = 1;
    String correct = "secret123";

    while (attempt <= 3)
    {
      System.out.println("Enter password (attempt " + attempt + "/3): ");
      password = scanner.nextLine();

      if (password.equals(correct))
      {
        System.out.println("Access granted!");
        break;
      }
      else if (attempt == 3)
      {
        System.out.println("Sorry, you have reached you limit of 3 attempts...");
            break;
      }
      else
      {
        System.out.println("Whoops, try again!");
        attempt++;
      }
    }
  }
}