public class Vektor {
    double x, y;

    public Vektor(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void liidaJuurde(Vektor v) {
        this.x += v.x; this.y += v.y;
    }
    public Vektor korruta(double koef) {
        return new Vektor(x * koef, y * koef);
    }
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}