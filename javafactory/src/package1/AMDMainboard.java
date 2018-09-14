package package1;

public class AMDMainboard implements Mainboard {
    private int flag;
    public AMDMainboard(int flag)
    {
        this.flag=flag;
    }
    @Override
    public void myMainboard() {
        System.out.println("AMDMainboard:"+flag);
    }
}
