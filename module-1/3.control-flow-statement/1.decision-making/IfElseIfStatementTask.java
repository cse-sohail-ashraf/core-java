class IfElseIfStatementTask{
	public static void main(String[] args) {
		char signal = 'u';
		if((signal == 'r') || (signal == 'R')){
			System.out.println("Please Stop! Have some patience");
		}
		else if((signal == 'y') || (signal == 'Y')){
			System.out.println("Please get ready! Have some excitement");
		}
		else if((signal == 'g') || (signal == 'G')){
			System.out.println("Please Get Lost! Have some ethics");
		}else{ 
			System.out.println("Do whatever you want!");
		}
	}
}