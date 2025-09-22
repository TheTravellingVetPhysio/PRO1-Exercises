package session6_arrays;

public class Array
{
  public static void main(String[] args)
  {
    int[] n = new int[5];

    n[0] = 18;
    n[1] = 19;
    n[2] = 20;
    n[3] = 17;
    n[4] = 21;

    for (int age : n)
    {
      System.out.println("Age: " + age);
    }
  }
}
