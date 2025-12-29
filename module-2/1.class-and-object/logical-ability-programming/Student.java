import java.util.Scanner;

class Student{
	int id;
	String name;
	long contactNo;
	int batch;

	public void create(int id){
		System.out.println("Student created with id: " + id);
	}

	public void insert(){
		System.out.println("Details inserted");
	}

	public void read(){
		System.out.println("reading....");
	}

	public void update(){
		System.out.println("Choose the option to update");
		System.out.println("1.name");
		System.out.println("2.contactNo");
		System.out.println("3.emailId");
		System.out.println("4.update all");
	}

	public void delete(){
		System.out.println("Choose the option to delete");
		System.out.println("1.name");
		System.out.println("2.contactNo");
		System.out.println("3.emailId");
		System.out.println("4.delete all");
	}
}