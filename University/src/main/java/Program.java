import java.sql.*;

public class Program {
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/university?serverTimezone=UTC";
			String sql = "SELECT * FROM student";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "4569");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int score = rs.getInt("score");
				System.out.printf("%d\t%s\t%d%s", id, name, score, System.lineSeparator());
			}
			
			rs.close();
			st.close();
			con.close();
		}catch(ClassNotFoundException e) {
			System.err.println("load err: " + e.getMessage());
		}catch(SQLException se) {
			System.err.println("SQL err: " + se.getMessage());
		}
	}
}
