class SwitchCaseStatement{
	public static void main(String[] args) {
		System.out.println("statement-1");
		char choice = 'c';
		switch(choice) {
		case 'a' :{
			System.out.println("statement-2");
			break;
		}
		case 'b': {
			System.out.println("statement-3");
			break;
		}
		case 'c': {
			System.out.println("statement-4");
			break;
		}
		default: {
			System.out.println("statement-5");
		}
		}
		System.out.println("statement-6");
	}
}