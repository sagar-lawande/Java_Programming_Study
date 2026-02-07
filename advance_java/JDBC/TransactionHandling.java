import java.sql.*;

public class TransactionHandling {
    public static void main(String[]args){
        System.out.println("program for Transaction Handling in JDBC");
        String url="jdbc:mysql://localhost:3306/bank";
        String username="root";
        String pass="Sagar12";
        String withdraw_query="update accounts set balance=balance-?where account_no=?";
        String deposit_query="update accounts set balance=balance+?where account_no=?";
        String view_table_query="select * from accounts";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Diver Loaded sucessfully");

        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con= DriverManager.getConnection(url,username,pass);
            System.out.println("Connection Established sucessfully");
            con.setAutoCommit(false);
            PreparedStatement withdraw_statement= con.prepareStatement(withdraw_query);
            PreparedStatement deposit_statement= con.prepareStatement(deposit_query);
            PreparedStatement view_table=con.prepareStatement(view_table_query);

            withdraw_statement.setDouble(1,200.00);
            withdraw_statement.setString(2,"account_no2 456");
            deposit_statement.setDouble(1,300.00);
            deposit_statement.setString(2,"account_no1 123");
            int  withdraw_rows_affect=withdraw_statement.executeUpdate();
            int deposit_rows_affect=deposit_statement.executeUpdate();
            if(withdraw_rows_affect >0 && deposit_rows_affect>0)
            {
                System.out.println("Transaction sucessful");
                con.commit();
            }
            else {
                System.out.println("Transaction failed");
                con.rollback();
            }
            ResultSet res=view_table.executeQuery();


            while(res.next()){
                int id =res.getInt("id");
                String acc=res.getString("account_no");
                double bal=res.getDouble("balance");
                System.out.println("===================================");
                System.out.println("ID = " + id + " | Account_No = " + acc + " | Balance = " + bal);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());

        }

    }
}
