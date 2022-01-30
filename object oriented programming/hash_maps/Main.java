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
        System.out.println("let print all the list of countries");
        int countingTheCountries = 1;
        for(String i : capitalisedCities.keySet()){

            System.out.println(countingTheCountries+". "+i);
            countingTheCountries++;
        }
        System.out.println("let print all the list of countries capitals");
        for (String i : capitalisedCities.keySet()){
            if(countingTheCountries == 5){
                countingTheCountries -=4 ;
            }
            System.out.println(countingTheCountries+". "+i+" "+capitalisedCities.get(i));
            countingTheCountries++;
        }
        System.out.println(capitalisedCities.get("Norway"));
        capitalisedCities.remove("Germany");
        System.out.println("after removing Germany from the list ==> "+capitalisedCities);
        System.out.println("let us print the size of the hashmap ==> "+capitalisedCities.size());
        capitalisedCities.clear();
        System.out.println("we are about to clean the hash maps ==> "+ capitalisedCities);

        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("John", 25);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()){
            System.out.println(i + " : " + people.get(i));
        }

    }
    
}
