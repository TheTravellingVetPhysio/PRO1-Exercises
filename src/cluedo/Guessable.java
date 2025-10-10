package cluedo;

public interface Guessable<T>
{
  String getDisplayName();
  boolean matches(T mysteryItem);
}
