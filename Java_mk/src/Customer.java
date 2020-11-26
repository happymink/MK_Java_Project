import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Customer {
	
	public static void main(String[] args) {
		getConnection();
	}
	
	
	public static void createTable() {
		try {
			Connection con = getConnection();
			PreparedStatement createTable = con.prepareStatement("CREATE TABLE IF NOT EXISTS" + "");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static Connection getConnection() {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://sql9.freemysqlhosting.net:3306/sql9378160";
			String user = "sql9378160";
			String pass = "bzNBtxhc3f";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("The Connection Succesful");
			return con;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
