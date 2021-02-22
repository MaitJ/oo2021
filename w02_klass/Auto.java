import java.util.*;
public class Auto {
    private String autoMark;
    private String autoMudel;
    private List<String> valjalaskeAastad;
    private Mootor mootor;

    public Auto(String autoMark, String autoMudel, String[] valjalase, Mootor mootor) {
        this.autoMark = autoMark;
        this.autoMudel = autoMudel;
        this.valjalaskeAastad = new ArrayList<String>();
        
        for (int i = 0; i < valjalase.length; i++) {
            this.valjalaskeAastad.add(valjalase[i]);
        }

        this.mootor = mootor;
    }

    public String autoMark() {
        return this.autoMark;
    }

    public String autoMudel() {
        return this.autoMudel;
    }

    public String mootor() {
        return this.mootor.toString();
    }

    public String valjalaskeAastad() {
        String aastad = "";
        for (int i = 0; i < this.valjalaskeAastad.size(); i++) {
            aastad += this.valjalaskeAastad.get(i);
            aastad += " ";
        }

        return aastad;
    }

    public String toString() {
        return "Auto mark: " + this.autoMark + "\nAuto mudel: " + this.autoMudel + "\nV2ljalaske aastad: " + this.valjalaskeAastad() + "\n" + this.mootor;
    }
}