package package1;

public class Singleton3 {
    private Singleton3(){}
    public static class InnerClass
    {
        public static Singleton3 singleton3=new Singleton3();
    }
    public static Singleton3 getSingleton3()
    {

        return InnerClass.singleton3;

    }
}
