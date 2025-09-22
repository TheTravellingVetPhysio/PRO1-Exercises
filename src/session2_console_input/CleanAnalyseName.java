package session2_console_input;

import java.util.Scanner;

public class CleanAnalyseName
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write your full name: ");
    String fullname = scanner.nextLine();

    String finalname = fullname.trim().toUpperCase();

    System.out.println("Cleaned name: " + finalname + "\n Lentgh of name inkl. spaces: " + finalname.length());
  }
}
