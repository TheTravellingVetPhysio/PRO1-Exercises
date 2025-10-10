package cluedo;

public class MysteryEvaluator
{
  public static <R extends Guessable<R>, S extends Guessable<S>, I extends Enum<I> & Item<I>>
  boolean isCorrectGuess(R mysteryRoom, S mysterySuspect,
      I mysteryItem, R guessedRoom, S guessedSuspect,
      I guessedItem)
  {
    return mysteryRoom.equals(guessedRoom) && mysterySuspect.equals(
        guessedSuspect) && mysteryItem.equals(guessedItem);
  }
}
