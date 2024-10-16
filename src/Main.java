import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] brojevi = new int[10];
        int[] parniBrojevi = new int[10];
        int brojac = 0;

        System.out.println("Unesite deset cijelih brojeva:");
        for (int i = 0; i < 10; i++) {
            brojevi[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (brojevi[i] % 2 == 0) {
                parniBrojevi[brojac] = brojevi[i];
                brojac++;
            }
        }
        System.out.println("Parni brojevi su:");
        for (int i = 0; i < brojac; i++) {
            System.out.println(parniBrojevi[i] + "");
        }
    }
}