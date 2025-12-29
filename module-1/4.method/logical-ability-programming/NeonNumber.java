import java.util.Scanner;

class NeonNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = n*n;
		int t = n2;
		int sum = 0;
		while(t != 0){
			sum += t%10;
			t /= 10;
		}
		System.out.println(sum == n? "NeonNumber" : "Not NeonNumber");
	}
}