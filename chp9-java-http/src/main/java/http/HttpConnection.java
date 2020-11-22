package http;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class HttpConnection {

    /*The java.net.HttpUrlConnection class provides the main way to access
    * HTTP resources from java.
    * To establish an HTTP connection, you can use code like the following*/

    public static void main(String[] args) throws IOException {

        String path = "http://example.com";
        URL url = new URL(path);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("HEAD");


          /*This code sets up a URL initialized with a link to example.com
        * The openConnection() method on the URL then returns
        * HttpUrlConnection, you can set up the HTTP method (HEAD, in this case).
        *You can get data from the server, upload data to the server, and
        * specify request headers.
        *
        * With HttpUrlConnection, you can call setRequestProperty() to specify a
        * request header:
        * **/

        connection.setRequestProperty("User-Agent", "Mozilla/5.0");

       /*
        * Each request generates a response, which may be successful or not;
        * To check the response, get the response code
        * */

        int responseCode = connection.getResponseCode();

        /*A code of 200 is a success. There are other codes in the 200 range
        * that also indicate a success, ut with conditions, such as 204,
        * which indicates success but with no content.
        *
        * Codes in the 300S indicates redirects. Codes in the 400s point to client
        * errors, such as the dreaded 404 Not Found Error.
        * And codes in the 500s point to server errors.
        * */

        /*Every response typically comes with a message, such as OK.
        * You can retrieve this message by calling getResponseMessage()*/

        System.out.println(connection.getResponseCode());
        System.out.println(connection.getResponseMessage());

        /*To see the headers in the response, call
        * getHeaderFields(). This method returns a map of headers,
        * where value is a list of strings:*/

        Map<String, List<String>>  headers =
                connection.getHeaderFields();

        headers.entrySet().forEach(System.out::println);


    }
}
