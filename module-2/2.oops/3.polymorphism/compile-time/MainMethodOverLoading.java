class MainMethodOverLoading{
	public static void main(String[] args) {
		System.out.println("main(String agrs[])");
	}
	public static void main(char c) {
		System.out.println("main(c)");
	}
	public static void main() {
		System.out.println("main()");
	}
}