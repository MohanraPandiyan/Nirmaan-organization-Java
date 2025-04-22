package day7;

import java.util.Scanner;

public class Palindrome {
 public static void main(String[] args) {
	 
	 
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("Enter the string: ");
	 String s=sc.nextLine().trim();
	 String a="";
	 for(int i = s.length()-1;i >= 0;i--) {
		 a+=s.charAt(i);
	 }
	 
	 if(a.equals(s)) {
		 System.out.println(s +"  "+"is a palindrome string");
	 }
	 else {
		 System.out.println(s +" not a polindrom string ");
	 }
 }
}