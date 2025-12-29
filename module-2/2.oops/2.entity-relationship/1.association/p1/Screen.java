public class Screen{
	private String type;
	private String resolution;
	public Screen(String type,String resolution){
		this.type = type;
		this.resolution = resolution;
	}

	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getResolution(){
		return resolution;
	}
	public void setResolution(String resolution){
		this.resolution = resolution;
	}

	public void displayScreenInfo(){
		System.out.println("type: " + getType());
		System.out.println("resolution: " + getResolution());
	}

}