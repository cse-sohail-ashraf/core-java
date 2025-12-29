class DigitDisplayer{
	public static void main(String[] args) {
		int n = 12345;
		int t = n;
		while(t > 0){
			System.out.println(t%10);
			t /= 10;
		}
	}
}