/* Write a JAV to design and develop a java application to acheive a buisiness logic implementation of as follows
1.Number Displayer System
2.Character Displayer System
*/

class NumberDisplayerSystem{
	public static void series(int s, int e){
		if(s < e){
			System.out.println("This is a Forward Series");
			for (int i = s; i <= e; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		else if(s > e){
			System.out.println("This is a Backward Series");
			for (int i = s; i >= e; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		else{
			System.out.println("Invalid Series");
		}
	}
}