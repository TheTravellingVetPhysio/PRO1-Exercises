package cluedo;

public enum Toy implements Item<Toy>
{
  TEDDY_BEAR, RACECAR, POTATO_HEAD, DINOSAUR, FOOTBALL, XYLOPHONE;

  public static Toy getRandomToy()
  {
    Toy[] toys = values();
    return toys[(int) (Math.random() * toys.length)];
  }

  @Override
  public String getDisplayName()
  {
    return EnumUtils.formatDisplayName(this);
  }

  public static Toy fromName(String name)
  {
    return EnumUtils.fromName(Toy.class, name);
  }

  @Override
  public boolean matches(Toy mysteryItem)
  {
    return this == mysteryItem;
  }

/*  @Override
  public boolean matches(Item mysteryItem)
  {
    return mysteryItem instanceof Toy && this.equals(mysteryItem);
  }*/
}