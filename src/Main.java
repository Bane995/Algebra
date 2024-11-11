import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Unos iznosa
        System.out.println("Unesite iznos koji želite uplatiti.");
        double iznos = scanner.nextDouble();
        // Odabir metode placanja
        System.out.println("Unesite broj za odabir metode plaćanja: 1. Kreditna kartica, 2. Gotovina, 3. Paypal");
        int odabirMetode = scanner.nextInt();
        Placanje placanje = null;
        switch (odabirMetode){
            case 1:
                placanje = new KreditnaKartica();
                break;
            case 2:
                placanje = new Gotovina();
                break;
            case 3:
                placanje = new PayPal();
                break;
        }
        if(placanje != null) {
            placanje.platiti(iznos);
            System.out.println(placanje.getDetalje());
        }
        else {
            System.out.println("Niste odabrali valjanu opciju plaćanja");
        }
    }
}