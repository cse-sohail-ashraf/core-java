import java.util.Scanner;

class WAPCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = sc.nextInt();
		if(num > 0){
		for (int i = 1; i < num; i++) {
			if(num % i == 0){
				sum += i;
			}
		}
		if(sum < num){
			System.out.println("The num is deficient Number");
		}else if (sum > num){
			System.out.println("The num is abundant Number");
		}else{
			System.out.println("The num is Perfect number");
		}
		}
	}
}