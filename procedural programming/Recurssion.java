public class Recurssion {
    public static void main(String[] args)
    {
        int factNum = factorial(3);
        System.out.println(factNum);
    }

    public static int factorial(int x)
    {
        int count = 0;
        if (x > count)
        {
            return 1 * factorial(count + 1);
        }else
        {
            return x;
        }
    }
}
