package hr.algenra;

public abstract class Zaposlenik implements IPoslovi {
    private double sallary;


    @Override
    public void napuniGorivo(Vozilo vozilo) {
        System.out.println("Status goriva: " + vozilo.getStatusGoriva());
        if (vozilo.getStatusGoriva()<10)
        {
            vozilo.napuniGorivo();
            System.out.println("Novi status goriva: " + vozilo.getStatusGoriva());
        }

    }

    @Override
    public void napuniBateriju(Vozilo vozilo) {
        System.out.println("Status baterije: " + vozilo.getStatusBaterije());
        if (vozilo.getStatusBaterije()<10)
        {
            vozilo.napuniBateriju();
            System.out.println("Novi status baterije: " + vozilo.getStatusBaterije());
        }
    }

    public void setSallary(double amount)
    {
        this.sallary += amount;
    }

    public double getSallary()
    {
        return  sallary;
    }

    public void servisirajVozilo(Vozilo vozilo) {

        napuniBateriju(vozilo);
        napuniGorivo(vozilo);
    }


}
