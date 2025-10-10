package session8_objects;

public class Circle
{
  private double radius;
  private double diameter;
  private String color;

  public Circle(double radius, String color)
  {
    this.radius = radius;
    this.color = color;
    diameter = radius * 2;
  }

public void setRadius(double newRadius)
{
  if (newRadius > 0)
  {
    radius = newRadius;
    diameter = 2*radius;
  }
  else {
    System.out.println("Invalid radius");
  }
}

public double getRadius()
{
  return radius;
}

  @Override public String toString()
  {
    return "Circle{" + "radius=" + radius + ", diameter=" + diameter
        + ", color='" + color + '\'' + '}';
  }

  /**
  public String toString()
  {
    String representation = "Circle{" + "\n" +
        "\tradius: " + radius + "\n" +
        "\tdiameter: " + diameter + "\n" +
        "\tcolor: " + color + "\n" +
            "}";
    return representation;
  }
   */

}