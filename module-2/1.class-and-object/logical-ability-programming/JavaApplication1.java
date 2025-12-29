import java.util.Scanner;

class JavaApplication1{
	public static void execute(){
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		Student s = new Student();
		while(loop){
			System.out.println("Student Details");
			System.out.println("----------------");
			System.out.println("Select a choice: ");
			System.out.println("1. Create student record: ");
			System.out.println("2. Insert student details: ");
			System.out.println("3. Read student details: ");
			System.out.println("4. Update student daetails");
			System.out.println("5. Delete student record: ");
			System.out.println("6. Exit");
			int choice = sc.nextInt();
			switch(choice){
			case 1:
				s.create(s.id);
				break;
			case 2:
				System.out.println("Give details: ");
				System.out.println();
				s.name = sc.next();
				s.contactNo = sc.nextLong();
				s.batch = sc.nextInt();
				s.insert();
				break;
			case 3:
				s.read();
				System.out.println(s.id);
				System.out.println(s.name);
				System.out.println(s.contactNo);
				System.out.println(s.batch);
				break;
			case 4:
				s.update();
				int c = sc.nextInt();
				if(c == 1) s.name = sc.next();
				if(c == 2) s.contactNo = sc.nextLong();
				if(c == 3) s.batch = sc.nextInt();
				if(c == 4){
					s.name = sc.next();
					s.contactNo = sc.nextLong();
					s.batch = sc.nextInt();
				}
				break;
			case 5:
				int c1 = sc.nextInt();
				if(c1 == 1) s.name = null;
				if(c1 == 2) s.contactNo = 0;
				if(c1 == 3) s.batch = 0;
				if(c == 4){
					s.name = null;
					s.contactNo = 0;
					s.batch = 0;
				}
				break;
			case 6:
				loop = false;
				break;
			default:
				System.out.println("Invalid choice");
			}

		}
		
	}
}