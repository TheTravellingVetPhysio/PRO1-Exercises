package session11_objects_association.cluedo;

public class PartialGuessEvaluator<T extends Enum<T> & Guessable<T>>
{
  private final Room mysteryRoom;
  private final T mysteryItem;
  private final GameScenario<?> scenario;

  public PartialGuessEvaluator(Room mysteryRoom, T mysteryItem, GameScenario<?> scenario)
  {
  this.mysteryRoom = mysteryRoom;
  this.mysteryItem = mysteryItem;
  this.scenario = scenario;
  }

  public String evaluate(Room guessedRoom, T guessedItem)
  {
    boolean roomMatch = guessedRoom.equals(mysteryRoom);
    boolean itemMatch = guessedItem.matches(mysteryItem);

    if (roomMatch && itemMatch)
    {
      return scenario.twoCorrect(guessedItem);
    }
    else if (roomMatch || itemMatch)
    {
      return scenario.oneCorrect();
    }
    else
    {
      return scenario.noneCorrect();
    }
  }
}
