import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz bok 1: ");

        int x = scanner.nextInt();
        while (x < 1) {
            System.out.println("Bok nie moze byc ujemny lub rowny 0");
            x = scanner.nextInt();
        };

        System.out.println("Wpisz bok 2: ");

        int y = scanner.nextInt();
        while (y < 1) {
            System.out.println("Bok nie moze byc ujemny lub rowny 0");
            y = scanner.nextInt();
        };

        int pole_p = x * y;
        System.out.print("Pole powierzchni rowna sie: " + pole_p);
    }
}