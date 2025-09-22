package session6_arrays;

import java.util.Arrays;

public class Examples
{
  public static void main(String[] args)
  {
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    // Print all elements using enhanced for loops
    System.out.println("Matrix contents:");
    for (int[] row : matrix) {
      for (int element : row) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
}
