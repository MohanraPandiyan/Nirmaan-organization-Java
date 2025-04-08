package data;

import java.util.Scanner;

public class VariableTask {
	public static void main(String[] args){
		Scanner Mo = new Scanner(System.in);
		System.out.print("enter the String: ");
		String x=Mo.nextLine();
		System.out.print("Enter The byte: ");
		byte q=Mo.nextByte();
		System.out.print("Enter the short: ");
		short w=Mo.nextShort();
		System.out.print("Enter the Integer: ");
		int e=Mo.nextInt();
		System.out.print("Enter the long: ");
		long r=Mo.nextLong();
		System.out.println("Enter the float: ");
		float t=Mo.nextFloat();
		System.out.println("Enter the double: ");
		double y=Mo.nextDouble();
		System.out.println("Enter the boolean: ");
		boolean a=Mo.hasNextBoolean();
		System.out.println("Enter the boolean: ");
	char s=Mo.next().charAt(10);
		System.out.println(x);
		System.out.println(q);
		System.out.println(w);
		System.out.println(e);
		System.out.println(r);
		System.out.println(t);
		System.out.println(y);
		System.out.println(a);
		System.out.println(s);
	}
	
}
