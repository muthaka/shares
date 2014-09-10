
package shares;


import java.sql.*;


public class Connectdb {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public Connectdb()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shares","root","root");
           st = con.createStatement();
           
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.out.println("Error"+ex);
        }
    }
    public void getData()
    {
        try
        {
            String query = "select * from june2014";
            rs = st.executeQuery(query);
            System.out.println("Records from the database");
            System.out.println("CIC EVER EXP HOME KEN KENOL KENA KENO MAR MUM OLY SAF SAM");
             while(rs.next())
        {
            
           String cic = rs.getString("CIC_Insurance");
           String ev = rs.getString("Eveready_EA");
           String ex = rs.getString("Express");
           String hm = rs.getString("Home_Afrika_Ltd");
           String k = rs.getString("Kengen");
           String kk = rs.getString("Kenolkobil");
           String ka = rs.getString("Kenya_Airways");
           String ko = rs.getString("Kenya_Orchads");
           String mea = rs.getString("Marshalls_EA");
           String ms = rs.getString("Mumias_Sugar");
           String oc = rs.getString("Olympia_Capital");
           String saf = rs.getString("Safaricom_Limited");
           String sa = rs.getString("Sameer_Africa");
           
           System.out.println(""+cic+" "+ev+" "+ex+" "+hm+" "+k+" "+kk+" "+ka+" "+ko+" "+mea+" "+ms+" "+oc+" "+saf+" "+sa+"");
        }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
}
