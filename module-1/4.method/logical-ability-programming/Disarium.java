class Disarium{
	public static void check(int n){
		int c = count(n);
		int t = n;
		int sum = 0;
		int temp = 0;
		while(t != 0){
			temp = t % 10;
			sum += Math.pow(temp,c);
			c--;
			t /= 10;
		}
		System.out.println(n == sum? "Disarium" : "Not Disarium");
	}

	public static int count(int n){
		int t = n;
		int c = 0;
		while(t != 0){
			t /= 10;
			c++;
		}
		return c;
	}
}