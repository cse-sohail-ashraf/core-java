abstract class Employee{
	int id;
	String name;
	String mailId;
	long contactNumber;
	Employee(int id,String name,String mailId,long contactNumber) {
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
	}
	static String city;
	static String state;
	static String country;
	public void entry() {
		System.out.println("Employee will enter into the Campus!");
	}
	public void login() {
		System.out.println("Employee will login into the Office!");
	}
	public abstract void reverseKT();
	public abstract void task();
	public abstract void employeeInfo();
	public void logout() {
		System.out.println("Employee logout from the office!");
	}
	public void exit() {
		System.out.println("Employee exited from the Office!");
	}
}