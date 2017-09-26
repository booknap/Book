package code;

import java.util.Scanner;

public class Midterm {

	static Scanner sc = new Scanner(System.in);

	public static void printRoof(int row1, String cha1) {

		for (int x = 0; x < row1; x++) {
			System.out.print(" ");
			// for (int z = 0; z < row1 / 2; z++) {
			// System.out.print(" ");
			// }
			if (x % 2 == 0) {
				for (int y = 0; y <= x; y++) {
					System.out.print(cha1);
				}
				System.out.println();
			}
		}

	}

	public static void printWall(int row2, String cha2) {

		for (int j = 0; j < row2 / 2; j++) {
			System.out.print("  ");
			for (int i = 0; i < row2; i++) {
				System.out.print(cha2);
			}
			System.out.println();
		}

	}

	public static void printFloor(int row3, String cha3) {

		System.out.print("  ");
		for (int b = 0; b < row3; b++) {
			System.out.print(cha3);
		}
		System.out.println();
		System.out.print(" ");
		for (int b = 0; b < row3 + 2; b++) {
			System.out.print(cha3);
		}
		System.out.println();
		for (int b = 0; b < row3 + 4; b++) {
			System.out.print(cha3);
		}

	}

	public static void main(String[] args) {

		printRoof(3, "#");
		printWall(3, "&");
		printFloor(3, "@");

	}

}
