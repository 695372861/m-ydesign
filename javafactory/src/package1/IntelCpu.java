package package1;

public class IntelCpu implements Cpu {
    private int flag;
    public IntelCpu(int flag)
    {
        this.flag=flag;
    }
    @Override
    public void mycpu() {
        System.out.println("IntelCpu:"+flag);
    }
}
