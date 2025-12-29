public class MediaPlayer{
	private String brand;
	private double price;
	private String make;
	public MediaPlayer(String brand, double price, String make){
		this.brand = brand;
		this.price = price;
		this.make = make;
	}
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
	public void displayMediaPlayerInfo(){
		System.out.println("Media Player Details");
		System.out.println("--------------------");
		System.out.println("Brand: " + getBrand());
		System.out.println("Price: " + getPrice());
		System.out.println("Make: " + getMake());
		System.out.println();
	}
}