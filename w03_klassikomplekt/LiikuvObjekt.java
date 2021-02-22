import java.util.ArrayList;
public class LiikuvObjekt {
    public Vektor asukoht;
    public Vektor kiirus;

    public LiikuvObjekt(double x, double y, double dx, double dy) {
        this.asukoht = new Vektor(x, y);
        this.kiirus = new Vektor(dx, dy);
    }
    public LiikuvObjekt(double x, double y) {
        this(x, y, 0, 0);
    }
    public void liigu(double sek) {
        this.asukoht.liidaJuurde(kiirus.korruta(sek));
    }

    public double kaugusObjektist(LiikuvObjekt obj) {
        Vektor asukoht1 = obj.asukoht;
        Vektor asukoht2 = this.asukoht;
        Vektor liikumisVektor = new Vektor((asukoht1.x - asukoht2.x), (asukoht1.y - asukoht2.y));
        double kaugus = Math.sqrt(Math.abs(Math.pow(liikumisVektor.x, 2) + Math.pow(liikumisVektor.y, 2)));
        return kaugus;
    }

    public boolean ristuvad(LiikuvObjekt obj) {
        if (this.asukoht.x == obj.asukoht.x && this.asukoht.y == obj.asukoht.y) {
            return true;
        } else {
            return false;
        }
    }

    public void liigu() {
        liigu(1);
    }
    public String toString() {
        return this.asukoht.toString() + "-" + this.kiirus.toString();
    }
}