package session3_if_boolean;

public class LeapYear
{
  public static void main(String[] args)
  {
    checkLeapYear(2024);
    checkLeapYear(2026);
    checkLeapYear(2000);
    checkLeapYear(1900);
    checkLeapYear(2100);
    checkLeapYear(2104);
    checkLeapYear(1904);
    checkLeapYear(2002);
    checkLeapYear(2004);
  }

  static void checkLeapYear(int year)
  {

    if (year % 4 == 0)
    {
      if (year % 400 == 0)
      {
        System.out.println(year + " is a leap year");
      }
      else if ((year % 100 == 0) && (year % 400 != 0))
      {
        System.out.println(year + " is not a leap year");
      }
      else
      {
        System.out.println(year + " is a leap year");
      }
    }
  }
}

