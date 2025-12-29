import java.util.Scanner;

class Multiplication{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		if(s < e){
			for(int i = s; i <= e; i++){
				if(i % 2 == 0){
					for(int j = 1; j <= e; j++){
					System.out.println(i + " * " + j + " = " + (i*j));
					}
				}	
			}
		}
		else if(s > e){
			for(int i = s; i >= e; i--){
				if(i % 2 != 0){
					for(int j = 10; j >= 1; j--){
					System.out.println(i + " * " + j + " = " + (i*j));
					}
				}
			}
		}
	}
}