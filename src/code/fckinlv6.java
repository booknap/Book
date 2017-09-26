package code;

import java.util.Random;

import java.util.Scanner;

public class fckinlv6 {

	static Scanner sc = new Scanner(System.in);

	static Random rand = new Random();

	static int newRandom() {

		return rand.nextInt(6) + 1;

	}

	public static void main(String[] args) {

		String ans = "t";
		int xxx;
		int yyy;
		int target;
		String again = "p";

		while (true) {

			int sum1 = 0;
			int sum2 = 0;
			int count = 1;

			System.out.print("Set a target: ");
			target = sc.nextInt();

			while (ans.equals("t")) {
				xxx = newRandom();
				yyy = newRandom();
				sum1 = sum1 + xxx;
				sum2 = sum2 + yyy;
				System.out.printf("===== Toss %d =====\n", count);
				System.out.printf("Player1 result: %d\n", xxx);
				if (sum1 <= target) {
					System.out.printf("Sum Player1 is %d\n", sum1);
				} else if (sum1 > target) {
					sum1 = sum1 - xxx;
					System.out.printf("Sum Player1 is %d\n", sum1);
				}
				System.out.printf("Player2 result: %d\n", yyy);
				if (sum2 <= target) {
					System.out.printf("Sum Player2 is %d\n", sum2);
				} else if (sum2 > target) {
					sum2 = sum2 - yyy;
					System.out.printf("Sum Player2 is %d\n", sum2);
				}
				if (sum1 == target && sum2 == target) {
					System.out.printf("Both Players win! (Total %d tries)\n", count);
					System.out.print("(p)lay again or (q)uit: ");
					again = sc.next();
					break;
				}
				if (sum1 == target) {
					System.out.printf("Player1 win! (Total %d tries)\n", count);
					System.out.print("(p)lay again or (q)uit: ");
					again = sc.next();
					break;
				}
				if (sum2 == target) {
					System.out.printf("Player2 win! (Total %d tries)\n", count);
					System.out.print("(p)lay again or (q)uit: ");
					again = sc.next();
					break;
				}
				System.out.print("(t)oss or (q)uit: ");
				ans = sc.next();
				count++;
				if (ans.equals("q")) {
					System.out.print("Bye\n");
					System.out.print("(p)lay again or (q)uit: ");
					again = sc.next();
					break;
				}
			} 
			if (again.equals("q")) {
				System.out.print("Bye");
				break;
			}

		}
	}

}
