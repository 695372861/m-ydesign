package package1;

public class Main {
    public static void main(String[] args)
    {
        Assemble assemble=new Assemble();
        assemble.zuzhuang(1,1);

        IntelFactory itf=new IntelFactory();
        assemble.zuzhuang(itf);
    }
}
