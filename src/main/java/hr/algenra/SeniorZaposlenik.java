package hr.algenra;

public class SeniorZaposlenik extends Zaposlenik implements IPlacanje {
    @Override
    public double prikupiNovce(ICijenaKarte vozilo) {
        setSallary((vozilo.platiKartu() / 100)*10);
        return  vozilo.platiKartu();
    }
}
