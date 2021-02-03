package hr.algenra;

import java.util.ArrayList;
import java.util.List;

public abstract class Vlak<T> {
    private List<T> vozila = new ArrayList<>();
    private double income;

    public List<T> getVozila() {
        return vozila;
    }

    public void setVozila(T vozilo) {
        vozila.add(vozilo);
        income += ((ICijenaKarte)vozilo).platiKartu();
    }

    public double getIncome() {
        return income;
    }
}
