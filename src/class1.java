
import java.sql.*;

public class class1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String databaseURL = "jdbc:ucanaccess://C://Users//Public//database//database1.accdb";
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            System.out.println("Connection is done");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Connection connection = DriverManager.getConnection(databaseURL);
        String sql = "SELECT * FROM Employee";
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);

        System.out.println("ID \t \t \t Name");
        System.out.println("--------\t-------");

        while (result.next()){
            int id =  result.getInt("Ssn");
            String name= result.getString("Fname");
            System.out.println(id+ "   " + name);
        }



    }
}