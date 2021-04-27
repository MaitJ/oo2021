package v1;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawingPanel extends JPanel {
    public ArrayList<Voolujuht> vooluJuhid;

    public DrawingPanel() { this.vooluJuhid = new ArrayList<Voolujuht>(); }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        for (Voolujuht v : this.vooluJuhid) {
            v.draw(g, new Rectangle(getWidth(), getHeight()));
        }

    }

    public void lisaVoolujuht(Voolujuht v) { this.vooluJuhid.add(v);}

}
