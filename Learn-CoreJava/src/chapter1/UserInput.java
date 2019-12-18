package chapter1;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		// Integer Value
		System.out.println("Enter Any Digit");
		int UserInput = scan.nextInt();
		System.out.println(UserInput);
		
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter Your name");
		String yourname = scan1.nextLine();
		System.out.println(yourname);
		
		
		
		
		
		
	}

}
