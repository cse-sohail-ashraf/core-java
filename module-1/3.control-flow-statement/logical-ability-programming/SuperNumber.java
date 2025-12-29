class SuperNumber{
	public static void main(String[] args) {
		int n = 1254;
		int t = n;

		int evenDigitSum = 0;
		int oddDigitSum = 0;
		int temp = 0;
		while(t != 0){
			temp = t % 10;
			if(temp % 2 == 0){
				evenDigitSum += temp;
			}else{
				oddDigitSum += temp;
			}
			t /= 10;
		}
		System.out.println(evenDigitSum == oddDigitSum? "Super Number" : "Not Super Number");
	}
}