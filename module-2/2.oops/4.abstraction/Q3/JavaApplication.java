class JavaApplication{
	public static void execution(){
		System.out.println(SuperInterface.c);
		SuperInterface.sm();

		System.out.println();
		System.out.println(SubConcreteClass.c);

		SubConcreteClass subConcreteClass = new SubConcreteClass();
		subConcreteClass.nsm();
	}
}