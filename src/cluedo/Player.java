package cluedo;

public class Player
{
  private String name;
  private int playerNumber;
  private Room currentRoom;
  private boolean eliminated = false;

  public Player(String name, int playerNumber)
  {
    this.name = name;
    this.playerNumber = playerNumber;
  }

  public String getName()
  {
    return name;
  }

  public int getPlayerNumber()
  {
    return playerNumber;
  }

  public void setCurrentRoom(Room room)
  {
    this.currentRoom = room;
  }

  public Room getCurrentRoom()
  {
    return currentRoom;
  }

  public boolean isEliminated()
  {
    return eliminated;
  }

  public void setEliminated(boolean eliminated)
  {
    this.eliminated = eliminated;
  }

  public void eliminate()
  {
    this.eliminated = true;
  }
}