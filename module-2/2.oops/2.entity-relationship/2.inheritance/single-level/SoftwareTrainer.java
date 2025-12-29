class SoftwareTrainer extends Employee{
	String designation;
	double salary;
	String role;
	double incentive;
	static String department;
	static String branch;
	static String company;
	static {
		department = "Software Testing";
		branch = "Jalandhar";
		company = "Test Yantra";
		city = "Amritsar";
		state = "Punjab";
		country = "India";
	}
	public void task(){
		System.out.println("Training the Trainee's");
	}
	public void reverseKT(){
		System.out.println("Explanation about Latest Software Development and Testing Tools");
	}
	public void displaySoftwareTrainingInfo(){
		System.out.println("Software Trainer Info");
		System.out.println("---------------------");
		System.out.println("Id: " + id);
		
	}
}