package session3_if_boolean;

import java.util.Scanner;

public class GradeEvaluation
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a number between 0 and 100:");
    int score = scanner.nextInt();

    if (score >= 90)
    {
      System.out.println("Your score is A");
    }
    if (score >= 80)
    {
      System.out.println("Your score is B");
    }
    if (score >= 70)
    {
      System.out.println("Your score is C");
    }
    if (score >= 60)
    {
      System.out.println("Your score is D");
    }
    if (score < 60)
    {
      System.out.println("Your score is E");
    }
    if (score < 40)
    {
      System.out.println("Your failed the exam");
    }
  }
}
