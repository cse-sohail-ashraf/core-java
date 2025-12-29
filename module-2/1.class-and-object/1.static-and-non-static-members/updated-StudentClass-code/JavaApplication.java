class JavaApplication{
	public static void execute(){

		Student student1 = new Student();
		System.out.println("Student"+student1);
		student1.displayDetails();

		Student student2 = new Student();
		System.out.println("Student"+student2);
		student2.displayDetails();

		// We can see the both diff objects have same content bca of non static block initializers and thats the drawback
		// To overcome this prob we got constructors
	}
}