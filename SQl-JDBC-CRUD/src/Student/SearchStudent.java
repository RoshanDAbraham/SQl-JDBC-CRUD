package Student;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class SearchStudent {

	public void search() throws SQLException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// step 2
		Driver d = new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);

		// step 3
		String db = "jdbc:mysql://localhost:3306/stud?user=root&password=root";
		java.sql.Connection con = DriverManager.getConnection(db);

		// step4

		while (true) {

			System.out.println("CHOOSE THE SEARCH CRITERIA");
			System.out.println("1:ID\n2:FIRSTNAME\n3:PhNo\n4:Exit");
			System.out.println();
			System.out.println("ENTER YOUR CHOICE");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				String q = "SELECT ID,FirstName,LastName,PhNo,Address,Marks,Gender,DOB,Branch,Description from Student WHERE ID=?";
				PreparedStatement stmt = con.prepareStatement(q);
				System.out.println("Enter the id whose data to be found");
				int id = sc.nextInt();

				stmt.setInt(1, id);

				ResultSet r = stmt.executeQuery();
				System.out.println(
						"ID \t FirstName \t\t LastName \t PhNo \t Address \t Marks \t Gender \t DOB \t Branch \t Description");
				System.out.println(
						"-----------------------------------------------------------------------------------------------------------------");
				while (r.next()) {
					System.out.print(r.getInt(1) + "       ");
					System.out.print(r.getString(2) + "       ");
					System.out.print(r.getString(3) + "          ");
					System.out.print(r.getString(4) + "           ");
					System.out.print(r.getString(5) + "         ");
					System.out.print(r.getDouble(6) + "           ");
					System.out.print(r.getString(7) + "        ");
					System.out.print(r.getString(8) + "          ");
					System.out.print(r.getString(9) + "          ");
					System.out.print(r.getString(10) + "         ");
					System.out.println();
					System.out.println();

				}

				break;

			case 2:
				String q1 = "SELECT ID,FirstName,LastName,PhNo,Address,Marks,Gender,DOB,Branch,Description from Student WHERE FirstName=?";
				PreparedStatement stmt1 = con.prepareStatement(q1);
				System.out.println("ENTER THE FIRST NAME OF STUDENT");
				sc.nextLine();
				String fname = sc.nextLine();

				stmt1.setString(1,fname );

				ResultSet r1 = stmt1.executeQuery();
				System.out.println(
						"ID \t FirsttName \t\t LastName \t PhNo \t Address \t Marks \t Gender \t DOB \t Branch \t Description");
				System.out.println(
						"-----------------------------------------------------------------------------------------------------------------");
				while (r1.next()) {
					System.out.print(r1.getInt(1) + "       ");
					System.out.print(r1.getString(2) + "       ");
					System.out.print(r1.getString(3) + "          ");
					System.out.print(r1.getString(4) + "           ");
					System.out.print(r1.getString(5) + "         ");
					System.out.print(r1.getDouble(6) + "           ");
					System.out.print(r1.getString(7) + "        ");
					System.out.print(r1.getString(8) + "          ");
					System.out.print(r1.getString(9) + "          ");
					System.out.print(r1.getString(10) + "         ");
					System.out.println();
					System.out.println();

				}

				break;

			case 3:
				String q2 = "SELECT ID,FirstName,LastName,PhNo,Address,Marks,Gender,DOB,Branch,Description from Student WHERE PhNo=?";

				PreparedStatement stmt2 = con.prepareStatement(q2);
				System.out.println("ENTER STUDENT PhNo");
				String mobile = sc.next();

				stmt2.setString(1, mobile);

				ResultSet r2 = stmt2.executeQuery();
				System.out.println(
						"ID \t FirstName \t\t LastName \t PhNo \t Address \t Marks \t Gender \t DOB \t Branch \t Description");
				System.out.println(
						"-----------------------------------------------------------------------------------------------------------------");
				while (r2.next()) {
					System.out.print(r2.getInt(1) + "       ");
					System.out.print(r2.getString(2) + "       ");
					System.out.print(r2.getString(3) + "          ");
					System.out.print(r2.getString(4) + "           ");
					System.out.print(r2.getString(5) + "         ");
					System.out.print(r2.getDouble(6) + "           ");
					System.out.print(r2.getString(7) + "        ");
					System.out.print(r2.getString(8) + "          ");
					System.out.print(r2.getString(9) + "          ");
					System.out.print(r2.getString(10) + "         ");
					System.out.println();
					System.out.println();

				}

				break;

			case 4:
				System.out.println("THANK YOU HAVE A GOOD DAY!!!!!");
				System.out.println();
				return;

			}

		}
	}
}