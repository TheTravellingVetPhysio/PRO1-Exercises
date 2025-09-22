package session3_if_boolean;

public class SmilingMonkey
{
  public static void main(String[] args)
  {
    weAreInTrouble(true, true);
    weAreInTrouble(false, false);
    weAreInTrouble(true, false);
    weAreInTrouble(false, true);
  }

  public static void weAreInTrouble(boolean aSmile, boolean bSmile)
  {
    boolean weAreInTrouble = (aSmile && bSmile) || (!aSmile && !bSmile);
    System.out.println(weAreInTrouble);

  }
}
