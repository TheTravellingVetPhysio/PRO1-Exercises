package session11_objects_association.cluedo;

public class EnumUtils
{
  public static String formatDisplayName(Enum<?> value)
  {
    String raw = value.name().replace("_", " ").toLowerCase();
    String[] words = raw.split(" ");
    StringBuilder formatted = new StringBuilder();
    for (String word : words)
    {
      formatted.append(Character.toUpperCase(word.charAt(0)))
          .append(word.substring(1)).append(" ");
    }
    return formatted.toString().trim();
  }

  public static <T extends Enum<T>> T fromName(Class<T> enumType, String name)
  {
    try
    {
      return Enum.valueOf(enumType, name.trim().toUpperCase());
    }
    catch (IllegalArgumentException e)
    {
    }
    for (T value : enumType.getEnumConstants())
    {
      @SuppressWarnings("unchecked") Guessable<T> guessable = (Guessable<T>) value;
      if (guessable.getDisplayName().toLowerCase().contains(name.toLowerCase()))
      {
        return value;
      }
    }
    return null;
  }
}
