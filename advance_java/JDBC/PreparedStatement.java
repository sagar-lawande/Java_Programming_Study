package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatement{
    public static void main(String[] args) {
        System.out.println("Program for Java program connect with Database using Prepared Statement");
        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String pass = "Sagar12";

        // Insert Query
        String insertQuery = "INSERT INTO school(id, name, age) VALUES (?, ?, ?)";
        // Select Query
        String selectQuery = "SELECT * FROM school";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded Successfully");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, username, pass);
            System.out.println("Connection Established successfully");

            // 1️⃣ Insert record
            PreparedStatement p1 = con.prepareStatement(insertQuery);
            p1.setInt(1, 11);
            p1.setString(2, "Rahul");
            p1.setInt(3, 25);

            int rowsInserted = p1.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("✅ Record inserted successfully!");
            }

            // 2️⃣ Select and Print Full Table
            PreparedStatement p2 = con.prepareStatement(selectQuery);
            ResultSet res = p2.executeQuery();

            System.out.println("\n======= EMP TABLE DATA =======");
            while (res.next()) {
                int id = res.getInt("id");
                String name = res.getString("name");
                int age = res.getInt("age");

                System.out.println("ID = " + id + " | Name = " + name + " | Age = " + age);
            }

            // Close resources
            res.close();
            p1.close();
            p2.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
	