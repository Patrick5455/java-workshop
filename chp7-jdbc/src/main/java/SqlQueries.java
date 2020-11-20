public class SqlQueries {


    public static String updateEmail = "UPDATE email " +
            "SET EMAIL_ADDRESS = ? " +
            "WHERE customer_id = ? " +
            "AND email_type = ? ";
}
