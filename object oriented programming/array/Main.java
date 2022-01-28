package array;
import java.util.ArrayList;

public class Main{

    public static void main (String[] args){
        ArrayList<String> car = new ArrayList<String>();
        car.add("volvo");
        car.add("bmw");
        car.add("ford");
        System.out.println(car);
        System.out.println("get the 1st item");
        System.out.println(car.get(0));
        
        System.out.println("change the first item");
        car.set(0, "toyota");
        System.out.println(car.get(0));
        System.out.println("remove the 2nd term");
        System.out.println("this is the list "+car+ " now this is it ");
        car.remove(1);
        System.out.println(car);
        System.out.println("let clear the list but before then let have the size");
        System.out.println(car.size());
        System.out.println("clearing the list");
        car.clear();
        System.out.println(car);


    }
}
