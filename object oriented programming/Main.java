import nestclass.OuterClass;

public class Main{
    public static void main(String[] args){
        OuterClass Outter = new OuterClass();
        OuterClass.InnerClass inner = Outter.new InnerClass();
        System.out.println(inner.myInnerMethod());
    }
}