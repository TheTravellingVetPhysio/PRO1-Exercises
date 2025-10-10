package cluedo;

public interface Item<T extends Enum<T> & Item<T>> extends Guessable<T>
{
}
