package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBManage {
	static Connection con;
	static Statement stmt;
	static ResultSet rs;
	
	public DBManage() {
		
	}
	
	public void DBSetting() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC","root","1234");
			stmt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static ResultSet ExecQuery(String sql){
		try {
		stmt = con.createStatement();
		return stmt.executeQuery(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
