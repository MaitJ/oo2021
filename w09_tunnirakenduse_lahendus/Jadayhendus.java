package v1;

import java.awt.*;

public class Jadayhendus extends Hulgiyhendus {

    @Override
    public boolean kasJuhib() {
        for (Voolujuht v : this.hoidla) {
            if (!v.kasJuhib()) {
                return false;
            }
        }
        return true;
    }

    public void draw(Graphics gfx, Rectangle dimensions) {
        int elementNum = this.hoidla.size();
        double sectionSize = (1 / (double) elementNum) * dimensions.width;
        double prevSectionX = 0;
        int i = 1;
        Rectangle curRect = new Rectangle();


        for (Voolujuht v : this.hoidla) {
            System.out.println(i + " of loops");
            curRect.height = dimensions.height;
            curRect.width = (int) (dimensions.width * (sectionSize * i));
            curRect.x = (int) prevSectionX;

            v.draw(gfx, curRect);
            ++i;
            prevSectionX = (sectionSize * i) * dimensions.width;
        }
    }
}
