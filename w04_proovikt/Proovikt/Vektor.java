public class Vektor {
    int x, y;

    public Vektor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vektor(Vektor vektor) {
        this.x = vektor.x;
        this.y = vektor.y;
    }

    public double kaugusPunktist(Vektor vektor) {
        Vektor liikumisVektor = new Vektor((vektor.x - this.x), (vektor.y - this.y));
        return Math.abs(Math.sqrt((Math.pow(liikumisVektor.x, 2) + Math.pow(liikumisVektor.y, 2))));
    }


}