package session11_objects_association.cluedo;

public enum Weapon implements Item<Weapon>
{
  CANDLESTICK, DAGGER, LEAD_PIPE, REVOLVER, ROPE, WRENCH;

  public static Weapon getRandomWeapon()
  {
    Weapon[] weapons = values();
    return weapons[(int) (Math.random() * weapons.length)];
  }

  @Override public String getDisplayName()
  {
    return EnumUtils.formatDisplayName(this);
  }

  public static Weapon fromName(String name)
  {
    return EnumUtils.fromName(Weapon.class, name);
  }

  @Override public boolean matches(Weapon mysteryItem)
  {
    return this == mysteryItem;
  }
}