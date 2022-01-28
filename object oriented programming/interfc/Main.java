package interfc;
import interfc.Pig;

public class Main {
    public static void main(String[] args){
        Pig newPg = new Pig();
        newPg.animalSound();
        newPg.run();
        newPg.pigSleep();
    }
}
