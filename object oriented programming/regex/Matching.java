package regex;
import java.util.regex.Pattern;

public class Matching {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("georgegold*man", "georgegoldman"));

        System.out.println(Pattern.matches("g*geeks*", "geeksfor"));
    }
}
