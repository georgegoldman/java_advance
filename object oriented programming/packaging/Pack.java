package packaging;
import java.util.Scanner;


public class Pack {
    public static void main(String[] agrs)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");


        String username = myObj.nextLine();
        System.out.println("username is: " + username);
    }
}
