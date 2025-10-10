package session8_objects;

import java.util.Objects;

public class Car
{
  private String make;
  private String model;
  private int year;
  private int mileage;

  public Car(String make, String model, int year, int mileage)
  {
    this.make = make;
    this.model = model;
    this.year = year;
    this.mileage = mileage;
  }

  public String getMake()
  {
    return make + model;
  }

  public void setMake(String make, String model)
  {
    this.make = make;
    this.model = model;
  }

  public void drive(int distance)
  {
    mileage += distance;
    System.out.println("Driving " + distance + " km. New mileage: " + mileage);
  }

  public void displayDetails()
  {
    System.out.println("Car: " + year + " " + make + " " + model);
    System.out.println("Mileage: " + mileage + " km");

  }

  public String toString()
  {
    return "Car: " + year + " " + make + " " + model + " " + mileage + " km";
  }

  @Override
  public boolean equals(Object obj)
  {
  if (this == obj) return true; // check if the two objects reference the same memory address
  if (obj == null || getClass() != obj.getClass()) return false; // check if the other object is null or not of the same class
    Car other = (Car) obj; // Cast to the class and compare relevant fields (use Objects.equals for null-safe comparisons).
  return make == other.make && Objects.equals(model, other.model) && Objects.equals(year, other.year) && Objects.equals(mileage, other.mileage); // compare fields
  }

  @Override
  public int hashCode()
  {
    // Simple and common approach using java.util.Objects, notice the import at the top
    return Objects.hash(make, model, year, mileage);
  }
}
