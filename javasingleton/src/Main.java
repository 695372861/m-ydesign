import package1.Singleton1;
import package1.Singleton2;
import package1.Singleton4;

public class Main {
    public static void main(String[] args)
    {
        Singleton1 singleton1=Singleton1.getSingleton1();
        Singleton2 singleton2=Singleton2.getSingleton2();
        Singleton4.uniqueInstance.mehtod();
    }
}
