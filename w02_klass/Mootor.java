import java.util.*;
public class Mootor {
    private String mootoriKood;
    private List<String> valjalaskeAastad;
    private double kw, hp;

    public Mootor(String mootoriKood, String[] valjalase, double kw) {
        this.mootoriKood = mootoriKood;
        this.valjalaskeAastad = new ArrayList<String>();

        for (int i = 0; i < valjalase.length; i++) {
            this.valjalaskeAastad.add(valjalase[i]);
        }

        this.kw = kw;
        this.toHp();
    }

    public String valjalaskeAastad() {
        String aastad = "";
        for (int i = 0; i < this.valjalaskeAastad.size(); i++) {
            aastad += this.valjalaskeAastad.get(i);
            aastad += " ";
        }

        return aastad;
    }

    public void lisaValjalaskeAasta(String valjalaskeAasta) {
        this.valjalaskeAastad.add(valjalaskeAasta);
    }

    private void toHp() {
        this.hp = Math.round(this.kw / 0.745699872);
    }

    public String toString() {
        return "Mootor: " + this.mootoriKood + "\nValjalaske aastad: " + this.valjalaskeAastad() + "\nkw/hp: " + this.kw + "/" + this.hp;
    }

    
}