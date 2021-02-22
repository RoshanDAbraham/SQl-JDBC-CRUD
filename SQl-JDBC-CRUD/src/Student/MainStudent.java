package Student;

import java.util.Scanner;

import java.sql.SQLException;

public class MainStudent {
	public static void main(String[] args) throws SQLException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Choose The Required Operation");
			System.out.println("###############################");
			System.out.println("1:CREATE(ADD)\n2:READ(SEARCH)\n3:UPDATE(ALTER)\n4:DELETE(REMOVE)\n5:DISPLAY\n6.EXIT");
			System.out.println();

			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			System.out.println();
			while (true) {
				switch (choice) {
				case 1:
					new AddStudent().insert();
					break;

				case 2:
					new SearchStudent().search();
					break;

				case 3:
					new UpdateStudent().update();
					break;

				case 4:
					new DeleteStudent().remove();
					break;

				case 5:
					new DisplayStudent().display();
					break;
				case 6:System.out.println("THANK YOU HAVE A GOOD DAY");
					 System.exit(0);
				}

			}
		}

	}

}
