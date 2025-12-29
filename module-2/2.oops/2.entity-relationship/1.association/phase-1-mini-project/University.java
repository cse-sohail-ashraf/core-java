class University{
	private int id;
	private String name;
	private String grade;
	private String establishedYear;
	private College college;
	public University(){
	}
	public University(int id,String name,String grade,String establishedYear){
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.establishedYear = establishedYear;
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
	public String getGrade(){
		return grade;
	}
	public void setGrade(String grade){
		this.grade = grade;
	}
	public String getEstablishedYear(){
		return establishedYear;
	}
	public void setEstablishedYear(String establishedYear){
		this.establishedYear = establishedYear;
	}
	public College getCollege(){
		return college;
	}
	public void setCollege(College college){
		this.college = college;
	}
	public void displayUniversityInfo(){
		System.out.println("University Info");
		System.out.println("---------------");
		System.out.println("Id: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Grade: " + getGrade());
		System.out.println("Established Year: " + getEstablishedYear());
	}

	public void createCollege(College college){
		if(this.getCollege() == null && college != null){
			this.setCollege(college);
			System.out.println("College has been created");
		}else{
			System.out.println("College has not created");
		}
	}

	public void readCollege(){
		if(this.getCollege() != null){
			this.getCollege().displayCollegeInfo();
			System.out.println("College Info Displayed");
		}else{
			System.out.println("No College Found");
		}
	}

	public void updateCollege(int id,String name,String dean){
		if(id > 0 && name != null){
			this.getCollege().setId(id);
			this.getCollege().setName(name);
			this.getCollege().setDean(dean);
			System.out.println("College details Updated");
		}else{
			System.out.println("Enter correct data");
		}
	}

	public void deleteCollege(int id){
		if(id > 0){
			this.setCollege(null);
			System.out.println("College record deleted");
		}else{
			System.out.println("Enter correct data");
		}
	}
}