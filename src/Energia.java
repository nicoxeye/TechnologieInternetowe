public class Energia {
    private double poczatkowa_energia;
    private double biezaca_energia;

    public Energia(double poczatkowa_energia, double biezaca_energia) {
        this.poczatkowa_energia = poczatkowa_energia;
        this.biezaca_energia = biezaca_energia;
    }

    public double getPoczatkowa_energia() {
        return poczatkowa_energia;
    }

    public double getBiezaca_energia() {
        return biezaca_energia;
    }

    public double oblicz_zuzycie(){
        return biezaca_energia - poczatkowa_energia;
    }

    public void setBiezaca_energia(double biezaca_energia) {
        this.biezaca_energia = biezaca_energia;
    }

    public void setPoczatkowa_energia(double poczatkowa_energia) {
        this.poczatkowa_energia = poczatkowa_energia;
    }
}
