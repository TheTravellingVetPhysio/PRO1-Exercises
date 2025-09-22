package session7_list;

import java.util.ArrayList;

public class ArrayListBasics
{
  public static void main(String[] args)
  {
    int i = 1;

    ArrayList<Integer> myList = new ArrayList<>();
    while (i <= 100)
    {
      myList.add(i);
      i++;
    }

    System.out.println(myList.size());
    System.out.println(myList.get(33));

    ArrayList<String> myString = new ArrayList<>();
    myString.add("Apple");
    myString.add("Banana");
    myString.add("Cherry");
    myString.add(1, "Orange");

  //  for (String fruit : myString)
    System.out.println("Original ArrayList: " + myString);
    System.out.println(myString.get(myString.size()-1)); // Last element of list

    myString.set(2, "Blueberry"); // set replaces existing index. add adds a new element.

    System.out.println("After replacement og index 2: " + myString);
    // remove with .remove(index) to remove a certain index
    // remove with .remove(objects) to remove a certain object, e.g. Integer.valueOf(1) or "Blue"
  }


}
