class Oracle extends Database{
	public void displayOracleDBInfo(){
		System.out.println("Oracle DB Details");
		System.out.println("-----------------");
		System.out.println("URL: " + url);
		System.out.println("User Name: " + username);
		System.out.println("Password: " + password);
		System.out.println();
	}

	public void crudOperation(){
		System.out.println("Programmer Generated Queries");
	}
}