package session4_switch_enums;

import java.util.Scanner;

public class TrafficLightSimulation
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter light color");
    String input = scanner.nextLine().toUpperCase();
    printAction(Lights.valueOf(input));
  }

  public static void printAction(Lights trafficLight)
  {
    if (trafficLight == Lights.RED)
    {
      System.out.println("Action: Stop");
    }
    else if (trafficLight == Lights.YELLOW)
    {
      System.out.println("Action: Wait");
    }
    else if (trafficLight == Lights.GREEN)
    {
      System.out.println("Action: Go");
    }
  }
}