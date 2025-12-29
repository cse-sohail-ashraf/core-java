class JavaApplication{
	public static void execute(){

		Student student1 = new Student(1,"Sohail","sohail.rcom6@gmail.com",1234567890);
		System.out.println(student1);
		System.out.println("Student"+student1);
		student1.displayDetails();

		Student student2 = new Student(2,"Ashraf","ashraf.rcom4@gmail.com",1234567891);
		System.out.println(student2);
		System.out.println("Student"+student2);
		student2.displayDetails();
	}
}