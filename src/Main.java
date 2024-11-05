import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Polaznik polaznik1 = new Polaznik("Matej","Lelek");
        Polaznik polaznik2 = new Polaznik("Marko","Markić",25, "M" );
        Polaznik polaznik3 = new Polaznik();

        polaznik2.promjeniDob(26);
        polaznik3.promjeniIme("Luka");
        polaznik3.promjeniPrezime("Lučić");

        System.out.println(polaznik1.dohvatiIme() + " " + polaznik1.dohvatiPrezime());
    }
}