class Employee{
	int id;
	String name;
	String mailId;
	long contactNo;
	long aadhaarNo;
	String panNo;
	String dob;
	int age;
	String gender;
	String maritalStatus;
	static String companyName;
	static String branch;
	String department;
	String reportingManager;
	String designation;
	int salary;
	String role;
	int incentive;
	int uanNumber;
	int yearOfExperience;
	static String city;
	static String state;
	static String country;

	public void displayEmployeeDetails(){
		System.out.println("Name: " + name);
		System.out.println("id: " + id);
		System.out.println("mail ID: " + mailId);
		System.out.println("contact Number: " + contactNo);
		System.out.println("aadhaar Number: " + aadhaarNo);
		System.out.println("Date Of Birth: " + dob);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("marital Status: " + maritalStatus);
		System.out.println("Company Name: " + companyName);
		System.out.println("Branch " + branch);
		System.out.println("Department: " + department);
		System.out.println("Reporting Manager: " + reportingManager);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
		System.out.println("Role: " + role);
		System.out.println("Incentive: " + incentive);
		System.out.println("UAN number: " + uanNumber);
		System.out.println("Year of experience: " + yearOfExperience);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		System.out.println("Country: " + country);
	}

	public void entry(){
		System.out.println("Employee entry");
	}

	public void logIn(String name){
		System.out.println(name + " has logged in");
	}

	public void teaBreak(String name){
		System.out.println(name + " has taken tea break");
	}

	
}