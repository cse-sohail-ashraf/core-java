import java.util.Scanner;

class CharacterDisplayerSystem{
	public static void series(char s,char e) {
		Scanner sc = new Scanner(System.in);
		if(s < e){
			for (char c = s; c <= e; c++) {
				System.out.print(c + " ");
			}
		}
		else if(s > e){
			for(char c = s; c >= e; c--){
				System.out.print(c + " ");
			}
		}else{
			System.out.println("Invalid Series");
		}

	}
}