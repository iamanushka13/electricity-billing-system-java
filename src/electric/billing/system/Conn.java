package electric.billing.system;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{
        c= DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","anushkakudu132005");
        s=c.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
