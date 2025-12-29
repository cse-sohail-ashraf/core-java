class JavaApplication{
	public static void execute() {
		Student s = new Student();
		// indirect read operation - safe
		System.out.println(s.getId());
		System.out.println(s.getName());
		// indirect write operation - safe
		s.setId(101);
		s.setName("sohail");
		// indirect read operation - safe
		System.out.println(s.getId());
		System.out.println(s.getName());
	}
}