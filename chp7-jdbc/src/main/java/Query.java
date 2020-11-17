import java.sql.*;
import java.util.Properties;

public class Query {

    public static void main(String[] args) {
        Connection connection;
        Statement statement;
        ResultSet resultSet;

        try{
            Properties properties = new Properties();
            properties.put("user", "sa");
            properties.put("password", "");
            String url = "jdbc:h2:~/test";
            connection = DriverManager.getConnection(url, properties);
        }

        catch (SQLException es){
            es.printStackTrace();
        }
    }

}
