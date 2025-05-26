package day15;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

class Details{
	private long AccNo;
	private String Name;
	private long AddharNo;
	private long Balance = 10000;
	private int pin = 98765;
	public long getAccNo(){
		return AccNo;
	}
	public void setAccNo(long AccNo) {
		this.AccNo = AccNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public long getAddharNo() {
		return AddharNo;
	}
	public void setAddharNo(long AddharNo) {
		this.AddharNo = AddharNo;
	}
	public long getBalance() {
		return Balance;
	}
	public void setBalance(long Balance,int pin) {
		if(this.pin==pin) {
			this.Balance = Balance;
		}
	}
		
	
	public Details(long AccNo,String Name,long AddharNo) {
		this.AccNo = AccNo;
		this.Name = Name;
		this.AddharNo = AddharNo;
		//this.Balance = Balance=10000;
	}
	public Details() {
		
	}
	@Override
	public String toString() {
		return "Details [AccNo=" + AccNo + ", Name=" + Name + ", AddharNo=" + AddharNo + ", Balance = " + Balance+"]";
	}
	
	
}
public class AccountManagement {
	public static void main(String[] args) {
		Details D = new Details();
		Scanner sc = new Scanner(System.in);
		Boolean C = true;
		while (C) {
			System.out.println("Enter 1 For Enter The Details : ");
			System.out.println("Enter 2 For View Details : ");
			System.out.println("Enter 3 For Update : ");
			System.out.println("Update The Balance : ");
			int O = sc.nextInt();
			if(O==1) {
				System.out.println("Enter The Account Number : ");
				long a = sc.nextLong();
				sc.nextLine();
				System.out.println("Enter The Name : ");
				String b = sc.nextLine();
				System.out.println("Enter The Addhar Number : ");
				long c = sc.nextLong();
				D = new Details(a,b,c);
				
			}
			else if (O==2) {
				System.out.println(D);
			}
			else if (O==3) {
				System.out.println("Update the Account Number");
				long e = sc.nextLong();
				sc.nextLine();
				System.out.println("Update The Name");
				String f = sc.nextLine();
				System.out.println("Update Addhar Number");
				long g = sc.nextLong();
				D.setAccNo(e);
				D.setName(f);
				D.setAddharNo(g);
				
			}
			else if(O == 4) {
				System.out.println("Enter Your Pin");
				int upin = sc.nextInt();
				System.out.println("Enter the Amount : ");
				long bal = sc.nextLong();
				D.setBalance(bal, upin);
			}
			
			
			
		}
	}
	
}




