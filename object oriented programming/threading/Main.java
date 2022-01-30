package threading;

public class Main implements Runnable   {
    public static void main(String[] args){
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("this code is outside the thread");
    }

    public void run() {
        System.out.println("this code is running in a thread");
    }
}
