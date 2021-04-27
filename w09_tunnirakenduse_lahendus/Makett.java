package v1;
import java.util.*;

public class Makett extends Hulgiyhendus {
    List<Hulgiyhendus> hoidla;

    public Makett() {
        this.hoidla = new ArrayList<Hulgiyhendus>();
    }

    @Override
    public boolean kasJuhib() {
        for (Hulgiyhendus h : this.hoidla) {
            if (!h.kasJuhib()) {
                return false;
            }
        }

        return true;
    }

}