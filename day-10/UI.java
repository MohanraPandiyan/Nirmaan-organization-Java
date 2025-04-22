package day10;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		Calculator s = new Calculator();
		Scanner Num = new Scanner(System.in);
		System.out.println("Enter The Num: ");
		int a = Num.nextInt();
		System.out.println("Enter the second Num: ");
		int b = Num.nextInt();
		s.Addition(a,b);
		s.Subraction(a,b);
		s.Multiplication(a,b);
		s.Divition(a,b);
		
	}
}
