package day10;

public class Method {
	String Name;
	long PhoneNo;
	double Salary;
	void Employee(){
		System.out.println("Enter Employee Name: "+Name);
		System.out.println("Enter Employee Phone No: "+PhoneNo);
		System.out.println("Enter Employee Salary: "+Salary);
		System.out.println();
		
	}
	public static void main(String[] args) {
		Method emp0 = new Method();
		emp0.Name = "Mohan";
		emp0.PhoneNo = 6380717104l;
		emp0.Salary = 35000;
		emp0.Employee();
		
		Method emp1 = new Method();
		emp1.Name = "Prasanna";
		emp1.PhoneNo = 9363261343l;
		emp1.Salary = 40000;
		emp1.Employee();
		
		Method emp2 = new Method();
		emp2.Name = "Harish";
		emp2.PhoneNo = 8072968651l;
		emp2.Salary = 250000;
		emp2.Employee();
		
		Method emp3 = new Method();
		emp3.Name = "Perumal";
		emp3.PhoneNo = 6385522571l;
		emp3.Salary = 22400;
		emp3.Employee();
	}

}
