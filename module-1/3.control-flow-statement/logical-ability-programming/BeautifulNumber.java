class BeautifulNumber{
	public static void main(String[] args) {
		int n = 12345;
		int t = n;

		int temp = 0;
		int evenCount = 0;
		int oddCount = 0;
		while(t != 0){
			temp = t % 10;
			if(temp % 2 == 0){
				evenCount++;
			}else{
				oddCount++;
			}
			t /= 10;
		}
		System.out.println("Count of Even Digits are: " + evenCount);
		System.out.println("Count of Odd Digits are: " + oddCount);
		System.out.println(evenCount == oddCount? "Beautiful Number" : "Not Beautiful Number");
	}
}