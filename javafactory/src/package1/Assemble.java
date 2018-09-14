package package1;

//装配类
public class Assemble {
    private Cpu cpu;
    private Mainboard mainboard;

    public void zuzhuang(int cpuFlag,int mainboardFlag)
    {
        cpu=CpuFactory.getCpu(cpuFlag);
        mainboard=MainboardFactory.getMainboard(mainboardFlag);
        cpu.mycpu();
        mainboard.myMainboard();
    }

    public void zuzhuang(AbstractFactory af)
    {
        cpu=af.getCpu();
        mainboard=af.getMainboard();
        cpu.mycpu();
        mainboard.myMainboard();
    }
}
