import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args)
    {
        FuRongWang fuRongWang=new FuRongWang();
        InvocationHandler proxy=new MyProxy(fuRongWang);
        SellY sellY=(SellY) Proxy.newProxyInstance(FuRongWang.class.getClassLoader(),FuRongWang.class.getInterfaces(),
                proxy);
        sellY.sell();

        FuRongWang fuRongWang1=new FuRongWang();
        StaticProxy sp=new StaticProxy(fuRongWang1);
        sp.sell();
    }
}
