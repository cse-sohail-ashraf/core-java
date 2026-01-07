import java.lang.Object;

class Student extends Object{
	String name;
	char gender;
	String mailId;
	String dob;
	long contactNumber;
	public Student(String name,char gender){
		super();
		this.name = name;
		this.gender = gender;
	}
	public Student(String name,char gender,String dob){
		this(name,gender);
		this.dob = dob;
	}
	public Student(String name,char gender,String dob,String mailId){
		this(name,gender,dob);
		this.mailId = mailId;
	}
	public Student(String name,char gender,String dob,String mailId,long contactNumber){
		this(name,gender,dob,mailId);
		this.contactNumber = contactNumber;
	}
	public void displayStudentInfo(){
		System.out.println("Student Info");
		System.out.println("------------");
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Dob: " + dob);
		System.out.println("Mail Id: " + mailId);
		System.out.println("Contact Number: " + contactNumber);
	}
}