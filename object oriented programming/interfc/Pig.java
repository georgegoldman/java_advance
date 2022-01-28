package interfc;
import interfc.*;

class Pig implements App, PigSleep {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public void run() {
        System.out.println("Pig runs zigzag");
    }

    public void pigSleep() {
        System.out.println("Pig sleep nose-to-nose");
    }
}
