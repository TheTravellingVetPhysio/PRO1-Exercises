package cluedo;

import java.util.Scanner;

public abstract class AbstractScenario<I extends Enum<I> & Guessable<I> & Item<I>> implements
    GameScenario<I>
{
  protected Suspect suspect;
  protected Room room;
  protected I item;
  protected PlayerManager manager;
  protected Player winner;
  protected final Class<I> itemType;

  public AbstractScenario(Class<I> itemType)
  {
    this.itemType = itemType;
  }

  public boolean moveToRoom(Scanner scanner)
  {
    Player player = manager.getCurrentPlayer();
    Room room = player.getCurrentRoom();

    if (room != null)
    {
      System.out.println(
          "You are in the " + player.getCurrentRoom().getDisplayName());
    }
    else
    {
      System.out.println("You are not in a room yet ...");
    }

    Room chosenRoom = InputUtils.promptForEnum(
        Room.class, scanner,
        "Where do you want to move to?",
        "Available rooms: ");

    if (chosenRoom == null)
    {
      System.out.println("You chose to go back and select another action.");
      return false;
    }

    player.setCurrentRoom(chosenRoom);
    System.out.println("You have moved to the " + chosenRoom.getDisplayName());
    return true;
  }

  public <T extends Enum<T> & Guessable<T>> boolean evaluatePartialGuess(Class<T> type,
      T mysteryItem, Scanner scanner, String prompt, String header)
  {
    Player player = manager.getCurrentPlayer();
    Room roomCurrent = player.getCurrentRoom();

    if (roomCurrent == null)
    {
      System.out.println("You must be in a room to complete your research. Enter a room instead.");
      return false;
    }

    T guessedItem = InputUtils.promptForEnum(type, scanner, prompt, header);

    if (guessedItem == null)
    {
      System.out.println("You chose to go back and choose another action.");
      return false;
    }

    System.out.println("You are investigating: " + guessedItem.getDisplayName() + " in the " + roomCurrent.getDisplayName() + ".");

    PartialGuessEvaluator<T> evaluator = new PartialGuessEvaluator<>(this.room,
        mysteryItem, this);
    System.out.println(evaluator.evaluate(roomCurrent, guessedItem));
    return true;
  }

  @Override
  public Room promptForRoom(Scanner scanner)
  {
    return InputUtils.promptForEnum(
        Room.class, scanner, getRoomPromptText(), getRoomListHeader());
  }

  protected String getRoomPromptText()
  {
    return "In which room do you think the murder happened?";
  }

  protected String getRoomListHeader()
  {
    return "Available rooms: ";
  }

  @Override
  public Suspect promptForSuspect(Scanner scanner)
  {
    return InputUtils.promptForEnum(
        Suspect.class, scanner, getSuspectPromptText(), getSuspectListHeader());
  }

  protected String getSuspectPromptText()
  {
    return "Who do you think did the deed?";
  }

  protected String getSuspectListHeader()
  {
    return "The lineup: ";
  }

  @Override
  public I promptForItem(Scanner scanner)
  {
    return InputUtils.promptForEnum(itemType, scanner, getItemPromptText(), getItemListHeader());
  }

  protected String getItemPromptText()
  {
    return "What weapon was used as the murder weapon?";
  }

  protected String getItemListHeader()
  {
    return "Weapons stored in evidence: ";
  }

  public boolean evaluateFinalGuess(
      Room guessedRoom, Suspect guessedSuspect,
      I guessedItem)
  {
    return MysteryEvaluator.isCorrectGuess(room, suspect, item, guessedRoom,
        guessedSuspect, guessedItem);
  }

  public void printFinalGuess(Room guessedRoom, Suspect guessedSuspect, I guessedItem)
  {
    System.out.println("This is your final guess: It was " + guessedSuspect.getDisplayName() + " in the " + guessedRoom.getDisplayName() + " with the " + guessedItem.getDisplayName());
  }

  @Override public void setWinner(
      Player winner)
  {
    this.winner = winner;
  }

  @Override
  public Player getWinner()
  {
    return winner;
  }

  @Override public Player getCurrentPlayer()
  {
    return manager.getCurrentPlayer();
  }

  public void printMystery()
  {
    System.out.println(
        "YAY! Detective " + winner.getName() + " solved the mystery!");
    System.out.println("It was " + suspect.getDisplayName() + " in the "
        + room.getDisplayName().toLowerCase() + " with the " + item.getDisplayName().toLowerCase() + ".");
  }

}
