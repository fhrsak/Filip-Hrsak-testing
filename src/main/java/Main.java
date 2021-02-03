

import hr.algenra.*;

import java.util.List;
import java.util.Random;

public class Main {

    /*
    ***mali vlak - automobil 50, kombi 80 - ima 8 mjesta
    ***veliki vlak - autobus 70,  kamion 90
    ***sva vozila - plin i baterija mora biti iznda 10%
    ***zaposlenik placa 10% karte, zaposelnik placa 10%
     */

    public static void main(String[] args) {
        Random rnd = new Random();
        Vlak mali = new MaliVlak();
        Vlak veliki = new VelikiVlak();
        //kreiraj do 8 malih vozila
        for (int i =1;  i<=rnd.nextInt(20);i++)
        {
            mali.setVozila(RepoVozila.getMaloVozilo());
            veliki.setVozila(RepoVozila.getVelikoVozilo());
        }


        System.out.println("Income malog vlaka: " + mali.getIncome());
        mali.getVozila().forEach(  v ->
                {  System.out.println("---------------------------------------------------");
                   IPlacanje a =  RepoZaposlenik.getZaposlenik();
                   Vozilo t = (Vozilo)v;
                   System.out.println(v.getClass().getSimpleName());
                   System.out.println("Vozilo obraduje  "+ a.getClass().getSimpleName());
                   a.prikupiNovce(((ICijenaKarte)t));
                   ((Zaposlenik)a).servisirajVozilo(t);
                   System.out.println("---------------------------------------------------");

                }

        );

        System.out.println("---------------------------------------------------");
        System.out.println("Income velikog vlaka: " + veliki.getIncome());
        veliki.getVozila().forEach(  v ->
                {
                    System.out.println("---------------------------------------------------");
                    IPlacanje a =  RepoZaposlenik.getZaposlenik();
                    Vozilo t = (Vozilo)v;
                    System.out.println(v.getClass().getSimpleName());
                    System.out.println("Vozilo obraduje  "+ a.getClass().getSimpleName());
                    a.prikupiNovce(((ICijenaKarte)t));
                    ((Zaposlenik)a).servisirajVozilo(t);
                    System.out.println("---------------------------------------------------");
                }
        );

        System.out.println("Placa junior zaposlenika " + RepoZaposlenik.junior.getSallary());
        System.out.println("Placa senior zaposlenika " + RepoZaposlenik.senior.getSallary());

    }
}
