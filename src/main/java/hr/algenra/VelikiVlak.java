package hr.algenra;

public class VelikiVlak extends Vlak<IVelikoVozilo>{
    private static final int maxVozila = 6;
    private static  int trenutno = 0;

    @Override
    public void setVozila(IVelikoVozilo vozilo) {
        if (maxVozila>=trenutno)
        {
            super.setVozila(vozilo);
            trenutno++;
        }

    }
}