package cluedo;

import java.util.Scanner;

public class HandleFinalGuess
{
  public static <I extends Enum<I> & Item<I>> boolean handleGuess(
      GameScenario<I> scenario, Scanner scanner)
  {
    Room guessedRoom = scenario.promptForRoom(scanner);
    if (guessedRoom == null)
    {
      return false;
    }

    Suspect guessedSuspect = scenario.promptForSuspect(scanner);
    if (guessedSuspect == null)
    {
      return false;
    }

    I guessedItem = scenario.promptForItem(scanner);
    if (guessedItem == null)
    {
      return false;
    }

    scenario.printFinalGuess(guessedRoom, guessedSuspect, guessedItem);

    boolean correct = scenario.evaluateFinalGuess(guessedRoom, guessedSuspect,
        guessedItem);
    if (correct)
    {
      scenario.setWinner(scenario.getCurrentPlayer());
      scenario.printMystery();
      return true;
    }
    else
    {
      scenario.eliminatePlayer();
      return true;
    }
  }
}
