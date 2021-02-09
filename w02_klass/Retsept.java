import java.util.*;
public class Retsept {

    Hashtable<String, Double> ained;
    
    public Retsept() {
        this.ained = new Hashtable<String, Double>();
    }

    public Set kysiAinenimed() { return this.ained.keySet();}

    public Hashtable<String, Double> kysiAined() { return this.ained;}

    public void lisa(String aine, double kogus) {
        if (this.ained.containsKey(aine)) {
            double algkogus = this.ained.get(aine);
            this.ained.put(aine, (algkogus + kogus));
            //throw new RuntimeException(aine + " juba olemas, lisan kogust juurde");
        } else {
            this.ained.put(aine, kogus);
        }

    }

    public double kogumass() {
        double summa = 0;

        for (double kogus : this.ained.values()) {
            summa += kogus;
        }

        return summa;
    }

    public Retsept koopia(double koef) {
        Retsept uus = new Retsept();

        for (String aine: this.ained.keySet()) {
            uus.lisa(aine, (this.ained.get(aine) * koef));
        }

        return uus;
    }

    public Retsept soovitudMassigaKoopia(double grammid) {
        double koef = grammid / this.kogumass();
        return koopia(koef);
    }
}