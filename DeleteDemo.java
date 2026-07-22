import java.sql.*;

public class DeleteDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String password = "root";

        try {

            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "DELETE FROM employee WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 101);

            int rows = ps.executeUpdate();

            System.out.println(rows + " Row Deleted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}