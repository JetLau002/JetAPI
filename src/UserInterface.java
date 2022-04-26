import java.util.*;

public class UserInterface {
    private Scanner input = new Scanner(System.in);


    public String inputCityName() {
        System.out.println("Enter a City (Q to quit):");
        System.out.println("For example: San Francisco");
        System.out.println();
        String cityName = input.nextLine();
        return cityName;
    }

}
