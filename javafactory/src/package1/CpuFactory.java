package package1;

public class CpuFactory {
    public static Cpu getCpu(int flag){
        Cpu cpu=null;
        switch (flag)
        {
            case 1:
                cpu=new IntelCpu(343);
                break;
            case 2:
                cpu=new AMDCpu(2275);
                break;
        }
        return cpu;
    }
}
