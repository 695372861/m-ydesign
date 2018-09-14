package package1;

public class IntelMainboard implements Mainboard {
    private int flag;
    public IntelMainboard(int flag)
    {
        this.flag=flag;
    }
    @Override
    public void myMainboard() {
        System.out.println("IntelMainboard:"+flag);
    }
}
