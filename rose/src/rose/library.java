package rose;


import java.sql.*;


	import java.sql.*;

	public class library {
		private Connection con;
		library(){
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/readme","root","");
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				// TODO: handle exception
			}catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
		public Connection getCon() {
			return con;}
		
	public void closecon() {
		try {
			if (con !=null && ! con.isClosed()) {
				con.close();
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	}
		
