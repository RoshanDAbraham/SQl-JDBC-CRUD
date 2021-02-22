package Student;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class DeleteStudent {
	public void remove() throws SQLException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// step 2
		Driver d = new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);

		// step 3
		String db = "jdbc:mysql://localhost:3306/stud?user=root&password=root";
		java.sql.Connection con = DriverManager.getConnection(db);
		while (true) {

			System.out.println("CHOOSE DELETION CRITERIA");
			System.out.println("1:ID\n2:FIRSTNAME\n3:PhNo\n4:EXIT");
			System.out.println();
			System.out.println("ENTER YOUR CHOICE");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				String q1 = "DELETE from Student WHERE ID=?";
				PreparedStatement stmt1 = con.prepareStatement(q1);
				System.out.println("ENTER THE STUDENT ID TO DELETE");
				int id = sc.nextInt();

				stmt1.setInt(1, id);
				stmt1.executeUpdate();
				System.out.println();
				System.out.println("##Deleted successfully##");
				System.out.println();
				break;

			case 2:
				String q2 = "DELETE from Student WHERE FirstName=?";
				PreparedStatement stmt2 = con.prepareStatement(q2);
				System.out.println("ENTER FIRSTNAME OF  STUDENT TO DELETE");
				sc.nextLine();
				String fname = sc.nextLine();

				stmt2.setString(1, fname);
				stmt2.executeUpdate();
				System.out.println();
				System.out.println("##Deleted successfully##");
				System.out.println();
				break;

			case 3:
				String q3 = "DELETE from Student WHERE PhNo=?";
				PreparedStatement stmt3 = con.prepareStatement(q3);
				System.out.println("ENTER THE STUDENT PhNO TO DELETE");
				String mobile = sc.next();

				stmt3.setString(1, mobile);
				stmt3.executeUpdate();
				System.out.println();
				System.out.println("##Deleted successfully##");
				System.out.println();
				break;

			case 4:
				System.out.println("THANK YOU HAVE A GOOD DAY!!!!!!!!!");
				return;

			}

		}

	}

}
