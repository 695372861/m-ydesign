package package1;

public class AMDFactory implements AbstractFactory {
    @Override
    public Cpu getCpu() {
        return new AMDCpu(2552);
    }

    @Override
    public Mainboard getMainboard() {
        return new AMDMainboard(2552);
    }
}
