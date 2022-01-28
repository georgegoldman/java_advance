package hash_maps;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, String> capitalisedCities = new HashMap<String, String>();

        capitalisedCities.put("England", "London");
        capitalisedCities.put("Germany", "Berlin");
        capitalisedCities.put("Norway", "Oslo");
        capitalisedCities.put("USA", "Washington Dc");

        System.out.println(capitalisedCities);
        System.out.println(capitalisedCities.get("Norway"));
        capitalisedCities.remove("Germany");
        System.out.println("after removing Germany from the list ==> "+capitalisedCities);
    }
    
}
