package v1;
import java.awt.*;
import java.util.*;

public class Roopyhendus extends Hulgiyhendus {
    @Override
    public boolean kasJuhib() {
        int kasJuhibCounter = 0;

        for (Voolujuht v : this.hoidla) {
            if (v.kasJuhib()) {
                kasJuhibCounter++;
            }
        }

        return kasJuhibCounter > 0;
    }

    public void draw(Graphics gfx, Rectangle dimensions) {

    }
}

