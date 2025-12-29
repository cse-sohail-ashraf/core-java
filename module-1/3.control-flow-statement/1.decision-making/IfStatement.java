class IfStatement {
	public static void main(String[] args) {
		System.out.println("statement-1");
		if(false){ // so here we are controlling the normal flow of execution i.e compiler flow analysis
			System.out.println("statement-2");
		}
		System.out.println("statement-3");
	}
}