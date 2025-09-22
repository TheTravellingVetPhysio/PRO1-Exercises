package session4_switch_enums;

import java.util.Scanner;

public class AnimalSounds
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an animal: ");
    String animal = scanner.nextLine().trim().toUpperCase();
    printAction(SoundsofAnimals.valueOf(animal));

  }

  public static void printAction(SoundsofAnimals sounds)
  {

    String line = "The sound of a " + sounds + " is: ";

    switch (sounds)
    {
      case DOG:
        System.out.println(line + "Woof!");
        break;
      case CAT:
        System.out.println(line + "Meow");
        break;
      case DUCK:
        System.out.println(line + "Quack!");
        break;
      case HORSE:
        System.out.println(line + "Prrr...");
        break;
      case SHEEP:
        System.out.println(line + "Mæææ");
        break;
      case null, default:
        System.out.println("We don't know the sound of that animal");
    }
  }
}
