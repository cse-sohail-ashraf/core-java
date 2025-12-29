class ArithmeticOperation{
	public static void addition(int i, int j) {
		System.out.println("Content of i is: " + i);
		System.out.println("Content of j is: " + j);
		int res = i + j;
		System.out.println("addition of "+i+" and "+j+" is: "+res);
		System.out.println();
	}

	public static void subtraction(int i, int j){
		System.out.println("Content of i is: " + i);
		System.out.println("Content of j is: " + j);
		int res = i - j;
		System.out.println("subtraction of "+i+" and "+j+" is: "+res);
		System.out.println();
	}

	public static void multiplication(int i, int j){
		System.out.println("Content of i is: " + i);
		System.out.println("Content of j is: " + j);
		int res = i * j;
		System.out.println("Multiplication of "+i+" and "+j+" is: "+res);
		System.out.println();
	}

	public static void division(int i, int j){
		System.out.println("Content of i is: " + i);
		System.out.println("Content of j is: " + j);
		int res = i / j;
		System.out.println("Division of "+i+" and "+j+" is: "+res);
		System.out.println();
	}
}