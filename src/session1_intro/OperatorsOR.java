package session1_intro;

import java.util.concurrent.ThreadLocalRandom;

public class OperatorsOR

{
  public static void main(String[] args)
  {
    int a = 5;
    int b = ThreadLocalRandom.current().nextInt(1, 30); // generer et tilfældigt tal imellem 1 og 30
    int c = 15;

    boolean result = (a > b) || (b > c);
    System.out.println("b value: " + b);
    System.out.println("b is not between a and c: " + result);
  }
}
