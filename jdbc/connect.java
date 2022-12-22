import java.sql.*;
import oracle;
import java.io.*;
public class connect
{
    public static void main(String[] args) throws Exception{
        try{
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","system");
            Statement st = con.createStatement();
            
        }
    }
} 