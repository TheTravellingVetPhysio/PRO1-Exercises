package session11_objects_association.cluedo;

import java.util.Scanner;

public class Game
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to Cluedo!");
    String setting;

    while (true)
    {
      System.out.println("Are you playing with kids? (YES/NO)");
      setting = scanner.nextLine().trim().toUpperCase();

      if (setting.equals("YES"))
      {
        GameScenario<Toy> scenario = new KidsScenario();
        runGame(scenario, scanner);
        break;
      }
      else if (setting.equals("NO"))
      {
        GameScenario<Weapon> scenario = new AdultScenario();
        runGame(scenario, scanner);
        break;
      }
      else
      {
        System.out.println("Not a valid input, try again..");
      }
    }

  }

  public static <I extends Enum<I> & Item<I>> void runGame(
      GameScenario<I> scenario, Scanner scanner)
  {
    boolean gameOver = false;
    scenario.setupMystery();
    scenario.printIntro();
    PlayerManager manager = scenario.createPlayers(scanner);
    manager.printPlayers();

    while (!gameOver)
    {
      scenario.playerTurnIntro();
      int choice = scanner.nextInt();
      scanner.nextLine();

      boolean actionCompleted;

      switch (choice)
      {
        case 1:
          actionCompleted = scenario.moveToRoom(scanner);
          break;
        case 2:
          actionCompleted = scenario.evaluateSuspect(scanner);
          break;
        case 3:
          actionCompleted = scenario.evaluateItem(scanner);
          break;
        case 4:
          actionCompleted = HandleFinalGuess.handleGuess(scenario, scanner);
          gameOver = (scenario.getWinner() != null)
              || (manager.allPlayersEliminated());
          if (manager.allPlayersEliminated())
          {
            System.out.println(scenario.allEliminatedMessage());
          }
          break;
        default:
          System.out.println(
              "Whoops, you probably hit a wrong key, try again.");
          return;
      }

      if (!gameOver && actionCompleted)
      {
        if (!manager.nextTurn())
        {
          System.out.println(scenario.allEliminatedMessage());
          gameOver = true;
        }
      }
    }
  }
}

