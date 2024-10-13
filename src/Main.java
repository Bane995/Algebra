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
        // rezultat
        System.out.println("Zbroj brojeva je: " + (prviBroj + drugiBroj));
        System.out.println("Razlika brojeva je: " + (prviBroj - drugiBroj));
        System.out.println("Umnožak brojeva je: " + (prviBroj * drugiBroj));
        System.out.println("Kvocijent brojeva je: " + ((float)prviBroj / drugiBroj));
    }
}