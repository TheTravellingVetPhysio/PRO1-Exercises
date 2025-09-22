package session1_intro;

public class CastingExercise
{
  public static void main(String[] args)
  {
    int myInt = 5;
    double myDouble = (double) myInt; // up-casting - ikke nødvendigt med (double)

    System.out.println(myDouble);

    double myDouble2 = 5.7;
    int myInt2 = (int) myDouble2; // down-casting - nødvendigt med double for explicit at fortælle Java at det er meningen (info går potentielt tabt)

    System.out.println(myInt2);
  }
}
