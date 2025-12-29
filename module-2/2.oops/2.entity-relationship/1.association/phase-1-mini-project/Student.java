class Student{
	private int id;
	private String name;
	private Project project;

	public Student(){
	}
	public Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Project getProject(){
		return project;
	}
	public void setProject(Project project){
		this.project = project;
	}

	public void displayStudentInfo(){
		System.out.println("Student Details: ");
		System.out.println("-----------------");
		System.out.println("Id: " + getId());
		System.out.println("Name: " + getName());
	}

	public void createProject(Project project){
		if(this.getProject() == null && project != null){
			this.setProject(project);
			System.out.println("Project Created");
		}else{
			System.out.println("Project Not created");
		}
	}

	public void readProject(){
		if(this.getProject() != null){
			this.getProject().displayProjectInfo();
			System.out.println("Project Displayed");
		}else{
			System.out.println("Project Not Displayed");
		}
	}

	public void updateProject(int id,String name,String description){
		if(id > 0 && name != null && description != null){
			this.getProject().setId(id);
			this.getProject().setName(name);
			this.getProject().setDescription(description);
			System.out.println("Project details Updated");
		}else{
			System.out.println("Enter valid details");
		}
	}

	public void deleteProject(int id){
		if(this.getProject().getId() == id){
			this.setProject(null);
			System.out.println("Project Deleted");
		}else{
			System.out.println("Enter Valid Data");
		}
	}

}