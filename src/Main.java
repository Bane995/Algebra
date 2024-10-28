import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite iznos koji je potrebno vratiti: ");

        double kusur = scanner.nextDouble();
        double[] apoeni = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

        List<Double> rezultat = new ArrayList<>();
        for (double apoen : apoeni) {
            while (kusur >= apoen) {
                rezultat.add(apoen);
                kusur -= apoen;
                kusur = Math.round(kusur * 100.0) / 100.0;
            }
        }

        System.out.println("Kusur iznosi: " + rezultat);
        scanner.close();
    }
}