package hr.algenra;

import java.util.Random;

public class RepoZaposlenik {


    public static JuniorZaposlenik junior = new JuniorZaposlenik();
    public static SeniorZaposlenik senior = new SeniorZaposlenik();
    private static Random rnd = new Random();

    public  static IPlacanje getZaposlenik()
    {
        switch (rnd.nextInt(2))
        {

            case 0:
                return  junior;
            case 1:
                return  senior;
            default:
                return null;
        }
    }
}
