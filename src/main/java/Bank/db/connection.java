package Bank.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLException;

import org.postgresql.ds.PGSimpleDataSource;


//public class connection {
//	private static String driver="oracle.jdbc.OracleDriver";
//	private static String url="jdbc:oracle:thin:@localhost:1521:XE";
//	private static String userName="System";
//	private static String password="tejas18";
	
//	for deployed database
//	private static String driver="oracle.jdbc.OracleDriver";
//	private static String url="jdbc:postgresql://moneymint-4095.7s5.aws-ap-south-1.cockroachlabs.cloud:26257/defaultdb?sslmode=verify-full&password=OSrL58LgPLCLcJN81XcIrw&user=dhirajdurande13";
//	private static String userName="tejas18";
//	private static String password="OSrL58LgPLCLcJN81XcIrw";
////	static {
//		 try {
//			Class.forName(driver);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	 public static Connection getconnection()
//	 {
//		 Connection conn=null;
//		
//		 try {
//			conn=DriverManager.getConnection(url,userName,password);
//			System.out.println("connection "+conn);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 return conn;
//	 }
	
	   //Configure the database connection.
    
   
      //Create DAO.
 
	    	
	





/*

	public class connection{
	 public static Connection getconnection() {
		 Connection conn=null;
		 PGSimpleDataSource ds = new PGSimpleDataSource();
	       ds.setUrl("jdbc:postgresql://moneymint-4095.7s5.aws-ap-south-1.cockroachlabs.cloud:26257/defaultdb?sslmode=require&password=OSrL58LgPLCLcJN81XcIrw&user=dhirajdurande13");
	        ds.setUser("dhirajdurande13");
	        ds.setPassword("OSrL58LgPLCLcJN81XcIrw");
		 try {    
	        	 conn = ds.getConnection();
                //Connection connection = DriverManager.getConnection(url, user, password);
	            System.out.println("Connected to the PostgreSQL server successfully."+conn);

	            // Do something with the connection...

	            // Close the connection when done
	            //connection.close();
	        } catch (SQLException e) {
	            System.out.println("Connection failed.");
	            e.printStackTrace();
	        }
		 return conn;
		
	    
		 
	 }

}
*/






//Oracle SQL Connevtion
public class connection {
	private static String driver="oracle.jdbc.OracleDriver";
	private static String url="jdbc:oracle:thin:@DESKTOP-IHHCNDI:1521:XE";
	private static String userName="System";
	private static String password="tejas18";
	static {
		 try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public static Connection getconnection()
	 {
		 Connection conn=null;
		
		 try {
			conn=DriverManager.getConnection(url,userName,password);
			System.out.println("connection "+conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return conn;
	 }

}



/*

//Postagre SQL Connection 
public class connection {
    private static String driver = "org.postgresql.Driver";
    private static String url = "jdbc:postgresql://localhost:5432/your_database_name";
    private static String userName = "postgres";
    private static String password = "DreamBig@18";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new IllegalStateException("Failed to load JDBC driver.");
        }
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to PostgreSQL database.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalStateException("Failed to connect to the database.");
        }
        return conn;
    }
}

*/

	

