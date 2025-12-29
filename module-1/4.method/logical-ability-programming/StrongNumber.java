import java.util.Scanner;
import java.lang.Math;

class StrongNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = n;
		int sum = 0;
		int temp = 0;
		while(t != 0){
			int p = 1;
			temp = t % 10;
			for (int i = 1; i <= temp; i++) {
				p *= i;
			}
			sum += p;
			t /= 10;
		}
		System.out.println(sum == n? "StrongNumber" : "Not StrongNumber");
	}

}