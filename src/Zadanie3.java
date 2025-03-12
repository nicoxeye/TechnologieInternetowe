import java.util.Scanner;
import java.lang.Math;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0");

        System.out.println("podaj wspolczynnik a: ");
        double a = scanner.nextInt();
        System.out.println("podaj wspolczynnik b: ");
        double b = scanner.nextInt();
        System.out.println("podaj wspolczynnik c: ");
        double c = scanner.nextInt();

        double delta = b*b - (4*a*c);

        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta))/(2*a);
            double x2 = (-b + Math.sqrt(delta))/(2*a);

            System.out.println("Pierwiastki tego rownania to:");
            System.out.println("x1 - " + Math.round(x1));
            System.out.println("x2 - " + Math.round(x2));
        }
        else if (delta == 0){
            double x0 = (-b)/(2*a);

            System.out.println("Pierwiastek tego rownania to:");
            System.out.println("x0 - " + Math.round(x0));
        }
        else {
            System.out.println("To rownanie nie posiada pierwiastkow.");
        }


    }
}