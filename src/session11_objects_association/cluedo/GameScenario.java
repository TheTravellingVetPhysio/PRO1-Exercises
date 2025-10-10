package session11_objects_association.cluedo;

import java.util.Scanner;

public interface GameScenario<I extends Enum<I> & Item<I>>
{
  // Mystery Setup
  void setupMystery();
  void printIntro();

  // Player Management
  PlayerManager createPlayers(Scanner scanner);
  Player getCurrentPlayer();
  void setWinner(Player winner);
  Player getWinner();
  void eliminatePlayer();
  String allEliminatedMessage();

  // Turn Flow
  void playerTurnIntro();
  boolean moveToRoom(Scanner scanner);

  // Partial Guess Handling
  boolean evaluateSuspect(Scanner scanner);
  boolean evaluateItem(Scanner scanner);
  String twoCorrect(Guessable<?> guessedItem);
  String oneCorrect();
  String noneCorrect();

  // Final Guess Handling
  Room promptForRoom(Scanner scanner);
  Suspect promptForSuspect(Scanner scanner);
  I promptForItem(Scanner scanner);
  boolean evaluateFinalGuess(Room room, Suspect suspect, I item);
  void printFinalGuess(Room room, Suspect suspect, I item);
  void printMystery();
}
