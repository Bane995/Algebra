import java.io.*;
import java.util.*;

public class Knjiznica implements KnjigaOperacije {

    public List<Clan> clanovi;
    public List<String> dostupneKnjige;


    public Knjiznica() {
        clanovi = new ArrayList<>();
        dostupneKnjige = new ArrayList<>();

    }
    public void dodajClana(Clan clan) {
        clanovi.add(clan);

    }

    public void dodajKnjigu(String naslov) {
        dostupneKnjige.add(naslov);

    }
    @Override

    public void posudiKnjigu(String naslov, Clan clan) {

        if (dostupneKnjige.contains(naslov)) {
            dostupneKnjige.remove(naslov);
            clan.dodajKnjigu(naslov);
            System.out.println("Knjiga '" + naslov + "' posuđena članu: " + clan.getIme());

        } else {
            System.out.println("Knjiga '" + naslov + "' nije dostupna.");
        }

    }

    @Override

    public void vratiKnjigu(String naslov, Clan clan) {

        if (clan.getPosudjeneKnjige().contains(naslov)) {
            clan.ukloniKnjigu(naslov);
            dostupneKnjige.add(naslov);
            System.out.println("Knjiga '" + naslov + "' vraćena u knjižnicu.");

        } else {
            System.out.println("Knjiga '" + naslov + "' nije posuđena od strane člana: " + clan.getIme());

        }

    }

    public void ispisiPodatkeUDatoteke() {
        try (PrintWriter tvrtkaWriter = new PrintWriter("tvrtka.txt");
             PrintWriter clanoviWriter = new PrintWriter("clanovi.txt")) {

            tvrtkaWriter.println("Stanje knjižnice:");
            tvrtkaWriter.println("Dostupne knjige: " + dostupneKnjige);
            tvrtkaWriter.println("Članovi: ");

            for (Clan clan : clanovi) {
                tvrtkaWriter.println("- " + clan);

            }

            for (Clan clan : clanovi) {
                clanoviWriter.println(clan);
                clanoviWriter.println("Posuđene knjige: " + clan.getPosudjeneKnjige());
                clanoviWriter.println();

            }

            System.out.println("Podaci uspješno zapisani u datoteke.");

        } catch (IOException e) {
            System.out.println("Pogreška prilikom zapisivanja u datoteku: " + e.getMessage());

        }
    }
}