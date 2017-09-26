package code;

//elab-source:elab.java

import java.util.Scanner;

public class elab {
  
  public static int getTeddyFloor(String TeddyRoom) {
      if (TeddyRoom.equals("Lobby")) {
          return 1;
      } else if (TeddyRoom.equals("Emergency Room")) {
          return 2;
      } else if (TeddyRoom.equals("ICU")) {
          return 3;
      } else if (TeddyRoom.equals("Pharmacy")) {
          return 4;
      } else if (TeddyRoom.equals("Ward")) {
          return 5;
      } else if (TeddyRoom.equals("Office")) {
          return 6;
      } else
          return 45;
  }

  public static int getNextFloor(String floorList, int i) {
      int x = 0;
      x = Integer.parseInt(floorList.substring(i, i + 1));
      return x;
  }

  public static boolean isTeddyHere(int teddyFloor, int currentFloor) {
      if (teddyFloor != currentFloor)
          return false;
      else
          return true;
  }

  public static boolean isFloorValid(int currentFloor) {
      if (currentFloor > 6 || currentFloor < 1) {
          return true;
      } else
          return false;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Please input room where Teddy is: ");
      String room = sc.next();
      System.out.print("Please input list of searching floors: ");
      String floor = sc.next();
      for (int count = 0; count < floor.length(); count++) {
          if (isTeddyHere(getTeddyFloor(room), getNextFloor(floor, count))) {
              System.out.printf("Congrats! Teddy is found on floor %d.", getNextFloor(floor, count));
              break;
          } else {
              System.out.printf("Currently, you are on floor %d. Teddy is not here.\n", getNextFloor(floor, count));
          }
      }
  }
}