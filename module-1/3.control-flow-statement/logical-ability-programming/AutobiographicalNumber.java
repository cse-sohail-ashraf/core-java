class AutobiographicalNumber{
	public static void main(String[] args) {
		int n = 201;
		int t = n;

		int digitCount = 0;
		int digitSum = 0;
		while(t != 0){
			digitSum += (t % 10);
			t = t / 10;
			digitCount++;
		}
		System.out.println(digitCount==digitSum? "Autobiographical Number": "Not Autobiographical Number");
	}
}