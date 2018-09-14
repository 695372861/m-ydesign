package package1;

public class AMDCpu implements Cpu {
    private int flag;
    public AMDCpu(int flag)
    {
        this.flag=flag;
    }
    @Override
    public void mycpu() {
        System.out.println("AMDCpu:"+flag);
    }
}
