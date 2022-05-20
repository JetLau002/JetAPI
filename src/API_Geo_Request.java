import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.net.*;
import java.util.Map;
import java.io.*;


public class API_Geo_Request {

private String City;
private String URL = "http://geodb-free-service.wirefreethought.com/v1/geo/cities?namePrefix=";

private String URLoptions = "&hateoasMode=false&limit=5&offset=0";
public void getCityID() throws Exception
{
    String requestURL = URL + City + URLoptions;
    System.out.println(requestURL);
    //this is the request to our URL and it returns an text input stream that we can read from
    URL url = new URL(requestURL);
    BufferedReader in = new BufferedReader(
            new InputStreamReader(url.openStream()));
    System.out.println(in);
    JSONParser parser = new JSONParser();
    Map cityData = (Map) parser.parse(in);
    Map meta = (Map)cityData.get("metadata");
    Long count = (Long) meta.get("totalCount");

    if (count > 0)
    {
        JSONArray data = (JSONArray) cityData.get("data");
        Map first = (Map)data.get(0);

        //String name
        String name = (String)first.get("name");
        System.out.println("Name: " + name);

        //long population
        Long population = (long)first.get("population");
        System.out.println("Population: " + population);

        //Lat
        Double latitude = (double)first.get("latitude");
        System.out.println("latitude: " + latitude);

        //long
        Double longitude = (double)first.get("longitude");
        System.out.println("longitude: " + longitude);
    }
}

    public void setCity(String city) {
        City = city;
    }
}
