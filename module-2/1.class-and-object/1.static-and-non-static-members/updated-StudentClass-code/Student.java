class Student{
	int id;
	String name;
	String mailId;
	long contactNumber;
	static String city;
	static String state;
	static String country;
	static{
		city = "Bengaluru";
		state = "Karnataka";
		country = "India";
	}
	{
		id = 101;
		name = "sohail";
		mailId = "sohail.rcom6@gmail.com";
		contactNumber = 1234567890;
	}
	public void displayDetails(){
		System.out.println("Student Details");
		System.out.println("----------------");
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Mail Id: " + mailId);
		System.out.println("Contact Number: " + contactNumber);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		System.out.println("Country: " + country);
	}
}