package cluedo;

import java.util.Scanner;

public class KidsScenario extends AbstractScenario<Toy>
    implements GameScenario<Toy>
{
  //  private Suspect suspect;
  //  private Room room;
  //  private Item item;
  //  private PlayerManager manager;
  //  private Player winner;

  public KidsScenario()
  {
    super(Toy.class);
  }

  public void setupMystery()
  {
    suspect = Suspect.getRandomSuspect();
    room = Room.getRandomRoom();
    item = Toy.getRandomToy();
  }

  public void printIntro()
  {
    System.out.println("You found a note. It says:");
    System.out.println("\"Sorry, I broke the toy! I didn't mean to...\"");
    System.out.println("What toy? Where is it? Who broke it?");
    System.out.println("It's your job to find out!");
  }

  public PlayerManager createPlayers(Scanner scanner)
  {
    manager = new PlayerManager();
    System.out.println("How many detectives are playing?");
    int input = scanner.nextInt();
    scanner.nextLine();

    // TODO Make it crash safe if anything other than positive integer is entered.

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
        "3. Use your detective skills to research a toy and the room");
    System.out.println(
        "4. Solve the mystery (but BEWARE! a wrong guess and you are out)");
  }

  public boolean evaluateItem(Scanner scanner)
  {
    return evaluatePartialGuess(itemType, item, scanner,
        "Which toy do you think got broken?\n(Enter 0 to go back)",
        "Toys to choose from: ");
  }

  public boolean evaluateSuspect(Scanner scanner)
  {
    return evaluatePartialGuess(Suspect.class, suspect, scanner,
        "Who do you think caused the mischief?", "The lineup: ");
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
      message.append("the broken toy was ").append(guessedItem.getDisplayName().toLowerCase())
          .append(".");
    }
    return message.toString();
  }

  public String oneCorrect()
  {
    return "Nice try detective! One clue matches the truth, but the mystery isn't cracked just yet...";
  }

  public String noneCorrect()
  {
    return "Oops! None of those were correct, but on the bright side you now know which ones to cross off your list.";
  }

  @Override public String getRoomPromptText()
  {
    return "Where do you think the crime happened?";
  }

  @Override public String getSuspectPromptText()
  {
    return "Who do you think caused this mess?";
  }

  protected String getSuspectListHeader()
  {
    return "Suspects spotted nearby: ";
  }

  @Override public String getItemPromptText()
  {
    return "Which toy met an untimely end?";
  }

  @Override protected String getItemListHeader()
  {
    return "Toys in the house: ";
  }

  public void printMystery()
  {
    System.out.println(
        "YAY! Detective " + winner.getName() + " solved the mystery!");
    System.out.println("It was " + suspect.getDisplayName() + " in the "
        + room.getDisplayName() + " who broke " + item.getDisplayName() + ".");
  }

  @Override public void eliminatePlayer()
  {
    manager.eliminateCurrentPlayer();
    System.out.println(
        "Oh no! That guess sent you on a wild goose chase. Time to let other detectives take the lead.");
  }

  public String allEliminatedMessage()
  {
    return "All detectives have been eliminated... The mystery remains unsolved...";
  }
}
