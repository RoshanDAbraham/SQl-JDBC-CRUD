package Student;

import java.sql.*;

public class DisplayStudent {
	public void display() throws SQLException {
		// step 2
		Driver d = new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);

		// step 3
		String db = "jdbc:mysql://localhost:3306/stud?user=root&password=root";
		Connection con = DriverManager.getConnection(db);

		// step4
		String q = "SELECT * from Student";

		Statement stat = con.createStatement();

		ResultSet r = stat.executeQuery(q);

		System.out.println(
				"ID \t FirstName \t LastName \t PhNo \t Address \t Marks \t Gender \t DOB \t Branch \t Description");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------");

		while (r.next()) 
		{
			System.out.print(r.getInt(1) + "	");
			System.out.print(r.getString(2) + "	 ");
			System.out.print(r.getString(3) + " 	");
			System.out.print(r.getString(4) + " 	");
			System.out.print(r.getString(5) + " 	");
			System.out.print(r.getDouble(6) + " 	");
			System.out.print(r.getString(7) + " 	");
			System.out.print(r.getString(8) + " 	");
			System.out.print(r.getString(9) + " 	");
			System.out.print(r.getString(10) + " 	");
			System.out.println();
			System.out.println();
		}
       con.close();
	}

}
