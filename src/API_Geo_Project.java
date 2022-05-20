import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.net.ssl.HttpsURLConnection;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;
import java.util.Scanner;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import org.json.simple.parser.*;
import java.util.Map;
import org.json.simple.JSONArray;

public class API_Geo_Project {
    public static void main(String[] args) throws Exception {

        HttpsURLConnection aconnection = null;

        UserInterface ui = new UserInterface();
        API_Geo_Request request = new API_Geo_Request();
        while(true)
        {
            String city = ui.inputCityName();
            if (city.equals("Q"))
            {
                System.out.println("Bye");
                break;
            }
            else
            {
                //myRequest.setName(mainResponse);
                //String apiResponse = myRequest.getData();
                //System.out.println("API Response: "  + apiResponse);
                System.out.println(city);

                //set city name on request...
                request.setCity(city);
                //call method on request to go get info on city from API
                request.getCityID();
            }
        }
    }
}
