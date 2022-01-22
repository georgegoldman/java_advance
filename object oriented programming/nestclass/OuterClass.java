package nestclass;

public class OuterClass {
    public int x = 10;

    public class InnerClass {
        public int myInnerMethod()
        {
            return x;
        }
    }
}
