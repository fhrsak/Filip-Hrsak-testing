package hr.algenra;

public class Kamion extends Vozilo implements ICijenaKarte, IVelikoVozilo
{
    @Override
    public double platiKartu() {
        return 90.0;
    }
}
