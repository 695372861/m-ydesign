import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/***
 * 动态代理
 */
public class MyProxy implements InvocationHandler {
    private Object object;
    public MyProxy(Object object)
    {
        this.object=object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始。。。。");
        method.invoke(object,args);
        System.out.println("结束。。。。");
        return null;
    }
}
