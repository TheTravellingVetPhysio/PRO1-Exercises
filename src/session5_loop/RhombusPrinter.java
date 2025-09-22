package session5_loop;

import java.util.Scanner;

public class RhombusPrinter {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the height of the rhombus: ");
    int height = scanner.nextInt();

    // Top half
    for (int i = 1; i <= height; i++) {
      for (int j = height; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // Bottom half
    for (int i = height - 1; i >= 1; i--) {
      for (int j = height; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}