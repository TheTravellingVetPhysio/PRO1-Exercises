package cluedo;

public enum Suspect implements Guessable<Suspect>
{
  SCARLETT("Miss Scarlett", "Red"), MUSTARD("Colonel Mustard",
    "Yellow"), ORCHID("Doctor Orchid", "Pink"), GREEN("Reverend Green",
    "Green"), PEACOCK("Mrs. Peacock", "Blue"), PLUM("Professor Plum", "Purple");

  private final String name;
  private final String color;

  Suspect(String name, String color)
  {
    this.name = name;
    this.color = color;
  }

  public String getName()
  {
    return name;
  }

  public String getColor()
  {
    return color;
  }

  public static Suspect getRandomSuspect()
  {
    Suspect[] suspects = values();
    return suspects[(int) (Math.random() * suspects.length)];
  }

  @Override
  public String getDisplayName()
  {
    return name + " (" + color + ")";
  }

  public static Suspect fromName(String input)
  {
    String cleaned = input.trim().toLowerCase();
    for (Suspect suspect : values())
    {
      if (suspect.getName().toLowerCase().contains(cleaned) ||
          suspect.getColor().toLowerCase().contains(cleaned))
      {
        return suspect;
      }
    }
    return null;
  }

  @Override public boolean matches(Suspect mysteryItem)
  {
    return this.equals(mysteryItem);
  }
}