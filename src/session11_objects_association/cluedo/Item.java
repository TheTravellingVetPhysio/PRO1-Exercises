package session11_objects_association.cluedo;

public interface Item<T extends Enum<T> & Item<T>> extends Guessable<T>
{
}
