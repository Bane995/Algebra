import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite rečenicu:");
        String recenica = scanner.nextLine();
        String[] rijeci = recenica.split("\\s+");

        String najduzaRijec = "";
        int brojRijeci = rijeci.length;
        int duljinaSvihRijeci = 0;

        System.out.println("Riječi duže od 5 slova:");
        for (String rijec : rijeci) {
            if (rijec.length() > 5) {
                System.out.println(rijec);
            }
            if (rijec.length() > najduzaRijec.length()) {
                najduzaRijec = rijec;
            }
            duljinaSvihRijeci += rijec.length();
        }

        double prosjecnaDuljina = brojRijeci > 0 ? (double) duljinaSvihRijeci / brojRijeci : 0;

        System.out.println("Najduža riječ: " + najduzaRijec);
        System.out.printf("Prosječna duljina riječi: %.2f\n", prosjecnaDuljina);

        scanner.close();
    }
}