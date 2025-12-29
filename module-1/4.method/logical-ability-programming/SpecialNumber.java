import java.util.Scanner;

class SpecialNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = n;
		int sum = 0;
		int product = 1;
		int temp = 0;
		while(t != 0){
			temp = t % 10;
			sum += temp;
			product *= temp;
			t /= 10;
		}
		System.out.println(n == (sum+product)? "SpecialNumber" : "Not SpecialNumber");
	}
}