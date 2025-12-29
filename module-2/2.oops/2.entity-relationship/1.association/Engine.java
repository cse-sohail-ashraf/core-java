class Engine{
	private double cc;
	private int hp;
	private int cylinderCount;
	public Engine(double cc,int hp,int cylinderCount){
		this.cc = cc;
		this.hp = hp;
		this.cylinderCount = cylinderCount;
	}
	public double getCc(){
		return cc;
	}
	public int getHp(){
		return hp;
	}
	public int getCylinderCount(){
		return cylinderCount;
	}
	public void displayEngineInfo(){
		System.out.println("Engine details: ");
		System.out.println("----------------");
		System.out.println("CC: " + getCc());
		System.out.println("HP: " + getHp());
		System.out.println("Cylinder Count: " + getCylinderCount());
		System.out.println();
	}
	
}