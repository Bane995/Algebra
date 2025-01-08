import java.util.Scanner;
import java.util.TreeSet;

public class Main {
        public static void main(String[] args) {

            TreeSet<String> gradovi = new TreeSet<>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Unesite nazive gradova (za završetak unesite 'kraj'):");
            while (true) {

                String grad = scanner.nextLine();

                if (grad.equalsIgnoreCase("kraj")) break;

                gradovi.add(grad);
            }

            System.out.println("Gradovi u sortiranom redoslijedu:");

            for (String grad : gradovi) {

                System.out.println(grad);
            }

            if (!gradovi.isEmpty()) {

                System.out.println("Prvi grad: " + gradovi.first());

                System.out.println("Zadnji grad: " + gradovi.last());
            }

            System.out.println("Unesite naziv grada koji želite ukloniti:");

            String gradZaBrisanje = scanner.nextLine();

            if (gradovi.remove(gradZaBrisanje)) {

                System.out.println("Grad '" + gradZaBrisanje + "' je uklonjen.");

            } else {

                System.out.println("Grad '" + gradZaBrisanje + "' nije pronađen.");
            }

            System.out.println("Preostali gradovi u sortiranom redoslijedu:");

            for (String grad : gradovi) {

                System.out.println(grad);
            }
            scanner.close();
        }
}
