class JavaApplication{
	public static void execute(){
		Student.city = "jalandhar";
		Student.state = "Punjab";
		Student.country = "India";

		Student student1 = new Student();
		System.out.println("Student"+student1);
		student1.id = 1;
		student1.name = "Sohail";
		student1.mailId = "sohail.rcom6@gmail.com";
		student1.contactNumber = 1234567890;
		student1.displayDetails();

		Student student2 = new Student();
		System.out.println("Student"+student2);
		student2.id = 2;
		student2.name = "Ashraf";
		student2.mailId = "ashraf.rcom4@gmail.com";
		student2.contactNumber = 1234567891;
		student2.displayDetails();
	}
}