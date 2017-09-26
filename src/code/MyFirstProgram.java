package code;

import java.util.Scanner;

public class MyFirstProgram {

	public static void main(String[] args) {
		
		
//		Scanner sc = new Scanner(System.in);
//		String pass = "";
//		do{
//			System.out.print("Input your password: ");
//			pass = sc.nextLine();
//		}while(!pass.equals("ABC"));
//		System.out.println("Password Correct");
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please input N: ");
//		int n = sc.nextInt();
//		int x = 1;
//		
//		while(x<=n){
//			System.out.println(x);
//			x++;
//		}
		
		
	
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please input N: ");
//		int n = sc.nextInt();
//		while(n==-1){
//			System.out.print("Amounts of number is: "); 	
//		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int x = 1;
		
		while(num/Math.pow(10,x)>0){
			System.out.printf("Ther are %d digits number.",x);
			x++;
		}
	
		
		
		
		
	}
}



