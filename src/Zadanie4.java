import java.util.Scanner;
import java.lang.Math;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz ilosc liczb (n): ");
        int n = scanner.nextInt();

        int[] tab = new int[n];
        int max = -1;
        int min = 102;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            tab[i] = (int)(Math.random() * 101);
            System.out.println(tab[i]);
            if (tab[i] > max){
                max = tab[i];
            }
            else if (tab[i] < min){
                min = tab[i];
            }
            sum += tab[i];
        }

        System.out.println("Max - " + max);
        System.out.println("Min - " + min);
        double srednia = (double) sum / n;
        System.out.println("Srednia - " + srednia);

    }
}