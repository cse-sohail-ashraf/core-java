class College{
	private int id;
	private String name;
	private String dean;
	private Department department;
	public College(){
	}
	public College(int id,String name,String dean,Department department){
		this.id = id;
		this.name = name;
		this.dean = dean;
		this.department = department;
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
	public String getDean(){
		return dean;
	}
	public void setDean(String dean){
		this.dean = dean;
	}
	public Department getDepartment(){
		return department;
	} 
	public void setDepartment(Department department){
		this.department = department;
	}
	public void displayCollegeInfo(){
		System.out.println("College Info");
		System.out.println("------------");
		System.out.println("Id: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Dean: " + getDean());
		System.out.println();
	}

	public void readDepartment(){
		if(this.getDepartment() != null){
			this.getDepartment().displayDepartmentInfo();
			System.out.println("Department displayed");
		}else{
			System.out.println("Department not displayed");
		}
	}

	public void updateDepartment(int id,String name,String hod,int countOfFaculty){
		if(id > 0 && name != null && hod != null && countOfFaculty > 0){
			this.getDepartment().setId(id);
			this.getDepartment().setName(name);
			this.getDepartment().setHod(hod);
			this.getDepartment().setCountOfFaculty(countOfFaculty);
			System.out.println("Department updated");
		}else{
			System.out.println("Department not updated");
		}
	}

	public void deleteDepartment(int id){
		if(id > 0){
			this.setDepartment(null);
			System.out.println("Department deleted");
		}else{
			System.out.println("Department not deleted");
		}
	}

}