import java.util.Scanner;

class JavaApplication{
	public static void execute(){
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the starting point of int type: ");
		// int s = sc.nextInt();
		// System.out.println("Enter the ending point of int type: ");
		// int e = sc.nextInt();
		// NumberDisplayerSystem.series(s,e);
		// char s = sc.next().charAt(0);
		// char e = sc.next().charAt(0);
		// CharacterDisplayerSystem.series(s,e);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// C.run(n);
		Disarium.check(n);
	}
}