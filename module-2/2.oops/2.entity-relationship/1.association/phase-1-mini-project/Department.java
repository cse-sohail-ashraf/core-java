class Department{
	private int id;
	private String name;
	private String hod;
	private int countOfFaculty;
	private Student student;

	public Department(){
	}
	public Department(int id,String name,String hod,int countOfFaculty){
		this.id = id;
		this.name = name;
		this.hod = hod;
		this.countOfFaculty = countOfFaculty;
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
	public String getHod(){
		return hod;
	}
	public void setHod(String hod){
		this.hod = hod;
	}
	public int getCountOfFaculty(){
		return countOfFaculty;
	}
	public void setCountOfFaculty(int countOfFaculty){
		this.countOfFaculty = countOfFaculty;
	}
	public Student getStudent(){
		return student;
	}
	public void setStudent(Student student){
		this.student = student;
	}

	public void displayDepartmentInfo(){
		System.out.println("Department Details: ");
		System.out.println("-----------------");
		System.out.println("Id: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("HOD: " + getHod());
		System.out.println("No of Faculty: " + getCountOfFaculty());
	}

	public void createStudent(Student student){
		if(this.getStudent() == null && student != null){
			this.setStudent(student);
			System.out.println("Student has been created");
		}else{
			System.out.println("Student has not created");
		}
	}

	public void readStudent(){
		if(this.getStudent() != null){
			this.getStudent().displayStudentInfo();
			System.out.println("Student Info Displayed");
		}else{
			System.out.println("No Student Found");
		}
	}

	public void updateStudent(int id,String name){
		if(id > 0 && name != null){
			this.getStudent().setId(id);
			this.getStudent().setName(name);
			System.out.println("Student details Updated");
		}else{
			System.out.println("Enter correct data");
		}
	}

	public void deleteStudent(int id){
		if(id > 0){
			this.setStudent(null);
			System.out.println("Student record deleted");
		}else{
			System.out.println("Enter correct data");
		}
	}
}