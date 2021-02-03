package hr.algenra;

import java.util.List;

public class MaliVlak extends Vlak<IMaloVozilo> {
     private static final int maxVozila = 8;
     private static  int trenutno = 0;

    @Override
    public void setVozila(IMaloVozilo vozilo) {
        if (maxVozila>=trenutno)
        {
            super.setVozila(vozilo);
            trenutno++;
        }

    }
}
