class SpyNumber{
	public static void main(String[] args) {
		int n = 22;
		int t = n;

		int temp = 0;
		int digitSum = 0;
		int digitProduct = 1;
		while(t != 0){
			temp = t % 10;
			digitSum += temp;
			digitProduct *= temp;
			t /= 10;
		}
		System.out.println(digitSum == digitProduct? "Spy Number" : "Not Spy Number");
	}
}