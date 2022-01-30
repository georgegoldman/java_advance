package landa;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(5);
        number.add(9);
        number.add(8);
        number.add(1);
        number.forEach( (n) -> {System.out.println(n);} );
    }
}
