
public class Zadanie7 {
    public static void main(String[] args) {
        Energia energia = new Energia(5, 15);

        System.out.println(energia.getPoczatkowa_energia());
        System.out.println(energia.getBiezaca_energia());

        System.out.println(energia.oblicz_zuzycie());

    }
}