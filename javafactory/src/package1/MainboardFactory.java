package package1;

public class MainboardFactory {
    public static Mainboard getMainboard(int flag)
    {
        Mainboard mainboard=null;
        switch (flag)
        {
            case 1:
                mainboard=new IntelMainboard(343);
                break;
            case 2:
                mainboard=new AMDMainboard(2275);
                break;
        }
        return mainboard;
    }

}
