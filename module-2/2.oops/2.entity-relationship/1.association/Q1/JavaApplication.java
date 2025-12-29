class JavaApplication{
	public static void execute(){
		Student student = new Student(1,"sohail","cse-shaik-sohail-ashraf@gmail.com",123456789l);
		student.displayStudentInfo();
		Project project = new Project(1,"Contact-Management-System","Java web Application");
		student.createProject(project);
		student.readProject();
		student.updateProject(1,"hehe","thu");
		student.readProject();
		student.deleteProject(1);
		student.readProject();
	}
}