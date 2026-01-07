class SoftwareDeveloper extends Employee{
	String designation;
	double salary;
	String role;
	double incentive;
	static String branch;
	static String department;
	static String company;
	static{
		city = "Jalandhar";
		state = "Punjab";
		country = "India";
		branch = "Amritsar";
		department = "SoftwareDevelopment";
		company = "Capgemini";
	}
	SoftwareDeveloper(int id,String name,String mailId,long contactNumber,String designation,double salary,String role,double incentive){
		super(id,name,mailId,contactNumber);
		this.designation = designation;
		this.salary = salary;
		this.role = role;
		this.incentive = incentive;
	}
	@Override
	public void reverseKT() {
		System.out.println("Explanation about Latest Software Development Tools");
	}
	@Override
	public void task(){
		System.out.println("Software Development");
	}
	@Override
	public void employeeInfo(){
		System.out.println("Employee Info");
		System.out.println("-------------");
		System.out.println("Id: " + super.id);
		System.out.println("Name: " + super.name);
		System.out.println("Mail id: " + super.mailId);
		System.out.println("Contact Number: " + super.contactNumber);
		System.out.println("Designation: " + this.designation);
		System.out.println("Salary: " + this.salary);
		System.out.println("Role: " + this.role);
		System.out.println("Incentive: " + this.incentive);
		System.out.println();
	}

}