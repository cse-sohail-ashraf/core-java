import java.util.Scanner;

class PalindromePrime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t1 = n;
		int t2 = n;
		int rem = 0;
		int rev = 0;
		while(t1 != 0){
			rem = t1 % 10;
			rev = (rev * 10) + rem;
			t1 /= 10;
		}

		if(rev == n){
			int c = 0;
			for(int i = 2; i < rev; i++){
				if(rev % i == 0) c++;
			}
			System.out.println(c == 0? "PalindromePrime" : "PalindromeComposite");
		}else{
			System.out.println("Not a Palindrome");
		}
	}
}