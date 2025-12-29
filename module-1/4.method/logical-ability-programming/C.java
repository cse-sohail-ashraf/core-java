import java.util.Scanner;
import java.lang.Math;

class C{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		C c1 = new C();
		System.out.println(c1.isRamanujan(n));
	}

	public boolean isRamanujan(int n){
		int t1 = n;
		int sum = 0;
		while(t1 != 0){
			sum += t1 % 10;
			t1 /= 10;
		}
		return reverse(sum)*sum==n;
	}

	public int reverse(int sum){
		int t1 = sum;
		int rem = 0;
		int rev = 0;
		while(t1 != 0){
			rem = t1 % 10;
			rev = (rev * 10) + rem;
			t1 /= 10;
		}
		return rev;
	}
}