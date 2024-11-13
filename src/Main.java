import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int broj = 0;

            while (true) {
                System.out.print("Unesite cijeli broj: ");
                try {
                    broj = scanner.nextInt();
                    if (broj < 0) {
                        System.out.println("Faktorijel nije definiran za negativne brojeve. Molim pokušajte ponovno.");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Pogrešan unos. Molim unesite cijeli broj.");
                    scanner.next();
                }
            }


            try {
                long faktorijel = izracunajFaktorijel(broj);
                System.out.println("Faktorijel broja " + broj + " je: " + faktorijel);
            } catch (ArithmeticException e) {
                System.out.println("Došlo je do pogreške prilikom računanja faktorijela: " + e.getMessage());
            }

            scanner.close();
        }

        public static long izracunajFaktorijel(int broj) throws ArithmeticException {
            long faktorijel = 1;
            for (int i = 1; i <= broj; i++) {
                faktorijel = Math.multiplyExact(faktorijel, i);
            }
            return faktorijel;
        }
}