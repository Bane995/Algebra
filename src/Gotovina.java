public class Gotovina implements Placanje{
    public double placeniIznos = 0;

    @Override
    public void platiti(double iznos) {
        this.placeniIznos += iznos;
    }

    @Override
    public double vratiIznos() {
        return placeniIznos;
    }

    @Override
    public String getDetalje() {
        return "Placanje u gotovini u iznosu od: " + this.vratiIznos() + " EUR.";
    }
}

