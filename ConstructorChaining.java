package day17;

class person{
	String Name;
	int age;
	public person(String Name,int age) {
		super();
		this.Name=Name;
		this.age=age;
	}
}
class employee extends person{
	String empName;
	int Id;
	public employee(String Name, int age,String empName, int Id) {
		super(Name, age);
		this.empName = empName;
		this.Id=Id;
		
	}
	
	
}
class teacher extends employee{
	String TechName;
	String Sub;
	public teacher(String empName, int Id,String TechName,String Sub) {
		super(Sub, Id, Sub, Id);
		this.TechName = TechName;
		this.Sub = Sub;
	}
	
}

public class ConstructorChaining {
	public static void main(String[] args) {
		employee e = new employee("mohan",12,"prasanna",12);
		System.out.println(e.Name);
		System.out.println(e.age);
		System.out.println(e.empName);
		System.out.println(e.Id);
	
	}
	
	
}
