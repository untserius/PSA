package jdbc_demo_1;

import java.sql.*;

public class A {
	public static void main(String[] args) {

		try {
			//Connect To Database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct_batch_db", "root", "test");
			System.out.println(con);
			
			//Run SQL Query
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("INSERT INTO registration VALUES ('Serius', 'Bangalore', 'serius1234@gmail.com', '6475')");
			
			//Close Database Connection
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
