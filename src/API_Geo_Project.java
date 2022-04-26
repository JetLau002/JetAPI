public class API_Geo_Project {
    public static void main(String[] args) {

        UserInterface ui = new UserInterface();
        //Request myRequest = new Request();
        while(true)
        {
            String mainResponse = ui.inputCityName();
            if (mainResponse.equals("Q"))
            {
                System.out.println("Bye");
                break;
            }
            else
            {
                //myRequest.setName(mainResponse);
                //String apiResponse = myRequest.getData();
                //System.out.println("API Response: "  + apiResponse);
                System.out.println(mainResponse);
                //set city name on request

                //call method on request to go get info on city from API

            }
        }
    }
}
