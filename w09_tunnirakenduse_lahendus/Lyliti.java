package v1;

import javax.swing.*;
import java.awt.*;

public class Lyliti implements Lylitatav, Voolujuht {
    boolean seisund;

    public Lyliti() {
        this.seisund = false;
    }

    @Override
    public void seisund(boolean sees) {
        this.seisund = sees;
    }

    public boolean kasJuhib() {
        return this.seisund;
    }

    public void draw(Graphics gfx, Rectangle dimensions) {
        System.out.println("Height: " + dimensions.height + " Width: " + dimensions.width);

        if (!seisund) {
            gfx.drawLine(dimensions.x, dimensions.height / 2,
                    (int) (dimensions.x + (dimensions.width * 0.33)),
                    dimensions.height / 2);
            gfx.drawLine((int) (dimensions.x + (dimensions.width * 0.33)), dimensions.height / 2,
                    dimensions.x + (dimensions.width / 2), (int) (dimensions.x + (dimensions.width * 0.2)));
            gfx.drawLine((int) (dimensions.x + (dimensions.width * 0.7)),
                    dimensions.height / 2, dimensions.x + dimensions.width, dimensions.height / 2);
        } else {
            gfx.drawLine(dimensions.x, dimensions.height / 2, dimensions.x + dimensions.width, dimensions.height / 2);
        }

    }
}
