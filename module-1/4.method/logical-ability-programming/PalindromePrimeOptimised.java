class PalindromePrimeOptimised{

	public static boolean isPalindrome(int n){
		int t = n;
		int rem = 0;
		int rev = 0;
		while (t != 0) {
			rem = t % 10;
			rev = (rev * 10) + rem;
			t /= 10;
		}
		return rev == n;
	}

	public static boolean isPrime(int n){
		int c = 0;
		for (int i = 2; i < n; i++) {
			if(n % i == 0) c++;
		}
		return c > 0;
	}

	public static void check(int n){
		if(isPalindrome(n)){
			if(isPalindrome(n) && isPrime(n)){
				System.out.println("Palindrome Prime");
			}else{
				System.out.println("Palindrome Composite");
			}
		}
		
	}
}