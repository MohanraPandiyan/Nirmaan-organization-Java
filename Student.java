package day8;

public class Student {
	String name;
	String RegisterNo;
	String bloodgroup;
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="Mohan";
		s1.RegisterNo="E20ITR031";
		s1.bloodgroup="O+";
		System.out.println(s1.name+" "+s1.RegisterNo+" "+s1.bloodgroup);
		Student s2 = new Student();
		s2.name="Harish";
		s2.RegisterNo="E20ITR025";
		s2.bloodgroup="B+";
		System.out.println(s2.name+" "+s2.RegisterNo+" "+s2.bloodgroup);
		Student s3 = new Student();
		s3.name="Perumal";
		s3.RegisterNo="E20ITR045";
		s3.bloodgroup="A+";
		System.out.println(s3.name+" "+s3.RegisterNo+" "+s3.bloodgroup);
		Student s4 = new Student();
		s4.name="Prasanna";
		s4.RegisterNo="E20ITR048";
		s4.bloodgroup="AB+";
		System.out.println(s4.name+" "+s4.RegisterNo+" "+s4.bloodgroup);
	}

}
