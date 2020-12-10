import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SellDB {

	
	public static String [][] getlist(){
		try {
			Connection con = getConnection();
			PreparedStatement statement =con.prepareStatement("Select name, price, date FROM SellList" );
			ResultSet results = statement.executeQuery();
			ArrayList<String[]> list = new ArrayList<String[]>();		//2차 배열 array list로 변환

			while(results.next()) {
				list.add(new String[] {
						results.getString("name"),
						results.getString("price"),
						results.getString("date")}
				);
				
			
				
			}
			String[][] arr = new String[list.size()][3]; 
			return list.toArray(arr);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		return null;
	}
	
	public static void createList(String name, String price, String date) {
		try {
			Connection con = getConnection();
			PreparedStatement insert  = con.prepareStatement(""
					+ "INSERT INTO SellList"
					+"(name, price, date) "
					+ "VALUE "
					+"('" +name+"','"+price+"','"+date+"')");
			insert.executeUpdate();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void createTable() {
		try {
			Connection con = getConnection();
			PreparedStatement createTable = con.prepareStatement(
					"CREATE TABLE IF NOT EXISTS " 
					+"SellList(id int NOT NULL AUTO_INCREMENT,"
					+ "name Char(255),"
					+ "price Char(255),"
					+ "date Char(255),"
					+ "PRIMARY KEY(id))"); 
			createTable.execute();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("테이블이 생성되었습니다.");
		}
	}
	
	public static Connection getConnection() {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://sql9.freemysqlhosting.net:3306/sql9381357";
			String user = "sql9381357";
			String pass = "A9UszC2Dbr";
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
