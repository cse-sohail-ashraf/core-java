class Car{
	private String brand;
	private String color;
	private double price;
	private String make;
	//Car HAS-A engine
	private Engine engine;
	public Car(String brand, double price, String make, String color,Engine engine){
		this.brand = brand;
		this.price = price;
		this.make = make;
		this.color = color;
		this.engine = engine;
	}
	//Car HAS-A mediaPlayer
	private MediaPlayer mediaPlayer;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getMake(){
		return make;
	}
	public void setMake(String make){
		this.make = make;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	//READ ONLY
	public Engine getEngine(){
		return engine;
	}
	//READ ONLY
	public MediaPlayer getMediaPlayer(){
		return mediaPlayer;
	}
	//WRITE ONLY	
	public void setMediaPlayer(MediaPlayer mediaPlayer){
		this.mediaPlayer = mediaPlayer;
	}
	public void displayCarInfo(){
		System.out.println("Car Details");
		System.out.println("--------------------");
		System.out.println("Brand: " + getBrand());
		System.out.println("Price: " + getPrice());
		System.out.println("Make: " + getMake());
		System.out.println("Color: " + getColor());
		System.out.println();
	}
}