package hr.algenra;

public abstract class Vozilo {
    private double statusBaterije;
    private double statusGoriva;

    public Vozilo()
    {
        setStatusBaterije(Generator.getInstance().nextDouble()*100);
        setStatusGoriva(Generator.getInstance().nextDouble()*100);
    }

    public void napuniGorivo() {
        statusGoriva = 100.0;
    }

    public void napuniBateriju() {
        statusBaterije = 100.0;
    }

    public double getStatusBaterije() {
        return statusBaterije;
    }

    public void setStatusBaterije(double statusBaterije) {
        this.statusBaterije = statusBaterije;
    }

    public double getStatusGoriva() {
        return statusGoriva;
    }

    public void setStatusGoriva(double statusGoriva) {
        this.statusGoriva = statusGoriva;
    }

}
