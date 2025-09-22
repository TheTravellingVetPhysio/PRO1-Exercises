package session1_intro;

public class OperatorsAND
{
  public static void main(String[] args)
  {
    int a = 5;
    int b = 7;
    int c = 15;

    boolean aLessB = (a < b);
    boolean bLessC = (b < c);
    boolean result = aLessB && bLessC;
    System.out.println( "Is c largest and b next largest? " + result );

    boolean result2 = (a < b) && (b < c);
    System.out.println("Is b between a and c? " + result2);
  }
}
