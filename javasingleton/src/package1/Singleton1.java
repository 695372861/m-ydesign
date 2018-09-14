package package1;

public class Singleton1 {
    private static final Singleton1 singleton1=new Singleton1();

    private Singleton1()
    {

    }

    public static Singleton1 getSingleton1()
    {
        return singleton1;
    }


    public static void method1(){}
    public static int method2(){return 0;}
}
