package session5_loop;

import java.util.Scanner;

public class ReverseString
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a word or sentence: ");
    String input = scanner.nextLine();
    String reversed = "";
    int length = input.length()-1;

    for (int i = length; i > 0; i--)
    {
      reversed += input.charAt(i);
    }
    System.out.println(reversed);
  }
}
