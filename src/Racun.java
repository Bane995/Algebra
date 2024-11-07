import java.math.BigDecimal;

public abstract class Racun {
    public String brojRacuna;
    public BigDecimal stanje;
    public String vlasnik;

    public Racun (String brojRacuna, BigDecimal stanje, String vlasnik){
        this.brojRacuna = brojRacuna;
        this.stanje = stanje;
        this.vlasnik = vlasnik;
    }

    public void uplatiSredstva(BigDecimal iznos){
        this.stanje = this.stanje.add(iznos);
    }

    public void isplatiSredstva(BigDecimal iznos){
        this.stanje = this.stanje.subtract(iznos);
    }

    public abstract void obracunKamate();

}
