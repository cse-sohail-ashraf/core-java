import java.util.Scanner;

class Palindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = n;
		int rem = 0;
		int rev = 0;
		while(t != 0){
			rem = t % 10;
			rev = (rev * 10) + rem;
			t /= 10;
		}
		System.out.println(rev == n ? "Palindrome" : "Not Palindrome");
	}
}