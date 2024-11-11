public class KreditnaKartica implements Placanje{
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
        return "Placanje putem kreditne kartice u iznosu od: " + this.vratiIznos() + " EUR.";
    }
}
