import java.util.ArrayList;
public class Hulknurk {
    ArrayList<Vektor> nurgad;

    public Hulknurk(Vektor[] koordinaadid) {
        this.nurgad = new ArrayList<Vektor>();

        for (Vektor obj : koordinaadid) {
            this.nurgad.add(obj);
        }

    }

    public void lisaNurk(Vektor nurk) {
        this.nurgad.add(nurk);
    }

    public String toString() {
        String result = "";
        for (Vektor nurk : this.nurgad) {

            result += nurk.x + ";" + nurk.y + "\n";
        }

        return result;
    }
    
    public Vektor[] getVektorid() {
        Vektor[] vektorid = new Vektor[this.nurgad.size()];
        for (int i = 0; i < this.nurgad.size(); i++) {
            vektorid[i] = this.nurgad.get(i);
        }
        return vektorid;
    }

    public double ymbermoot() {
        Vektor esimeneNurk = new Vektor(this.nurgad.get(0));
        double ymbermoot = 0;
        for (int i = 0; i < (this.nurgad.size() - 1); i++) {
            ymbermoot += this.nurgad.get(i).kaugusPunktist(this.nurgad.get(i + 1));
        }
        ymbermoot += this.nurgad.get(this.nurgad.size() - 1).kaugusPunktist(esimeneNurk);
        return ymbermoot;
    }

}