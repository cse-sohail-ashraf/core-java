class ConditionalOperation{
	public static void main(String[] args) {
		int i = 10;
		System.out.println("Content of i is: " + i);

		int j = 5;
		System.out.println("Content of j is: " + j);

		boolean c = i > j;
		System.out.println("Content of c is: " + c);

		int res = c? (i+j) : (i-j); // Indirect utilization of c
		System.out.println("Content of res is: " + res);	

		// char res1 = c ? 'T' : "False"; // will return an error cuz of diff data type
		// System.out.println("Content of res1 is: " + res1);

		System.out.println(c?'T':"False"); // This will run even with diff data tyopes cuz of direct utilization
	}
}