package package1;

public class Singleton2 {
    private static Singleton2 singleton2=null;

    private Singleton2(){}

    //在方法的定义中synchronized可以线程安全
    public  static  Singleton2 getSingleton2()
    {
        if(singleton2==null)
        {
            singleton2=new Singleton2();
        }
        return singleton2;
    }
    //另外一种线程安全的控制
    public static Singleton2 getSingleton2Syn()
    {
        if(singleton2==null)
        {
            synchronized (Singleton2.class)
            {
                if(singleton2==null)
                {
                    singleton2=new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
