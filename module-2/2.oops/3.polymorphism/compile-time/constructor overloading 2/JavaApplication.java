class JavaApplication{
	public static void execution(){
		Student s1 = new Student("suresh",'M',"3-09-2003","suresh@gmail.com",7238461790l);
		s1.displayStudentInfo();
		Student s2 = new Student("sohail",'M');
		s2.displayStudentInfo();
		Student s3 = new Student("dns",'M',"4-11-2004","dns@yahoo.com");
		s3.displayStudentInfo();
		Student s4 = new Student("holly",'F',"4-12-1997");
		s4.displayStudentInfo();

	}
}