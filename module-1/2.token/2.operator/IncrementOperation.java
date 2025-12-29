class IncrementOperation{
	public static void main(String[] args) {
		int i = 10;
		System.out.println("The content of is: " + i);
		
		int j = 20;
		System.out.println("The content of j is: " + j);

		int inc = ++i - j++ + i++ - ++j;
		System.out.println("Content of inc is: " + inc);

		System.out.println();
		System.out.println("The content of i is: " + i);
		System.out.println("The content of j is: " + j);
	}
}