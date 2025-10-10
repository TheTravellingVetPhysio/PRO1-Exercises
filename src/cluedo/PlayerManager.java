package cluedo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerManager
{
  private List<Player> players = new ArrayList<>();
  private int currentTurn = 0;

  public void addPlayer(Player player)
  {
    players.add(player);
  }

  public List<Player> getPlayers() // Get all players
  {
    return players;
  }

  public List<Player> getActivePlayers() // Get all active players
  {
    return players.stream().filter(player -> !player.isEliminated())
        .collect(Collectors.toList());
  }

  public Player getCurrentPlayer() // Get the player whose turn it is
  {
    return players.get(currentTurn);
  }

  public boolean nextTurn() // Move to next persons turn
  {
    if (allPlayersEliminated())
    {
      return false;
    }

    int totalPlayers = players.size();
    int attempts = 0;

    do
    {
      currentTurn = (currentTurn + 1) % totalPlayers;
      attempts++;
    }
    while (players.get(currentTurn).isEliminated() && attempts < totalPlayers);
    return true;
  }

  public void printPlayers() // Print all players
  {
    for (Player p : players)
    {
      System.out.println("Player " + p.getPlayerNumber() + ": " + p.getName());
    }
  }

  public void eliminateCurrentPlayer()
  {
    Player player = getCurrentPlayer();
    player.setEliminated(true);
  }

  public boolean allPlayersEliminated()
  {
    return players.stream().allMatch(Player::isEliminated);
  }
}
