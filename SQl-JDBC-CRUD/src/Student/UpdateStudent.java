package Student;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class UpdateStudent {
	public void update() throws SQLException {
		// step 2
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Driver d = new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);

		// step 3
		String db = "jdbc:mysql://localhost:3306/stud?user=root&password=root";

		Connection con = DriverManager.getConnection(db);

		// step 4
		String q = "UPDATE Student " + "SET Marks=? " + "WHERE ID =?";

		PreparedStatement stat = con.prepareStatement(q);

		System.out.println("ENTER ID WHOSE MARKS YOU WANT TO UPDATE");
		int id = sc.nextInt();
		System.out.println("ENTER THE NEW MARKS");
		double marks=sc.nextDouble();

		stat.setInt(1, id);
		stat.setDouble(2, marks);

		int x = stat.executeUpdate();
		if (x > 0) {
			System.out.println();
			System.out.println(" STUDENT RECORD UPDATED SUCCESFULLY");
			System.out.println();
		}
	}

}
