class MySQL extends Database{
	public void displayMySQLDBInfo(){
		System.out.println("MySQL DB Details");
		System.out.println("-----------------");
		System.out.println("URL: " + url);
		System.out.println("User Name: " + username);
		System.out.println("Password: " + password);
		System.out.println();
	}

	public void crudOperation(){
		System.out.println("System Generated Queries");
	}
}