package session8_objects;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonTest
{
  public static void main(String[] args)
  {

    ArrayList<String> hobbies = new ArrayList<>();
    hobbies.add("Reading");
    hobbies.add("Cycling");

    Person p1 = new Person("Alice", 25);
    System.out.println(p1);

    Person p4 = new Person("Alice", 25, hobbies);
    System.out.println(p4);

    String[] hobbiesArray = p4.getHobbies();
    for (int i = 0; i < hobbiesArray.length; i++)
    {
      System.out.println(hobbiesArray[i]);
    }

    Person p2 = new Person("Adam", 24, hobbies);
    System.out.println(p2);
    p2.setAge(55);
    p2.addHobby("MTB");
    System.out.println(p2);
    System.out.println("Age: " + p2.getAge());

    Person p3 = new Person("Anna", 19);
    p3.greet();
    p3.setName("Anne");
    System.out.println(p3);

    Person p6 = new Person("Alisha", 30, hobbies);
    p6.addHobby("Reading");
    p6.addHobby("Travelling");
    System.out.println(p6);

    System.out.println(Arrays.toString(p6.getHobbies()));
  }
}
