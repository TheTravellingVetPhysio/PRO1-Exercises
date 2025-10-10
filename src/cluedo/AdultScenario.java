package cluedo;

import java.util.Scanner;

public class AdultScenario extends AbstractScenario<Weapon>
    implements GameScenario<Weapon>
{
  public AdultScenario()
  {
    super(Weapon.class);
  }

  public void setupMystery()
  {
    this.suspect = Suspect.getRandomSuspect();
    this.room = Room.getRandomRoom();
    this.item = Weapon.getRandomWeapon();
  }

  public void printIntro()
  {
    System.out.println("A murder has been committed!");
    System.out.println("Who? Where? How?");
    System.out.println("It's your job to find out!");
  }

  public PlayerManager createPlayers(Scanner scanner)
  {
    manager = new PlayerManager();
    System.out.println("How many detectives are playing?");
    int input = scanner.nextInt();
    scanner.nextLine();

    for (int i = 1; i <= input; i++)
    {
      System.out.println("Enter name for detective number " + i + ": ");
      String name = scanner.nextLine();
      manager.addPlayer(new Player(name, i));
    }
    return manager;
  }

  public void playerTurnIntro()
  {
    System.out.println("It is Detective " + manager.getCurrentPlayer().getName()
        + "'s turn.\nWhat do you wish to do (enter number)?");
    System.out.println("1. Move to a (new) room");
    System.out.println(
        "2. Use your detective skills to research a suspect and the room");
    System.out.println(
        "3. Use your detective skills to research a weapon and the room");
    System.out.println(
        "4. Solve the mystery (but BEWARE! a wrong guess and you are out)");
  }

  public boolean evaluateItem(Scanner scanner)
  {
    return evaluatePartialGuess(itemType, item, scanner,
        "What do you think the murder weapon was?\n(Enter 0 to go back)",
        "Weapons found in evidence: ");
  }

  public boolean evaluateSuspect(Scanner scanner)
  {
    return evaluatePartialGuess(Suspect.class, suspect, scanner,
        "Who do you think did the deed?", "The lineup: ");
  }

  @Override public String twoCorrect(Guessable<?> guessedItem)
  {
    StringBuilder message = new StringBuilder(
        "Your detective skills are pristine!");
    if (room != null)
    {
      message.append(" The crime happened in the ")
          .append(room.getDisplayName().toLowerCase()).append(" and ");
    }
    if (guessedItem instanceof Suspect)
    {
      message.append("the culprit was ").append(guessedItem.getDisplayName())
          .append(".");
    }
    if (guessedItem instanceof Item)
    {
      message.append("the murder weapon used was ")
          .append(guessedItem.getDisplayName().toLowerCase()).append(".");
    }
    return message.toString();
  }

  public String oneCorrect()
  {
    return "You're onto something - one detail lines up with the truth, but further investigation seems necessary...";
  }

  public String noneCorrect()
  {
    return "Whoopss.. Seems your hunch was completely off. Better luck next time!";
  }

  @Override
  public void eliminatePlayer()
  {
    manager.eliminateCurrentPlayer();
    System.out.println(
        "Ouch! I guess your detective skills could use some more ... refinement... You're out!");
  }

  public String allEliminatedMessage()
  {
    return "All detectives have been eliminated... The mystery remains unsolved and the murderer/murderess goes free...";
  }
}
