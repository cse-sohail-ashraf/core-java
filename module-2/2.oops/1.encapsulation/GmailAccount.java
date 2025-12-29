public class GmailAccount{
	private String firstName;
	private String lastName;
	private long contactNumber;
	private String mailId;
	private String password;

	public GmailAccount(String firstName,String lastName,long contactNumber,String mailId,String password){
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.mailId = mailId;
		this.password = password;
	}

	// getters
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public long getContactNumber(){
		return contactNumber;
	}
	public String getMailId(){
		return mailId;
	}
	public String getPassword(){
		return password;
	}

	// setters
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setContactNumber(long contactNumber){
		this.contactNumber = contactNumber;
	}
	public void setPassword(String password){
		this.password = password;
	}

	

}