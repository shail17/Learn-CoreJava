package chapter1;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("enter Any Number");*/
		//Integer Values
		/*int userinput=scan.nextInt();
		
		System.out.println(userinput);
		
		// 
		System.out.println("Enete Double Number");
		
		double double_Value= scan.nextDouble();
		
		System.out.println(double_Value);*/
		
		
		System.out.println("Enter String");
		
		String str = scan.nextLine();
		
		System.out.println("HI "+str);
		
	}

}
