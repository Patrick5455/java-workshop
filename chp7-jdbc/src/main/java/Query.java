import java.sql.*;
import java.util.Properties;

public class Query {

    public static void main(String[] args) {
        Connection connection;
        Statement statement;
        ResultSet resultSet;

        try{
            String sql = "SELECT * from customer order by username";

            Properties properties = new Properties();
            properties.put("user", "sa");
            properties.put("password", "");
            String url = "jdbc:h2:~/test";
            connection = DriverManager.getConnection(url, properties);

            statement = connection.createStatement();
            ResultSet results = statement.executeQuery(sql);
            while (results.next()) {
                Long id = results.getLong("CUSTOMER_ID");
                String username = results.getString("USERNAME");
                String firstName = results.getString("FIRST_NAME");
                String lastName = results.getString("LAST_NAME");
                System.out.println(id + " " + username + " " +
                        firstName + " " + lastName);
            }
            if (results != null) {
                results.close();
            }
            if (statement != null) {
                statement.close();
            }
            connection.close();
        }

        catch (SQLException es){
            es.printStackTrace();
        }
    }

}
