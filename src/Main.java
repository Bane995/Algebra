import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // prvi
        System.out.println("Unesite jedan cijeli broj:");
        int n = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <=n; i++ ){
        suma = suma + i;
        }
        System.out.println("Suma brojeva je:" + suma);
    }

}