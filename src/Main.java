import java.util.Scanner;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        class Polaznik {
            private String ime;
            private String prezime;
            private String email;gi

            public Polaznik(String ime, String prezime, String email) {
                this.ime = ime;
                this.prezime = prezime;
                this.email = email;
            }

            public String getIme() {
                return ime;
            }

            public String getPrezime() {
                return prezime;
            }

            public String getEmail() {
                return email;
            }

            @Override
            public String toString() {
                return "Ime: " + ime + ", Prezime: " + prezime + ", Email: " + email;
            }
        }

        class EvidencijaPolaznika {
            public static void main(String[] args) {
                HashMap<String, Polaznik> evidencija = new HashMap<>();
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.println("Odaberite opciju:");
                    System.out.println("1. Dodaj novog polaznika");
                    System.out.println("2. Ispis svih polaznika");
                    System.out.println("3. Izlaz");
                    int opcija = scanner.nextInt();
                    scanner.nextLine(); // Čišćenje buffera

                    switch (opcija) {
                        case 1:
                            // Unos novog polaznika
                            System.out.println("Unesite ime polaznika:");
                            String ime = scanner.nextLine();
                            System.out.println("Unesite prezime polaznika:");
                            String prezime = scanner.nextLine();
                            System.out.println("Unesite email polaznika:");
                            String email = scanner.nextLine();

                            // Provjera jedinstvenosti email adrese
                            if (evidencija.containsKey(email)) {
                                System.out.println("Polaznik s e-mail adresom '" + email + "' već postoji!");
                            } else {
                                Polaznik noviPolaznik = new Polaznik(ime, prezime, email);
                                evidencija.put(email, noviPolaznik);
                                System.out.println("Polaznik uspješno dodan.");
                            }
                            break;

                        case 2:
                            // Ispis svih polaznika
                            if (evidencija.isEmpty()) {
                                System.out.println("Evidencija je prazna.");
                            } else {
                                System.out.println("Lista svih polaznika:");
                                for (Polaznik polaznik : evidencija.values()) {
                                    System.out.println(polaznik);
                                }
                            }
                            break;

                        case 3:
                            // Izlaz iz programa
                            System.out.println("Izlaz iz programa.");
                            scanner.close();
                            return;

                        default:
                            System.out.println("Nepoznata opcija. Pokušajte ponovo.");
                    }
                }
            }
        }
    }
}