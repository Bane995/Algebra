import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> imena = new ArrayList<>();
    private static ArrayList<String> brojevi = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int izbor;

        do {
            System.out.println("\n1. Dodaj kontakt");
            System.out.println("2. Pretraži po imenu");
            System.out.println("3. Pretraži po broju");
            System.out.println("4. Ispiši sve");
            System.out.println("5. Izlaz");

            while (true) {
                System.out.print("Odaberite opciju: ");
                izbor = scanner.nextInt();
                scanner.nextLine(); // Za hvatanje entera

                if (izbor >= 1 && izbor <= 5) {
                    break;
                } else {
                    System.out.println("Nevažeća opcija. Pokušajte ponovno.");
                }
            }

            switch (izbor) {
                case 1:
                    dodajKontakt(scanner);
                    break;
                case 2:
                    pretraziPoImenu(scanner);
                    break;
                case 3:
                    pretraziPoBroju(scanner);
                    break;
                case 4:
                    ispisiSve();
                    break;
                case 5:
                    System.out.println("Izlaz iz programa...");
                    break;
            }
        } while (izbor != 5);

        scanner.close();
    }

    private static void dodajKontakt(Scanner scanner) {
        System.out.print("Unesite ime: ");
        String ime = scanner.nextLine();
        System.out.print("Unesite broj: ");
        String broj = scanner.nextLine();

        imena.add(ime);
        brojevi.add(broj);
        System.out.println("Kontakt je uspješno dodan.");
    }

    private static void pretraziPoImenu(Scanner scanner) {
        System.out.print("Unesite ime za pretragu: ");
        String ime = scanner.nextLine();

        int index = imena.indexOf(ime);
        if (index != -1) {
            System.out.println("Broj: " + brojevi.get(index));
        } else {
            System.out.println("Kontakt s tim imenom nije pronađen.");
        }
    }

    private static void pretraziPoBroju(Scanner scanner) {
        System.out.print("Unesite broj za pretragu: ");
        String broj = scanner.nextLine();

        int index = brojevi.indexOf(broj);
        if (index != -1) {
            System.out.println("Ime: " + imena.get(index));
        } else {
            System.out.println("Kontakt s tim brojem nije pronađen.");
        }
    }

    private static void ispisiSve() {
        System.out.println("Svi kontakti:");
        for (int i = 0; i < imena.size(); i++) {
            System.out.println(imena.get(i) + " - " + brojevi.get(i));
        }
    }
}