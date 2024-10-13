import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // prvi
        System.out.println("Unesite jedan cijeli broj:");
        int broj = scanner.nextInt();
        int brojZnamenki = 0;
        do {
            broj= broj / 10;
            brojZnamenki ++;
        }
        while (broj > 0 );
        System.out.println("Broj znamenki je: " + brojZnamenki);

    }

}