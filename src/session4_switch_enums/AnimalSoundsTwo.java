package session4_switch_enums;

import java.util.Scanner;

import static session4_switch_enums.AnimalSounds.printAction;

public class AnimalSoundsTwo
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an animal:");
    String animal = scanner.nextLine().trim().toUpperCase();
    printAction(SoundsofAnimals.valueOf(animal));
  }

  public static void printAction(SoundsofAnimals animal)
  {

    String sound = switch (animal)
    {
      case DOG -> "Woof!";
      case CAT -> "Meow";
      case HORSE -> "Prrrr...";
         case SHEEP -> "MæææÆæ";
          case DUCK -> "Quack!";
          default -> "We don't know that animal or the sound of that animal";

    };

    System.out.println("The sound of a " + animal + " is: " + sound);


  }
}
