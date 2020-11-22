package http;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JsonPostRequests {

    public static void main(String[] args)
    throws IOException, MalformedURLException
    {

        /*Post and Put requests send data to the server,
        For a POST request, you need to turn on the output mode of
        HttpUrlConnection and set the content type:
        * */

        String JSONContent = "{\"animal\":\"dog\", " +
                "       \"name\": \"biff\"}";
      String  path = "https://httpbin.org/post";

      makePostRequest(JSONContent, path);
    }

    static void  makePostRequest(String path, String JSONContent)
            throws IOException, MalformedURLException
    {

        URL url = new URL(path);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-TYpe",
                "application/json");

        connection.setDoOutput(true);
        //Include Data in Post Request
        DataOutputStream dos = new DataOutputStream(
                connection.getOutputStream()
        );
        dos.writeBytes(JSONContent);
        dos.flush();
        dos.close();

        int responseCode = connection.getResponseCode();

        System.out.println("Response Code: "+responseCode);

        if(responseCode!= HttpURLConnection.HTTP_OK);
        System.out.println("Got an unexpected response code:");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
        );

        String line;
        while ((line= in.readLine())!=null)
            System.out.println(line);
        in.close();
    }


}
