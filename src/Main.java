import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // prvi
        System.out.println("Unesite prvi broj:");
        int prviBroj = scanner.nextInt();
        // drugi
        System.out.println("Unesite drugi broj:");
        int drugiBroj = scanner.nextInt();
        System.out.println("Unesite broj za računsku operaciju: 1. zbrajanje, 2. oduzimanje, 3. množenje i 4. djeljenje");
        int odabir = scanner.nextInt();
        switch(odabir) {
            case 1:
                System.out.println("Zbroj brojeva je:" + (prviBroj + drugiBroj));
                break;
            case 2:
                System.out.println("Razlika brojeva je:" + (prviBroj - drugiBroj));
                break;
            case 3:
                System.out.println("Umnožak brojeva je:" + (prviBroj * drugiBroj));
                break;
            case 4:
                System.out.println("Kvocijent brojeva je:" + ((float)prviBroj / drugiBroj));
                break;
            default:
                System.out.println("Niste odabrali broj u rasponu od 1 do 4.");
        }
    }
}