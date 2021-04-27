package v1;
import java.awt.*;
import java.util.*;
import java.util.List;

public abstract class Hulgiyhendus implements Voolujuht {
    List<Voolujuht> hoidla;

    public Hulgiyhendus() {
        this.hoidla = new ArrayList<Voolujuht>();
    }

    public void lisa(Voolujuht v) {
        this.hoidla.add(v);
    }

    public abstract boolean kasJuhib();

    public void draw(Graphics gfx, Rectangle dimensions) {

    }
}
