package enumm;
import enumm.App;
import enumm.App.Level;

public class Main {
    public static void main(String[] args){
        App.Level level = Level.HIGH;
        
        switch(level) {
            case LOW:
            System.out.println("low level");
            break;
            case MEDIUM:
            System.out.println("medium level");
            break;
            case HIGH:
            System.out.println("high level");
            break;
        }

        for(var myVarLevel: Level.values() ){
            System.out.println(myVarLevel);
        }
    }
}
