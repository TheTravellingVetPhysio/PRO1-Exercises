package session11_objects_association.cluedo;

import java.util.Scanner;

public class InputUtils
{
  public static <T extends Enum<T>> T promptForEnum(Class<T> enumType,
      Scanner scanner, String promptMessage, String listEnumOptions)
  {
    T result = null;

    while (result == null)
    {
      System.out.println(promptMessage);

      StringBuilder options = new StringBuilder(listEnumOptions);

      for (T value : enumType.getEnumConstants())
      {
        if (value instanceof Guessable<?>)
        {
          options.append(((Guessable<?>) value).getDisplayName());
        }
        else
        {
          options.append(EnumUtils.formatDisplayName(value));
        }
        options.append(", ");
      }

      if (options.length() >= 2)
      {
        options.setLength((options.length()) - 2);
      }

      options.append(" (enter 0 to go back).");
      System.out.println(options);

      String input = scanner.nextLine().trim();

      if (input.equals("0"))
      {
        return null;
      }

      input = input.toUpperCase().replace(" ", "_");
      result = EnumUtils.fromName(enumType, input);
      if (result == null)
      {
        System.out.println("Whoops, you probably made a typo. Try again.");
      }
    }
    return result;
  }
}
