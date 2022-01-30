package exceptions;

public class Main {
    public static void main(String[] args){
        try {
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[0]);
        } catch (Exception e) {
            //TODO: handle exceptionageage
            System.out.println("something went wrong");
        }finally{
            checkAge(24);
        }
    }

    public static void checkAge(int age) {
        if(age < 18) throw new ArithmeticException("Access denied, you must be aleast 18yrs old");
        else System.out.println("Access granted, you are old enough!");
    }
}
