package session7_list;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GradeUpdateSystem
{
  public static void main(String[] args)
  {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> grades = new ArrayList<>();
    int student;

    for (int i = 0; i < 5; i++)
    {
      grades.add(random.nextInt(41) + 60);
    }

    System.out.println("Original grades: " + grades);

    do
    {
      System.out.println("Enter a student number og 0 to exit: ");
      student = scanner.nextInt();

      if (student > 0 && student <= grades.size())
      {
        // int oldGrade = grades.get(student-1);
        System.out.println("Enter a new grade for this student: ");
        int newGrade = scanner.nextInt();
        int index = student -1;
        int oldGrade = grades.set(index, newGrade);
        //grades.set(student-1, scanner.nextInt());
        System.out.println("Grades for student " + student + " changed from " + oldGrade + " to " + grades.get(student-1) + "\nUpdated grades: " + grades);
      }
      else if (student != 0)
      {
        System.out.println("Invalid student number, try again..");
      }
       else if (student == 0)
      {
        break;
      }
    } while (student != 0);
    System.out.println("Done!");
    scanner.close();
  }
}
