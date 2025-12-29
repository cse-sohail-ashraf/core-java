class NumberVerifierSystem{
	public static void main(String[] args) {
		int num = 5;
		if(num > 0){
			System.out.println(num%2==0 ? "Positive even number" : "Positive odd number");
		}else if(num < 0){
			System.out.println(num%2==0 ? "Negative even number" : "Negative odd number");
		}else{
			System.out.println("Neutral");
		}
	}
}