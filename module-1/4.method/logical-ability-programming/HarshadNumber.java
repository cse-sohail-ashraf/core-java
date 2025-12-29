import java.util.Scanner;

class HarshadNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = n;
		int sum = 0;
		while(t != 0){
			sum += t%10;
			t /= 10;
		}
		System.out.println(n%sum==0? "HarshadNumber" : "Not HarshadNumber");
	}
}