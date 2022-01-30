package inter;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("bmw");
        cars.add("ford");
        cars.add("mazda");

        Iterator<String> it = cars.iterator();

        // System.out.println("the fisrt thing to bre printed before volvo");
        // System.out.println(it.next());
        // System.out.println("then after");

        while(it.hasNext()) {
            if(it.next() == "volvo") it.remove();
        }
        System.out.println(cars);
    }
    
}
