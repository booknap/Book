package code;

import java.util.Random;

import java.util.Scanner;

public class Midterm2 {

	static Scanner sc = new Scanner(System.in);

	static Random rand = new Random();

	static int newRandom() {

		return rand.nextInt(6) + 1;

	}

	public static void main(String[] args) {

		String ans = "t";
		int xxx;
		int target;
		String again = "p";

		while (true) {

			int sum = 0;
			int count = 1;

			System.out.print("Set a target: ");
			target = sc.nextInt();

			while (ans.equals("t")) {
				xxx = newRandom();
				sum = sum + xxx;
				System.out.println("Toss " + count + " result: " + xxx);
				if (sum < target) {
					System.out.printf("Sum is %d\n", sum);
				} else if (sum > target) {
					sum = sum - xxx;
					System.out.printf("Sum is %d\n", sum);
				} else if (sum == target) {
					System.out.printf("Sum is %d\n", target);
					System.out.printf("You win! (Total %d tries)\n", count);
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
