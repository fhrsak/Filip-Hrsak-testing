package hr.algenra;

public class Kombi  extends Vozilo implements ICijenaKarte, IMaloVozilo{
    @Override
    public double platiKartu() {
        return 80.0;
    }
}
