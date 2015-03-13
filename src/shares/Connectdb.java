
package shares;


import java.sql.*;


public class Connectdb {
    private static Connection con;
    
    
    public static Connection Connection() throws SQLException
    {
                try{
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException cnfe){
	            System.err.println("Error: "+cnfe.getMessage());
	        }
	 
	        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shares","root","root");
	        return con;
    }
    public static Connection getConnection() throws SQLException
    {
        if(con !=null && !con.isClosed())
	            return con;
	        Connection();
	        return con;
    }
    
}
