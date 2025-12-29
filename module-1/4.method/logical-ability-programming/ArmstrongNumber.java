import java.util.Scanner;
import java.lang.Math;

class ArmstrongNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = n;
		int t1 = n;
		int sum = 0;
		int c = 0;
		while(t != 0){
			int temp = t % 10;
			c++;
			t /= 10;
		}

		while(t1 != 0){
			int temp = t1 % 10;
			sum += Math.pow(temp,c);
			t1 /= 10;
		}
		System.out.println(n == sum? "ArmstrongNumber" : "Not ArmstrongNumber");
	}
}