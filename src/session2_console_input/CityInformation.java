package session2_console_input;

import java.util.Scanner;

public class CityInformation
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Your favourite city: ");
    String city = scanner.nextLine().trim();

    System.out.println(
        "Characters in city name: " + city.length() +
        "\nName uppercase: " + city.toUpperCase() +
        "\nName lowercase: " + city.toLowerCase() +
        "\nFirst character: " + city.charAt(0));
  }
}
