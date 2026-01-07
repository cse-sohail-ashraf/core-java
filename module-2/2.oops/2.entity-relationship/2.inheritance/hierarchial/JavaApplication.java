class JavaApplication{
	public static void execution(){
		Oracle oracle = new Oracle();
		oracle.url = "www.OracleDb.com";
		oracle.username = "Raja";
		oracle.password = "Raja@143";
		oracle.displayOracleDBInfo();
		oracle.connection();
		oracle.crudOperation();
		oracle.disconnection();

		MySQL mySQL = new MySQL();
		mySQL.url = "www.MySQLDb.com";
		mySQL.username = "Rani";
		mySQL.password = "Rani@143";
		mySQL.displayMySQLDBInfo();
		mySQL.connection();
		mySQL.crudOperation();
		mySQL.disconnection();
	}
}