package session11_objects_association.cluedo;

public interface Guessable<T>
{
  String getDisplayName();
  boolean matches(T mysteryItem);
}
