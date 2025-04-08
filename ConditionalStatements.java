package data;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Mark: ");
		int a = sc.nextInt();
		if(a>=35 && a<101){
			if(a>90) {
				System.out.println("You are Grade O");
			}
			else if(a>80) {
				System.out.println("You are Grade A");
			}
			else if(a>70) {
				System.out.println("You are Grade B");
			}
			else if(a>60) {
				System.out.println("You are Grade C");
			}
			
			else {
			System.out.println(" You are Pass \n Your Grade D");
			}
		}else if (a<=0 && a>35) {
			System.out.println("Better luck next time");
		}
		else {
			System.out.println("Invalid Entry");
		}
	}
}
