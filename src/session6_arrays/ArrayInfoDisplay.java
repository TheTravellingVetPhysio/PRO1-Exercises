package session6_arrays;

public class ArrayInfoDisplay
{
  public static void main(String[] args)
  {
    int[] n = new int[7];
    String[] s = {"Monday", "Tuesday", "Wednesday" };
    double[] d = new double[4];

    System.out.println(n.length + " " + n[0] + " " + n[n.length - 1]);
    System.out.println(s.length + " " + s[0] + " " + s[s.length - 1]);
    System.out.println(d.length + " " + d[0] + " " + d[d.length - 1]);

  }
}
