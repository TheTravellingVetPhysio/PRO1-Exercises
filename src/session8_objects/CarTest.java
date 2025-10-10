package session8_objects;

public class CarTest
{
  public static void main(String[] args)
  {
    Car car1 = new Car("Toyota", "Corolla", 2020, 15000);
    Car car2 = new Car("Honda", "Civic", 2018, 32000);
    Car car3 = new Car("Ford", "Mustang", 2022, 5000);
    Car car4 = new Car("Tesla", "Model 3", 2021, 12000);
    Car car5 = new Car("Tesla", "Model 3", 2021, 12000);

    car1.displayDetails();
    car2.displayDetails();
    car3.displayDetails();
    car4.displayDetails();

    car2.drive(133);
    car2.drive(539);

    System.out.println(car4.toString());
    System.out.println(car5.toString());

    if (car4 == car5)
    {
      System.out.println("Car 4 and 5 are equal");
    }
    else
    {
      System.out.println("They do not match");
    }

    if (car4.equals(car5))
    {
      System.out.println("Car 4 and 5 are equal");
    }
    else
    {
      System.out.println("They do not match");
    }

    car5.drive(333);

    System.out.println(car4.toString());
    System.out.println(car5.toString());

    if (car4.equals(car5))
    {
      System.out.println("Car 4 and 5 are equal");
    }
    else
    {
      System.out.println("They do not match");
    }
  }
}
