package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("unnmath", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("visit unnmath");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("match found");
        }else {
            System.out.println("match not found");
        }
        System.out.println(pattern.flags());
    }
}
