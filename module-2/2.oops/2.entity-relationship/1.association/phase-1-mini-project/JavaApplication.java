class JavaApplication{
	public static void execution(){
		University university = new University(101,"LPU","NAAC A++","2003");
		Department department = new Department(10001,"CSE","Raja",69);
		College college = new College(1001,"Lovely College","Ashraf",department);
		Student student = new Student(1,"sohail");		
		Project project = new Project(1,"uniGPT","python");
		// student.createProject(project);
		// student.readProject();
		// student.updateProject(12,"uniGPT(v)","ai-ml");
		// student.readProject();
		// student.deleteProject(12);
		// student.readProject();
		university.displayUniversityInfo();
		university.createCollege(college);
		college.readDepartment();
		university.deleteCollege(1001);
		department.readStudent();

	}
}