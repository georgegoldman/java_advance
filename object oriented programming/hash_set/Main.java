package hash_set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println("list of cars => ");
        Integer numCar = 1;
        for (String i : cars){
            System.out.println(numCar+". "+i);
            numCar++;
        }
        cars.remove("Mazda");
        if(cars.contains("volvo")){
            System.out.println("this hashset contain volvo");
            System.out.println(cars.size());
        }else {
            System.out.println("this hashset does not contain mazda");
            cars.clear();
        }
        System.out.println(cars);
    }
}
