import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.bind.SchemaOutputResolver;

import com.mysql.cj.protocol.Resultset;

public class JdbcConnection{
    public static void main(String[]args)throws ClassNotFoundException{
        String url="jdbc:mysql://localhost:3306/school";                       //address of Database
        String username="root";                                                 //sql username
        String pass="Sagar12";                                                  //sql password
        String query="select * from school";
        String query1="insert into school values( 8,'pavan',45)";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");                           //JDBC Driver Loaded
            System.out.println("Drivers loaded sucessfully");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con = DriverManager.getConnection(url ,username,pass);   //Connection between JAVA and DATABASE using JDBC
            System.out.println("Connection Established Sucessfully");
            Statement stmt=con.createStatement();                               // Statement created
            int result=stmt.executeUpdate(query1);
            ResultSet res=stmt.executeQuery(query);                             //statement executed


            while(res.next()){
                int id =res.getInt("id");
                String name =res.getString("name");
                String age =res.getString("age");

                System.out.println();
                System.out.println("==================================");
                System.out.println("Id = "+id);
                System.out.println("name = "+name);
                System.out.println("course_name = "+age);
            }
            con.close();
            res.close();
            stmt.close();
            System.out.println("\n Connection Closed");

        }catch(SQLException e){
            System.out.println(e.getMessage());

        }
    }
}