import java.util.Scanner;

public class JavaApplication1{
	public static Employee e;
	public static void execute(){
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop){
			System.out.println("Select choice: ");
			System.out.println("---------------");
			System.out.println("1.create: ");
			System.out.println("2.read: ");
			System.out.println("3.update");
			System.out.println("4.delete");
			System.out.println("5.Exit");
			int choice = sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Give Id: ");
				int id = sc.nextInt();
				System.out.println("Give name: ");
				String name = sc.next();
				e = new Employee(id,name);
				break;
			case 2:
				System.out.println(e.getId());
				System.out.println(e.getName());
				break;
			case 3:
				System.out.println("Enter id: ");
				id = sc.nextInt();
				e.setId(id);
				System.out.println("Enter name: ");
				name = sc.next();
				e.setName(name);
				break;
			case 4:
				e = null;
				break;
			case 5:
				loop = false;
				break;
			default:
				System.out.println("Invalid choice. Please Try Again!");
			}
		}
	}
}