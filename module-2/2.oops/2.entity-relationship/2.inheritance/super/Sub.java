class Sub extends Super{
	public String nsv = "Sub";
	public void nsm(){
		System.out.println("nsm() from Sub Class");
	}

	public void displaySubClassInfo(){
		System.out.println(this.nsv);
		this.nsm();
	} 

	public void displaySuperClassInfo(){
		System.out.println(super.nsv);
		super.nsm();
	}
}