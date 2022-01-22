package abstration;
import abstration.App;

public class Main extends App {

    public String animalSound() {
        return "animal sound";
    }
    public static void main(String[] args)
    {
        Main newMain = new Main();
        System.out.println(newMain.animalSound());
    }
}
