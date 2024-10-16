import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] brojevi = new int[10];
        int[] parniBrojevi = new int[10];
        int brojacParnih = 0;
        int i = 0;

        System.out.println("Unesite deset cijelih brojeva:");
        while (i < 10) {
            int broj = scanner.nextInt();
            if (broj % 2 == 0) {
                parniBrojevi[brojacParnih] = broj;
                brojacParnih++;
            }
            i++;
        }
        System.out.println("Parni brojevi su:");
        i = 0;
        while (i < brojacParnih) {
            System.out.println(parniBrojevi[i] + "");
            i++;
        }
    }
}