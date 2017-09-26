package code;

import java.util.Random;

//elab-source:Exam.java

import java.util.Scanner;

public class Exam {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		String ans = "";
		
		do{
			int count = 0;
			int n = ran.nextInt(999)+0;
			System.out.println("Note: the random number is "+n);
			while(true){
				System.out.print("Guess a number(0-999): ");
				int num = sc.nextInt();
				count++;
				if(num==n){
					System.out.printf("Correct! Well done!\nTotal tries = %d\n",count);
					System.out.print("----------\n(P)lay again, (Q)uit: ");
					ans = sc.next();
					if(ans.equalsIgnoreCase("p")){
						n = ran.nextInt(999)+0;
						System.out.println("Note: the random number is "+n);
						count = 0;
					}
					else if(ans.equalsIgnoreCase("q")){
						System.out.print("Bye Bye");
						break;
					}
				}
				else if(num<n){
					System.out.printf("Less than (Tries:%d)\n",count);
				}
				else if(num>n){
					System.out.printf("More than (Tries:%d)\n",count);
				}
			}
		}while(ans.equalsIgnoreCase("p"));
		
	}
	
}