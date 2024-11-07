import java.math.BigDecimal;

public class StedniRacun extends Racun {

    public StedniRacun(String brojRacuna, BigDecimal stanje, String vlasnik) {
        super(brojRacuna, stanje, vlasnik);
    }

    public void obracunKamate() {
        System.out.println("Trenutno stanje računa iznosi: " + this.stanje);
        BigDecimal iznosKamate = this.stanje.multiply(BigDecimal.valueOf( 1.5/ 100));
        System.out.println("Iznos kamate iznosi: " + iznosKamate);
        BigDecimal iznosUzKamatu = this.stanje.add(iznosKamate);
        System.out.println("Trenutno stanje računa nakon obračuna kamate iznosi: " + iznosUzKamatu);
    }


}
