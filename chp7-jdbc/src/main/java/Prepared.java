import java.sql.*;
import java.util.Properties;

public class Prepared {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;


        try{
            Properties properties = new Properties();
            properties.setProperty("user", "sa");
            properties.setProperty("password", "");
            String url = "jdbc:h2:~/test";

            connection = DriverManager.getConnection(url, properties);
            connection.setAutoCommit(false);
            System.out.println(connection.toString());

            preparedStatement = connection.prepareStatement(
                    SqlQueries.updateEmail);

            preparedStatement.setString(1, "patrick@gmail.com");
            preparedStatement.setLong(2, 1L);
            preparedStatement.setString(3, "HOME");

            // when setting, inserting or deleting, you use executeUpdate or execute()
            //but other sqlExceptions, you use executeQuery()
            //executeUpdate() returns the number of rows changed,
            //while execute() returns a boolean
            int numberOfRowsChanged = preparedStatement.executeUpdate();
            connection.commit();
            System.out.println("Number of rows changed "+
                    numberOfRowsChanged);
        }


        catch (SQLException se){
            se.printStackTrace();

            try{
               if(connection!=null) connection.rollback();
            }
            catch (SQLException se1){
                se1.printStackTrace();
            }

        }

        finally {
            try{
                assert connection != null;
                connection.setAutoCommit(true);
                if(preparedStatement!=null) preparedStatement.close();
                connection.close();
            }
            catch (SQLException se2 ){
                se2.printStackTrace();

            }
        }

    }


}
