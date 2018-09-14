package package1;

public class IntelFactory implements AbstractFactory {
    @Override
    public Cpu getCpu() {
        return new IntelCpu(343);
    }

    @Override
    public Mainboard getMainboard() {
        return new IntelMainboard(343);
    }
}
