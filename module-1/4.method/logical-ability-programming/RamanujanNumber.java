class RamanujanNumber{
	public static void check(int n) {
		int t = n;
		int sum = 0;
		while(t != 0){
			sum += t % 10;
			t /= 10;
		}
		System.out.println(reverse(sum) == n? "RamanujanNumber" : "Not RamanujanNumber");
	}

	public static int reverse(int sum){
		int t = sum;
		int rem = 0;
		int rev = 0;
		while(t != 0){
			rem = t % 10;
			rev = (rev * 10) + rem;
			t /= 10;
		}
		return sum*rev;
	}

}