class JavaApplication{
	public static void execute(){
		Employee.companyName = "Capgemini";
		Employee.branch = "West Campus";
		Employee.city = "Bengaluru";
		Employee.state = "Karnataka";
		Employee.country = "India";

		Employee employee1 = new Employee();
		employee1.id = 101;
		employee1.name = "sohail";
		employee1.mailId = "sohail.rcom6@gmail.com";
		employee1.contactNo = 6302383258l;
		employee1.aadhaarNo = 753112245589l;
		employee1.panNo = "PWPPS3210S";
		employee1.dob = "24-09-2003";
		employee1.age = 22;
		employee1.gender = "Male";
		employee1.maritalStatus = "Unmarried";
		employee1.department = "Development";
		employee1.reportingManager = "Shivam";
		employee1.designation = "Junior Developer";
		employee1.salary = 100000;
		employee1.role = "SDE-1";
		employee1.incentive = 20000;
		employee1.uanNumber = 123;
		employee1.yearOfExperience = 0;

		Employee employee2 = new Employee();
		employee2.id = 102;
		employee2.name = "ashraf";
		employee2.mailId = "ashraf.rcom6@gmail.com";
		employee2.contactNo = 6302383256l;
		employee2.aadhaarNo = 653112245556l;
		employee2.panNo = "PWPPS1230S";
		employee2.dob = "24-09-2001";
		employee2.age = 24;
		employee2.gender = "Male";
		employee2.maritalStatus = "Unmarried";
		employee2.department = "Development";
		employee2.reportingManager = "Rahul";
		employee2.designation = "Developer";
		employee2.salary = 150000;
		employee2.role = "SDE-1";
		employee2.incentive = 10000;
		employee2.uanNumber = 456;
		employee2.yearOfExperience = 2;

		Employee employee3 = new Employee();
		employee3.id = 103;
		employee3.name = "radhika";
		employee3.mailId = "radhika.kashish@gmail.com";
		employee3.contactNo = 7382714966l;
		employee3.aadhaarNo = 553112245583l;
		employee3.panNo = "PWPP9740S";
		employee3.dob = "12-12-1997";
		employee3.age = 27;
		employee3.gender = "Female";
		employee3.maritalStatus = "married";
		employee3.department = "Testing";
		employee3.reportingManager = "Sohail";
		employee3.designation = "Junior Tester";
		employee3.salary = 70000;
		employee3.role = "Tester";
		employee3.incentive = 10000;
		employee3.uanNumber = 789;
		employee3.yearOfExperience = 5;

		Employee employee4 = new Employee();
		employee4.id = 104;
		employee4.name = "shaik";
		employee4.mailId = "shaik.rcom@gmail.com";
		employee4.contactNo = 8639181460l;
		employee4.aadhaarNo = 753112245777l;
		employee4.panNo = "PWSSS2210S";
		employee4.dob = "03-02-2001";
		employee4.age = 24;
		employee4.gender = "Male";
		employee4.maritalStatus = "Unmarried";
		employee4.department = "Developer";
		employee4.reportingManager = "Shivam";
		employee4.designation = "Senior Developer";
		employee4.salary = 300000;
		employee4.role = "SDE-2";
		employee4.incentive = 50000;
		employee4.uanNumber = 246;
		employee4.yearOfExperience = 2;

		employee1.displayEmployeeDetails();
		employee1.entry();
		employee1.logIn(employee2.name);
		employee1.teaBreak(employee1.name);
	}
}