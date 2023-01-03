import java.sql.*;

public class Program {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("load complate");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root", "4569");
			System.out.println("success");
			Statement stmt = con.createStatement();
		}catch(ClassNotFoundException e) {
			System.err.println("load err: " + e.getMessage());
		}catch(SQLException se) {
			System.err.println("SQL err: " + se.getMessage());
		}
	}
}
