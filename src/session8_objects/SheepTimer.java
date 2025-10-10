package session8_objects;

import java.time.LocalDate;

public class SheepTimer
{
  public static void main(String[] args)
  {
    LocalDate startDate = LocalDate.of(2025, 9, 18);

    int sheepPreg = 147;

    System.out.println(startDate.minusDays(sheepPreg));
  }
}
