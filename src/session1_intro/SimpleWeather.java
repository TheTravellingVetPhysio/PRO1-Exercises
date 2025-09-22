package session1_intro;

public class SimpleWeather
{
  public static void main(String[] args)
  {
    int theTemp = -2;

    boolean theTempIsNice = (theTemp >= 15) && (theTemp <= 25);
    boolean theTempIsNice2 = (theTemp >= -10) && (theTemp <= -2);
    boolean itsSunny = false;
    boolean itsSnowing = true;

    if (theTempIsNice && itsSunny)
    {
      System.out.println("Sun and warm temperatures!");
    } else if (theTempIsNice2 && itsSnowing && itsSunny)
    {
      System.out.println("Make ready for a powder day!!");
    } else
    {
      System.out.println("It is NOT nice weather! :-( ");
    }

    if (itsSunny)
    {
      System.out.println("It is sunny!");
    } else {
      System.out.println("No sun today ...");
    }

  }
}
