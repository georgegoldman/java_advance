public class Ugboala {
    protected String brand = "Nwaobasi";
    public void hook() {
        System.out.println("Pee! Pee!!");
    }
}


class UgboalaOhuo extends Ugboala {
    private String modelName = "Ukaegbu";
    public static void main(String[] args) {
        UgboalaOhuo nkeOhuo = new UgboalaOhuo();
        nkeOhuo.hook();

        System.out.println(nkeOhuo.brand + " " + nkeOhuo.modelName);
    }
}