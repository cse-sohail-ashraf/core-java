import java.util.Scanner;

class PrimeOrComposite{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n > 0){
		int c = 0;
		for(int i = 2; i < n; i++){
			if(n % i == 0) c++;
		}
		System.out.println((c > 0)? "Composite" : ((n == 1) ? "Neither prime nor composite" : "Prime"));
		}
	}
}