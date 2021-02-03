package hr.algenra;

import java.util.Random;

public class RepoVozila {
    private static  Random rnd = new Random();
    public  static IMaloVozilo getMaloVozilo()
    {
       switch (rnd.nextInt(2))
       {

           case 0:
               return  new Auto();
           case 1:
               return  new Kombi();
           default:
               return null;
       }
    }

    public  static IVelikoVozilo getVelikoVozilo()
    {
        switch (rnd.nextInt(2))
        {

            case 0:
                return  new Autobus();
            case 1:
                return  new Kamion();
            default:
                return null;
        }
    }
}
