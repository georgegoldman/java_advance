final public class Main {
    int x;
    String modelAge;
    public Main(int y, String age) {
        x=y;
        modelAge = age;
    }
    public void fullThrottle() {
        System.out.println("the car is going as fast as it can");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: "+ maxSpeed);
    }

    public static void main(String[] agrs){
        Main newMain = new Main(15, "fifteen");
        System.out.println(newMain.x);
    }
}
