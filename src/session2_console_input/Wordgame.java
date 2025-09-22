package session2_console_input;

import java.util.Scanner;

public class Wordgame
{

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the following about you:" + '\n' + "Name:");
    String name = scanner.nextLine();

    System.out.println("Age:");
    String age = scanner.nextLine();

    System.out.println("Home city:");
    String city = scanner.nextLine();

    System.out.println("College:");
    String college = scanner.nextLine();

    System.out.println("Profession:");
    String profession = scanner.nextLine();

    System.out.println("Favorite animal:");
    String animal = scanner.nextLine();

    System.out.println("Pets name:");
    String pet = scanner.nextLine();

    System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ", " + name + " went to college at "  + college + ". After graduation, " + name + " started working as a " + profession + ". One day, " + name + " adopted a " + animal + " named " + pet + ". They lived happily ever after.");
  }
}
