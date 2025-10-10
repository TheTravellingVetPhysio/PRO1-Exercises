package session8_objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Person
{
  String name;
  int age;
  ArrayList<String> hobbies;

  public Person(String name, int age)
  {
    this.name = name;
    this.age = age;
    this.hobbies = new ArrayList<>();
  }

  public Person(String name, int age, ArrayList<String> hobbies)
  {
    this.name = name;
    this.age = age;
    this.hobbies = new ArrayList<>(hobbies);
  }

  public String toString()
  {
    if (hobbies.isEmpty())
    {
      return name + " is " + age;
    }
    else if (hobbies.size() == 1)
    {
      return name + " is " + age + " and likes " + hobbies.getFirst()
          .toLowerCase();
    }
    else
    {
      return name + " is " + age + " and likes " + String.join(", ",
          hobbies.subList(0, hobbies.size() - 1)).toLowerCase() + " and "
          + hobbies.getLast().toLowerCase();
    }
  }

  public void greet()
  {
    System.out.println(
        "Hello! My name is " + name + " and I am " + age + " years old.");
  }

  public String setName1()
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Update your name: ");
    String newName = scanner.nextLine();
    this.name = newName;
    return "Hello! My name is " + name + " and I am " + age + " years old.";
  }

  public String setName(String newName){
    this.name = newName;
    return name;
  }

  public String getName()
  {
    return name;
  }

  public void setAge(int newAge)
  {
    this.age = newAge;
  }

  public int getAge()
  {
    return age;
  }

  public void addHobby(String hobby)
  {
    hobbies.add(hobby);
  }

  public String[] getHobbies()
  {
    return hobbies.toArray(new String[0]);
  }
}