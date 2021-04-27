package v1;
import java.util.*;

public class Sisend implements Lylitatav {
    List<Lylitatav> hoidla;

    public Sisend() {
        this.hoidla = new ArrayList<Lylitatav>();
    }

    public void lisa(Lylitatav l) {
        this.hoidla.add(l);
    }

    public void seisund(boolean sees) {
        for (Lylitatav l : this.hoidla) {
            l.seisund(sees);
        }
    }


}
