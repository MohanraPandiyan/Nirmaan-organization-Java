package data;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The 1st Num: ");
		int Num1 = sc.nextInt();
		System.out.print("Enter The 2nd Num: ");
		int Num2 = sc.nextInt();
		System.out.println("Enter 1 for Addition: ");
		System.out.println("Enter 2 for Subraction: ");
		System.out.println("Enter 3 for Multiplication: ");
		System.out.println("Enter 4 for Divition: ");
		int Key = sc.nextInt();
		switch (Key) {
		case 1:{
			System.out.println("Addition: "+Num1+Num2);
			break;
		}
		case 2:{
			System.out.println("Subraction: "+(Num1-Num2));
			break;
		}
		case 3:{
			System.out.println("Multiplication: "+Num1*Num2);
			break;
		}
		case 4:{
			System.out.println("Divition: "+Num1/Num2);
			break;
		}
		default :{
			System.out.println("Invalid Function");
		}
	}
	
	
}
}
