package session11_objects_association.cluedo;

public enum Room implements Guessable<Room>
{
  KITCHEN,
  BALLROOM,
  CONSERVATORY,
  DINING_ROOM,
  BILLIARD_ROOM,
  LIBRARY,
  LOUNGE,
  HALL,
  STUDY;

  public static Room getRandomRoom()
  {
    Room[] rooms = values();
    return rooms[(int) (Math.random()*rooms.length)];
  }

  @Override
  public String getDisplayName()
  {
    return EnumUtils.formatDisplayName(this);
  }

  public static Room fromName(String name)
  {
    return EnumUtils.fromName(Room.class, name);
  }

  @Override public boolean matches(Room mysteryItem)
  {
    return this.equals(mysteryItem);
  }
}
