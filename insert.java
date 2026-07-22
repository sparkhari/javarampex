import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String password = "hari@1410";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO employee(id, name) VALUES(?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 101);
            ps.setString(2, "Hema");

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Record inserted successfully.");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}