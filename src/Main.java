import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Knjiznica knjiznica = new Knjiznica();

            Scanner scanner = new Scanner(System.in);

            knjiznica.dodajKnjigu("1984");
            knjiznica.dodajKnjigu("Ponos i predrasude");
            knjiznica.dodajKnjigu("Mali princ");

            System.out.println("Unesite broj članova:");
            int brojClanova = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < brojClanova; i++) {
                System.out.println("Unesite ime člana:");
                String ime = scanner.nextLine();
                System.out.println("Unesite prezime člana:");
                String prezime = scanner.nextLine();
                System.out.println("Unesite članski broj:");
                int clanskiBroj = scanner.nextInt();
                scanner.nextLine();

                Clan clan = new Clan(ime, prezime, clanskiBroj);
                knjiznica.dodajClana(clan);
            }
            System.out.println("Unesite ime člana koji posuđuje knjigu:");
            String imeClana = scanner.nextLine();
            Clan odabraniClan = knjiznica.clanovi.stream()
                    .filter(clan -> clan.getIme().equalsIgnoreCase(imeClana))
                    .findFirst().orElse(null);

            if (odabraniClan != null) {
                System.out.println("Unesite naslov knjige za posudbu:");
                String naslovKnjige = scanner.nextLine();
                knjiznica.posudiKnjigu(naslovKnjige, odabraniClan);
                System.out.println("Unesite naslov knjige za vraćanje:");
                String naslovZaVracanje = scanner.nextLine();
                knjiznica.vratiKnjigu(naslovZaVracanje, odabraniClan);
            } else {
                System.out.println("Član nije pronađen.");
            }

            knjiznica.ispisiPodatkeUDatoteke();
            scanner.close();
        }
}
