package session8_objects;

public class CircleTester
{
  public static void main(String[] args)
  {
    Circle c1 = new Circle(5.0, "red");
    Circle c2 = new Circle(3.0, "blue");

    System.out.println(c1);
    System.out.println(c2);

    c1.setRadius(7.5);
    System.out.println(c1);
    System.out.println("Radius: " + c1.getRadius());
  }
}