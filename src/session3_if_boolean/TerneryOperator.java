package session3_if_boolean;

public class TerneryOperator
{
  public static void main(String[] args)
  {
    int a = 18;
    int b = 24;

    String result = a > 0 ? "positive" : "negative";
    System.out.println("The number is: " + result);

    int minimum = a < b ? a : b;
    System.out.println("The smallest number is: " + minimum);

    int absolute = a < 0 ? -a : a;
    System.out.println("The absolute number is: " + absolute);

    String age = a >= 18 ? "You are eligible to vote" : "You need to be older ...";
    System.out.println(age);
  }
}
