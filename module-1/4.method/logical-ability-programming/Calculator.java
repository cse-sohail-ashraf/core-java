import java.util.Scanner;
import java.lang.Math;

class Calculator{
	public static void main(String[] args) {
		boolean loop = true;
		Scanner sc = new Scanner(System.in);
		do{
		System.out.println("Simple Caluclator");
		System.out.println("Enter your choice: ");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.exit");
		int choice = sc.nextInt();
		
		switch(choice){
		case 1:{
			System.out.println("Enter first number");
			int a = sc.nextInt();
			System.out.println("Enter second number");
			int b = sc.nextInt();
			System.out.println(Math.addExact(a,b));
			break;
		}
		case 2:{
			System.out.println("Enter first number");
			int a = sc.nextInt();
			System.out.println("Enter second number");
			int b = sc.nextInt();
			System.out.println(Math.subtractExact(a,b));
			break;
		}
		case 3:{
			System.out.println("Enter first number");
			int a = sc.nextInt();
			System.out.println("Enter second number");
			int b = sc.nextInt();
			System.out.println(Math.multiplyExact(a,b));
			break;
		}
		case 4:{
			System.out.println("Enter first number");
			int a = sc.nextInt();
			System.out.println("Enter second number");
			int b = sc.nextInt();
			System.out.println(Math.floorMod(a,b));
			break;
		}
		case 5:{
			loop = false;
			break;
		}
		default:{
			System.out.println("Invalid choice. Please try again!");
			continue;
		}
		}
		}while(loop);
	}
}