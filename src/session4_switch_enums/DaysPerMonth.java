package session4_switch_enums;

public class DaysPerMonth
{
  public static void main(String[] args)
  {
    int month = 6;
    String line = "In this month there are ";
    String line2 = " days.";

    switch (month)
    {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
      {
        System.out.println(line + "31" + line2);
      }
      break;
      case 4:
      case 6:
      case 9:
      case 11:
      {
        System.out.println(line + "30" + line2);
      }
      break;
      case 2:
      {
        System.out.println(line + "28" + line2);
      }
      break;
      default:
        System.out.println("Invalid month");
    }
  }
}
