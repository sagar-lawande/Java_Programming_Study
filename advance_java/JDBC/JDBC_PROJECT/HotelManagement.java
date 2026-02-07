
import java.sql.*;
import java.util.Scanner;

public class HotelManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/Hotel_Management";
        String username = "root";
        String pass = "Sagar12";

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connection
            Connection con = DriverManager.getConnection(url, username, pass);
            Statement stm = con.createStatement();

            while (true) {   // loop starts here
                System.out.println("\nProgram for Simple Hotel operations Management");
                System.out.println("1. Reserve a Room");
                System.out.println("2. View Reservations");
                System.out.println("3. Get Room number");
                System.out.println("4. Update Reservations");
                System.out.println("5. Delete Reservations");
                System.out.println("6. Exit");
                System.out.print("Enter the No. Operation you want to perform: ");
                int no = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (no) {
                    case 1:
                        System.out.println("Enter Guest Name:");
                        String name = sc.nextLine();
                        System.out.println("Enter Room No:");
                        int roomno = sc.nextInt();
                        System.out.println("Enter Contact_No:");
                        String contact = sc.next();
                        System.out.println("Enter Age:");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Location:");
                        String location = sc.nextLine();

                        String insert = "INSERT INTO reservations (name, roomno, contact, age, location) VALUES ('"
                                + name + "', "
                                + roomno + ", '"
                                + contact + "', "
                                + age + ", '"
                                + location + "')";
                        stm.executeUpdate(insert);
                        System.out.println("Reservation added successfully!");
                        break;

                    case 2:
                        String select1 = "SELECT * FROM reservations";
                        ResultSet res = stm.executeQuery(select1);

                        System.out.println("|-----------|-----------------|---------------|--------------|--------------|--------------|");
                        System.out.println("|     ID    |   Guest_Name    |   Room_No     |   Contact    |     Age      |   Location   |");
                        System.out.println("|-----------|-----------------|---------------|--------------|--------------|--------------|");
                        while (res.next()) {
                            System.out.printf("| %-9d | %-15s | %-13d | %-12s | %-12d | %-12s |\n",
                                    res.getInt("id"),
                                    res.getString("name"),
                                    res.getInt("roomno"),
                                    res.getString("contact"),
                                    res.getInt("age"),
                                    res.getString("location"));
                        }
                        break;

                    case 3:
                        System.out.print("Enter ID and Name to get room number: ");
                        int id = sc.nextInt();
                        String getno = "SELECT roomNo FROM reservations WHERE id=" + id;
                        ResultSet rs2 = stm.executeQuery(getno);
                        if (rs2.next()) {
                            System.out.println("Room No: " + rs2.getInt("roomNo"));
                        } else {
                            System.out.println("No reservation found.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter ID to update: ");
                        int uid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter new Name: ");
                        String newName = sc.nextLine();

                        String update = "UPDATE reservations SET name='" + newName + "' WHERE id=" + uid;
                        int rowsUpdated = stm.executeUpdate(update);
                        if (rowsUpdated > 0) {
                            System.out.println("Reservation updated successfully!");
                        } else {
                            System.out.println("No record found to update.");
                        }
                        break;

                    case 5:
                        System.out.print("Enter ID to delete: ");
                        int did = sc.nextInt();
                        String delete = "DELETE FROM reservations WHERE id=" + did;
                        int rowsDeleted = stm.executeUpdate(delete);
                        if (rowsDeleted > 0) {
                            System.out.println("Reservation deleted successfully!");
                        } else {
                            System.out.println("No record found to delete.");
                        }
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        con.close();
                        sc.close();
                        return;   // exit main method (program ends)

                    default:
                        System.out.println("Invalid choice.");
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
