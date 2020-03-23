package newpackage;

import javax.xml.transform.Result;
import java.sql.*;

public class Test {

    public static void main(String args[])
   {
       try
       {
           Class.forName("org.postgresql.Driver");
            String url="jdbc:postgresql://localhost:5432/technicalblogger";
            String uname="postgres";
            String pwd="swapnil";
           Connection con= DriverManager.getConnection(url,uname,pwd);
           Statement smt=con.createStatement();
           String q="select * from student where id =2";
           ResultSet rs=smt.executeQuery(q);
           while(rs.next())
           {
           System.out.println(rs.getInt(1) + " : "+ rs.getString(2));
           }
con.close();
       }
       catch (Exception e)
       {
                            System.out.println(e);
       }
   }
}

