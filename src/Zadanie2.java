import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sprawdze czy podane dlugosci moga zrobic trojkat;p");
        System.out.println("Wpisz bok a: ");
        int a = scanner.nextInt();
        System.out.println("Wpisz bok b: ");
        int b = scanner.nextInt();
        System.out.println("Wpisz bok c: ");
        int c = scanner.nextInt();

        if (a+b>c && b+c>a && c+a>b) {
            if (a * a + b * b > c * c) {
                System.out.println("Da sie stworzyc trojkat. Jest ostrokatny.");
            } else if (a * a + b * b == c * c) {
                System.out.println("Da sie stworzyc trojkat. Jest prostokatny.");
            } else if (a * a + b * b < c * c) {
                System.out.println("Da sie stworzyc trojkat. Jest rozwartokatny.");
            }
        } else {
            System.out.println("Nie da sie stworzyc trojkata ;(");
        }
    }
}