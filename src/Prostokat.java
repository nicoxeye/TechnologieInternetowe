public class Prostokat {
    private double a;
    private double b;
    private double pole = 0;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    static void przypisz_pole(Prostokat p) {
        p.pole = p.a * p.b;
    }

    static void wyswietl_info(Prostokat p) {
        System.out.println("Bok a: " + p.a);
        System.out.println("Bok b: " + p.b);
        System.out.println("Pole: " + p.pole);
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

}
