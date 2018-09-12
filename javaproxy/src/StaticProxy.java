public class StaticProxy implements SellY {
    private FuRongWang fuRongWang;
    public StaticProxy(FuRongWang fuRongWang)
    {
        this.fuRongWang=fuRongWang;
    }
    @Override
    public void sell() {
        System.out.println("静态代理开始");
        fuRongWang.sell();
        System.out.println("结束");
    }
}
