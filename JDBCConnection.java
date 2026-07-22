import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employeedb";
        String user = "root";
        String password = "hari@1410"; // Replace with your MySQL password

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, password);

            if (con != null) {
                System.out.println("Database Connected Successfully!");
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
    }
}