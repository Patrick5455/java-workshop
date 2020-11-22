package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetRequest {


    public static void main(String[] args) throws IOException, MalformedURLException {


        String host = "http://example.com";

        URL url = new URL(host);

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        /*With a GET request, you must get InputStream from the connection
         * to see the response.
         * Call getInputStream() to get the data sent back by the server for the
         * resource (URL) you requested. If the response code indicates an error,
         * get getErrorStream() to retrieve info about the error, such as a
         * NotFoundPage.
         * If you expect textual data in the response such as HTML,text,XML, etv,
         * you can wrap InputStream in BufferedReader:
         */

        BufferedReader in = new BufferedReader(
                new InputStreamReader(urlConnection.getInputStream())
        );

        String line;
        while ((line = in.readLine())!=null){
            System.out.println(line);
        }
        in.close();

        System.out.println("--------------GET REQUEST");

        try {
            getRequest(host);
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void getRequest(String path)
            throws MalformedURLException, IOException{

        URL url = new URL(path);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        InputStreamReader stream = new InputStreamReader(connection.getInputStream());

        BufferedReader reader = new BufferedReader(stream);

        String line;

        while ((line=reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();

    }
}
