package session8_objects;

public class Rectangle
{
  double width;
  double height;
  String color;

  public Rectangle(double width, double height, String color)
  {
    this.width = width;
    this.height = height;
    this.color = color;
  }

  public Rectangle(double width, String color)
  {
    this.width = width;
    this.height = width;
    this.color = color;
  }

  public String toString()
  {
    if (width != height)
    {
      return "The rectangle has the following dimensions: " + width + "x"
          + height + " and it is " + color;
    }
    else
    {
      return
          "This is not a rectangle, but a square, with the following dimensions: "
              + width + "x" + height + " and it is " + color;
    }
  }
}
