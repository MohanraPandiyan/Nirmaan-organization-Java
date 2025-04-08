package data;

import java.util.Scanner;

public class operators {
	public static void main(String[] args) {
		Scanner a=new Scanner (System.in);
		System.out.print("Enter the first number : ");
		int m=a.nextInt();
		System.out.print("Enter the first number : ");
		int n=a.nextInt();
		System.out.println("\n");
		System.out.println("Arithmatic operations:");
		System.out.println("Addition: "+(m+n));
		System.out.println("Subtraction: "+(m-n));
		System.out.println("Multiplication: "+(m*n));
		System.out.println("Divition: "+(m/n));
		System.out.println("Modulus: "+(m%n));
		System.out.println("\n");
		System.out.println("Relational Operations:");
		System.out.println("12>25 "+(m>n));
		System.out.println("12<25 "+(m<n));
		System.out.println("12>=25 "+(m>=n));
		System.out.println("12<=25 "+(m<=n));
		System.out.println("12==25 "+(m==n));
		System.out.println("12!=25 "+(m!=n));
		System.out.println("\n");
		System.out.println("Logical operator :");
		System.out.println("12 > 10 AND 25 < 50 "+((m>10) && (n<50)));
		System.out.println("12 < 5 AND 25 > 100 "+((m<5) && (n>100)));
		System.out.println("\n");
		System.out.println("Asignment Operations: ");
		System.out.print("Initial value: ");
		int o=a.nextInt();
		System.out.println("After += : "+(o+=m));
		System.out.println("After -= : "+(o-=m));
		System.out.println("After *= : "+(o*=m));
		System.out.println("After /= : "+(o/=m));
		System.out.println("After %= : "+(o%=m));
		System.out.println("\n");
		System.out.println("Unary operations: ");
		System.out.println("Initial value: ");
		int p=a.nextInt();
		System.out.println("After increment: "+(++p));
		System.out.println("After decrement: "+(--p));
		System.out.println("\n");
		System.out.println("Conditional Operations: ");
		String ran=(p%2==0)?"Even":"Odd";
		System.out.println("12 is "+(ran));
	}

}
