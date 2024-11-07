import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TekuciRacun tekuciRacun = new TekuciRacun("12345", new BigDecimal(300), "Vlatko");
        tekuciRacun.uplatiSredstva(new BigDecimal(20));
        tekuciRacun.isplatiSredstva(new BigDecimal(10));
        tekuciRacun.obracunKamate();

        StedniRacun stedniRacun = new StedniRacun("6789", new BigDecimal(2000), "Banović");
        stedniRacun.uplatiSredstva(new BigDecimal(20));
        stedniRacun.isplatiSredstva(new BigDecimal(10));
        stedniRacun.obracunKamate();

    }
}