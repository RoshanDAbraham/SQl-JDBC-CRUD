package Student;

import java.sql.*;
import java.util.Scanner;

public class AddStudent {
	public void insert() throws SQLException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Driver d = new com.mysql.jdbc.Driver();

		// step 2
		DriverManager.registerDriver(d);

		// step 3
		String db = "jdbc:mysql://localhost:3306/stud?user=root&password=root";
		Connection con = DriverManager.getConnection(db);

		// step 4
		String q = "INSERT into Student values(?,?,?,?,?,?,?,?,?,?)"; // dynamic query

		PreparedStatement stat = con.prepareStatement(q);

		System.out.println("ENTER THE NUMBER OF RECORDS YOU WANT TO ADD");
		int number = sc.nextInt();
		System.out.println();
		int j = 1;

		for (int i = 0; i < number; i++) {
			System.out.println("ENTER  THE STUDENT " + j + " Details");

			System.out.println("Enter The ID");
			int id = sc.nextInt();

			stat.setInt(1, id);

			System.out.println("Enter the FirstName");
			sc.nextLine();
			String fname = sc.nextLine();
			stat.setString(2, fname);

			System.out.println("Enter the lastName");
			String lname = sc.nextLine();
			stat.setString(3, lname);

			System.out.println("Enter the PhNo");
			String mobile = sc.next();
			stat.setString(4, mobile);

			System.out.println("Enter the Address");
			sc.nextLine();
			String address = sc.nextLine();
			stat.setString(5, address);

			System.out.println("Enter the Marks");
			double marks = sc.nextInt();
			stat.setDouble(6, marks);

			System.out.println("Enter the Gender");
			sc.nextLine();
			String gender = sc.nextLine();

			stat.setString(7, gender);

			System.out.println("Enter the dob");
			String dob = sc.nextLine();

			stat.setString(8, dob);

			System.out.println("Enter the Branch");
			String branch = sc.nextLine();

			stat.setString(9, branch);

			System.out.println("Enter the Description");
			String desc = sc.nextLine();

			stat.setString(10, desc);

			int x = stat.executeUpdate();
			if (x > 0) {
				System.out.println();
				System.out.println(" STUDENT RECORD Added successfully");
				System.out.println();
			}

			j++;

		}
	}

}
