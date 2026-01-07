class JavaApplication{
	public static void execution(){
		Son son = new Son();
		son.career();
		// son.marriage(); //won't work as this method is final in super class
	}
}